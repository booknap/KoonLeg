package code;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import static code.Main.newScreen;

public class ScoreBoardController {

    @FXML
    Label labelScore;

    @FXML
    ImageView bg;


    public void initialize(){
        int score = InGameController.count;
        labelScore.setText(String.valueOf(score));
    }

    public void handleQuit(){
        System.exit(0);
    }

    public void handleTryAgain(){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/HomeUI.fxml"));

        newScreen("Multiply Game", loader);
        getStage().close();
    }

    public Stage getStage(){
        return (Stage) labelScore.getScene().getWindow();
    }
}
