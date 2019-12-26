package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddProductController implements Initializable {

    @FXML
    private JFXComboBox<String> TypeCombo;
    @FXML
    private JFXComboBox<String> CategoryCombo;
    @FXML
    private JFXTextField designation;
    @FXML
    private JFXTextArea description;
    @FXML
    private JFXTextField buyingPrice;
    @FXML
    private JFXTextField minimumInStock;
    @FXML
    private JFXButton addBtn;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        CategoryCombo.getItems().addAll("1","2");
//        TypeCombo.getItems().addAll("Simple","Packed");
    }

    public static void displayAddProduct() throws IOException {
        Stage window = new Stage();
        Parent root = FXMLLoader.load(AddProductController.class.getResource("AddProduct.fxml"));
        System.out.println("After root loaded " + root);
        Scene scene = new Scene(root);

        window.initModality(Modality.APPLICATION_MODAL);  // freeze other windows untill this is fineshed
        window.setTitle("Add Product");
        window.setScene(scene);
        window.showAndWait();
    }


}
