package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

//    JFXButton productMgBtn, stockMgBtn ,addProductBtn ;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setTitle("Inventory Management");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
