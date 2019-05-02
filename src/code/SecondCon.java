package code;

import javafx.event.ActionEvent;
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
    Label questionLabel;

    private Question question;
    private int multiplicand;
    private int count = 0;

    public void initialize(){
        this.multiplicand = FirstCon.multiplicand;
        QuestionBuilder q = QuestionBuilder.getInstance();
        question = q.bulidQuestion();

        setNewQuestion(multiplicand);
        updateScore(count);
    }

    public void handleEnter(ActionEvent event){
        int ans = 0;

        Object source = event.getSource();
        if (source instanceof Button){
            Button b = (Button) source;
            ans = Integer.parseInt(b.getText());
        }

        if(question.check(ans)) {
            count++;
            updateScore(count);
        }
        setNewQuestion(multiplicand);
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

    private void updateNewQuestion(String quest, int ans1, int ans2, int ans3, int ans4){
        button1.setText(String.valueOf(ans1));
        button2.setText(String.valueOf(ans2));
        button3.setText(String.valueOf(ans3));
        button4.setText(String.valueOf(ans4));

        questionLabel.setText(quest);
    }

    private void setNewQuestion(int num){
        question.setX(num);
        String quiz = String.format("%d X %d", question.getX(), question.getY());
        question.setChoice();

        updateNewQuestion(quiz, question.getChoice(0), question.getChoice(1), question.getChoice(2),question.getChoice(3));

    }
}
