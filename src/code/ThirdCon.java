package code;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ThirdCon {

    @FXML
    Label labelScore;

    public void initialize(){
        int score = SecondCon.count;
        labelScore.setText(String.valueOf(score));
    }

    public void handleQuit(){
        getStage().close();
    }

    public void handleTryAgain(){

        try {
            Parent root = FXMLLoader.load(getClass().getResource("FirstUI.fxml"));
            Scene thirdScene = new Scene(root);

            // New window (Stage)
            Stage stage = new Stage();

            stage.setScene(thirdScene);
            stage.setTitle("Multiply Game");
            stage.setResizable(false);
            stage.sizeToScene();

            // Specifies the modality for new window.
            stage.initModality(Modality.WINDOW_MODAL);


            stage.show();
        }catch (IOException e){
            System.out.println("Can not open ThirdUI.fxml");
        }

        getStage().close();

    }

    public Stage getStage(){
        return (Stage) labelScore.getScene().getWindow();
    }
}
