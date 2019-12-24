package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainContentController implements Initializable {
    @FXML
    private DashboardController dashboardController;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }



    @FXML
    private Label text1;
    @FXML
    private AnchorPane mainContent;

    public String getText1(){
        return text1.getText();
    }

    public AnchorPane anchorPane(){
        return this.mainContent;
    }

    public void parent(){
        System.out.println(mainContent.getScene().getRoot()) ;
    }




}
