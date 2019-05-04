package code;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.Iterator;
import java.util.Map;

import static code.Main.newScreen;

public class HomeController {
    @FXML
    ImageView background;
    @FXML
    Label label2;
    @FXML
    Label label3;
    @FXML
    Label label4;
    @FXML
    Label label5;
    @FXML
    Label label6;
    @FXML
    Label label7;
    @FXML
    Label label8;
    @FXML
    Label label9;
    @FXML
    Label label10;
    @FXML
    Label label11;
    @FXML
    Label label12;



    public static int multiplicand;
    public static GameHighscoreBoard highscore = new GameHighscoreBoard();

    public void initialize(){
        Image background = new Image(getClass().getResourceAsStream("/bg.jpg"));
        this.background.setImage(background);
        setHighscore();
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

    public void setHighscore(){
        Iterator it = highscore.getScoreMap().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            int key = (int) pair.getKey();
            int value = (int) pair.getValue();
            switch (key){
                case 2:
                    label2.setText(String.valueOf(value));
                    break;
                case 3:
                    label3.setText(String.valueOf(value));
                    break;
                case 4:
                    label4.setText(String.valueOf(value));
                    break;
                case 5:
                    label5.setText(String.valueOf(value));
                    break;
                case 6:
                    label6.setText(String.valueOf(value));
                    break;
                case 7:
                    label7.setText(String.valueOf(value));
                    break;
                case 8:
                    label8.setText(String.valueOf(value));
                    break;
                case 9:
                    label9.setText(String.valueOf(value));
                    break;
                case 10:
                    label10.setText(String.valueOf(value));
                    break;
                case  11:
                    label11.setText(String.valueOf(value));
                    break;
                case 12:
                    label12.setText(String.valueOf(value));
                    break;
            }
        }
    }

    public Stage getStage(){
        return (Stage) background.getScene().getWindow();
    }
}
