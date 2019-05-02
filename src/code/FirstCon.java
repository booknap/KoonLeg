package code;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstCon {
    @FXML
    Button button2;

    public void handleEnter(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("SecondUI.fxml"));
            Scene secondScene = new Scene(root);

            // New window (Stage)
            Stage stage = new Stage();

            stage.setScene(secondScene);
            stage.setTitle("Multiply Game");
            stage.setResizable(false);
            stage.sizeToScene();

            // Specifies the modality for new window.
            stage.initModality(Modality.WINDOW_MODAL);


            stage.show();
        }catch (IOException e){
            System.out.println("Can not open SecondUI.fxml");
        }

        getStage().close();

    }
    public Stage getStage(){
        return (Stage) button2.getScene().getWindow();
    }
}
