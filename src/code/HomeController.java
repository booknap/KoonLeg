package code;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import static code.Main.newScreen;

public class HomeController {
    @FXML
    ImageView bg;

    public static int multiplicand;

    public void initialize(){
        Image background = new Image(getClass().getResourceAsStream("/bg.jpg"));
        bg.setImage(background);
    }


    public void handleEnter(ActionEvent event){
        Object source = event.getSource();
        if (source instanceof Button){
            Button b = (Button) source;
            multiplicand = Integer.parseInt(b.getText());
        }

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/InGameUI.fxml"));

        newScreen("Multiply Game", loader);
        getStage().close();

    }

    public Stage getStage(){
        return (Stage) bg.getScene().getWindow();
    }
}
