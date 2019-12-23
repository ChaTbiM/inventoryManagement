package sample;

import com.jfoenix.controls.JFXButton;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    static JFXButton button;
    static Stage alertBoxStage;
    static Scene scene;

    public static void display(String title , String Message){
        alertBoxStage = new Stage();

        button = new JFXButton();
        button.setText(Message);
        button.setOnAction(e->alertBoxStage.close());


        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        scene = new Scene(layout,400,400);



        alertBoxStage.initModality(Modality.APPLICATION_MODAL);  // freeze other windows untill this is fineshed
        alertBoxStage.setTitle(title);
        alertBoxStage.setScene(scene);
        alertBoxStage.showAndWait();
    }
}
