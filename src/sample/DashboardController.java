package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void productManagementBtn(ActionEvent event){

        SimpleProduct simpleP = new SimpleProduct("keyboard",700,5,2);
        simpleP.insert();
        System.out.println("Clicked PRoduct MAnagement");

    }
}
