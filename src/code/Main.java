package code;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/HomeUI.fxml"));

        newScreen("Multiply Game", loader);
    }

    public static void newScreen(String title, FXMLLoader loader){

        try {
            Parent root = loader.load();
            Scene scene = new Scene(root);

            // New window (Stage)
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.setTitle(title);
            stage.setResizable(false);
            stage.sizeToScene();
            stage.setOnCloseRequest(e -> System.exit(0));

            // Specifies the modality for new window.
            stage.initModality(Modality.WINDOW_MODAL);


            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
