package code;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Random;

public class SecondCon {
    @FXML
    Button button1;

    @FXML
    Button button2;

    @FXML
    Button button3;

    @FXML
    Button button4;

    @FXML
    Label timer;

    @FXML
    Label score;

    @FXML
    Label question;

    public void handleEnter(){
        Random r = new Random();
        int num = r.nextInt(50);

        updateNewQuestion("3 x 4", r.nextInt(50), r.nextInt(50), r.nextInt(50), r.nextInt(50));
    }

    public void updateTimer(int second){
        String stringTime = String.valueOf(second);
        timer.setText(stringTime);
    }

    public void timeOut(){

    }

    public void updateScore(int sc){
        String stringTime = String.valueOf(sc);
        score.setText(stringTime);
    }

    public void updateNewQuestion(String quest, int ans1, int ans2, int ans3, int ans4){
        button1.setText(String.valueOf(ans1));
        button2.setText(String.valueOf(ans2));
        button3.setText(String.valueOf(ans3));
        button4.setText(String.valueOf(ans4));

        question.setText(quest);
    }
}