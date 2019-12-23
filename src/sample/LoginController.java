package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public LoginModel loginModel = new LoginModel();

    @FXML
    private Label isConnected;
    @FXML
    private TextField TextUserName;
    @FXML
    private PasswordField TextPassword;
    @FXML
    private Button loginBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(loginModel.isDbConnected()){
            isConnected.setText("Connected");
        }else if (!loginModel.isDbConnected()) {
            isConnected.setText("Not Connected");
        }


//        try {
//            loginModel.authorized("admin","admin");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Error");
//        }

    }

    public void login(ActionEvent event)  {
        try {
            if(loginModel.authorized(TextUserName.getText(), TextPassword.getText())){
                isConnected.setText("Welcome Admin");
                System.out.println(loginBtn.getScene());


                Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
                Stage stage = (Stage) loginBtn.getScene().getWindow();
                Scene scene = new Scene(root);

                stage.setScene(scene);
            }else{
                isConnected.setText("Wrong Username or Password");
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }


}
