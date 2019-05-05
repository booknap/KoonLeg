package code;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import static code.Main.newScreen;

public class InGameController {
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

    @FXML
    ImageView bg;


    private Question question;
    private int multiplicand;

    public static int count;

    public void initialize() {
        count = 0;
        this.multiplicand = HomeController.multiplicand;
        QuestionBuilder q = QuestionBuilder.getInstance();
        question = q.bulidQuestion();

        setNewQuestion(multiplicand);
        updateScore(count);

        GameTimer gameTimer = new GameTimer();
        gameTimer.countDown(() -> {
            Platform.runLater(() -> {
                if(gameTimer.getTime() == 0) timeOut();

                String time = Integer.toString(gameTimer.getTime());
                timer.setText(time);
            });
        });
    }

    public void handleEnter(ActionEvent event) {
        int ans = 0;

        Object source = event.getSource();
        if (source instanceof Button) {
            Button b = (Button) source;
            ans = Integer.parseInt(b.getText());
        }

        if (question.check(ans)) {
            count++;
        }else count--;
        updateScore(count);

        setNewQuestion(multiplicand);
    }

    public void timeOut() {
        HomeController.highscore.addScore(multiplicand, count);
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/ScoreBoardUI.fxml"));

        newScreen("Multiply Game", loader);
        getStage().close();

    }

    public Stage getStage() {
        return (Stage) button1.getScene().getWindow();
    }

    public void updateScore(int sc) {
        String stringTime = String.valueOf(sc);
        score.setText(stringTime);
    }

    private void updateNewQuestion(String quest, int ans1, int ans2, int ans3, int ans4) {
        button1.setText(String.valueOf(ans1));
        button2.setText(String.valueOf(ans2));
        button3.setText(String.valueOf(ans3));
        button4.setText(String.valueOf(ans4));

        questionLabel.setText(quest);
    }

    private void setNewQuestion(int num) {
        question.setX(num);
        String quiz = String.format("%d X %d", question.getX(), question.getY());
        question.setChoice();

        updateNewQuestion(quiz, question.getChoice(0), question.getChoice(1), question.getChoice(2), question.getChoice(3));

    }
}
