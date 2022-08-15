import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class mainAdmin extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Alternative Banking System Interface");

        Parent load = FXMLLoader.load(getClass().getResource("/controllers/AdminLogin.fxml"));
        Scene scene = new Scene(load, 1200, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    public static void main(String[]args) {
        launch(args);
    }

}
