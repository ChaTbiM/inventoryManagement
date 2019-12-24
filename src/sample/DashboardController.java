package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private MainContentController mainContentController;

    @FXML
    private AnchorPane dashboard;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("MainContent.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        dashboard.getChildren().add(root);
    }


    //        SimpleProduct simpleP = new SimpleProduct("keyboard",700,5,2);
////        simpleP.insert();
    public void productManagementBtn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ProductManagement.fxml"));

        dashboard.getChildren().remove(dashboard.lookup("#mainContent"));
        dashboard.getChildren().add(root);
    }



}
