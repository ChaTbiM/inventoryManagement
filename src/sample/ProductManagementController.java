package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ProductManagementController implements Initializable {

    @FXML
    TableView<SimpleProductModel> table;
    @FXML
    TableColumn <SimpleProductModel,Integer> col_id;
    @FXML
    TableColumn <SimpleProductModel,Integer> col_reference;

    @FXML
    TableColumn <SimpleProductModel,Integer> col_minimumInStock;

    @FXML
    TableColumn <SimpleProductModel,Integer> col_quantity;

    ObservableList<SimpleProductModel> productsList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ResultSet rs = null;
        Connection conn = SqliteConnection.getConnection();
        try {
            rs = conn.createStatement().executeQuery("select * from product");
            while(rs.next()){
                productsList.add(new SimpleProductModel(rs.getInt("id"),rs.getString("designation"),rs.getFloat("buying_price"),
                        rs.getInt("minimum_in_stock"),rs.getInt("category")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }



        col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        col_reference.setCellValueFactory(new PropertyValueFactory<>("reference"));
        col_minimumInStock.setCellValueFactory(new PropertyValueFactory<>("minimumInStock"));
        col_quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));


        table.setItems(productsList);
        System.out.println("done");
    }

    public void addProductBtn() throws IOException {
        AddProductController.displayAddProduct();

    }


}
