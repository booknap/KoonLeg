package code;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ConsoleTest {

//    int secondsPassed = 0;
//    Timer myTimer = new Timer();
//    TimerTask task = new TimerTask() {
//        @Override
//        public void run() {
//            secondsPassed++;
//            System.out.println(secondsPassed);
//        }
//    };
//
//    public void start() {
//        myTimer.scheduleAtFixedRate(task, 1000, 1000);
//    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QuestionBuilder q = QuestionBuilder.getInstance();
        Question question = q.bulidQuestion();
        for (int i = 0; i < 10; i++) {
            question.setX(2);
            System.out.printf("%d) %d X %d\n", i + 1, question.getX(), question.getY());
            question.setChoice();
            for (int j = 0; j < 4; j++) {
                System.out.printf(" %d. %d\n", j + 1, question.getChoice(j));
            }
            if(question.check(sc.nextInt())) {
                System.out.println("Correct");
            } else {
                System.out.println("Wrong");
            }

        }

    }
}
