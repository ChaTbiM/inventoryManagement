import com.jfoenix.controls.JFXButton;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    JFXButton productMg, stockMg ;
    Text text;
    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Menu Principal");
        productMg = new JFXButton();
        productMg.setText("Gestion d 'article");

        stockMg = new JFXButton();
        stockMg.setText("Gestion de Stock");

        text = new Text("Hello");

        GridPane gridPane = new GridPane ();
//        layout.getChildren().add(productMg);
//        layout.getChildren().add(stockMg);
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        gridPane.setVgap(25);
        gridPane.setHgap(5);

        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(productMg,0,0);
        gridPane.add(stockMg,0,1);

//        gridPane.add(text,1,1);

        gridPane.setGridLinesVisible(true);
        Scene scene = new Scene(gridPane);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
