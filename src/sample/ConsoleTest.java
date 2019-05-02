package sample;

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

//        ConsoleTest c = new ConsoleTest();
//        c.start();
//
        Scanner sc = new Scanner(System.in);
//        int input = 5;
//        int multiplier = 12;
//        Question q = new Question(input,multiplier);
//        System.out.printf("%d x %d\n", input, multiplier);
//        q.setChoice();
//        for(int i = 0; i < 4; i++) {
//            System.out.printf("%d) %d\n", i+1, q.getChoice(i));
//        }
//        if(q.getAnswer() == sc.nextInt()) {
//            System.out.println("Correct");
//        } else {
//            System.out.println("Wrong");
//        }
        QuestionBuilder q = QuestionBuilder.getInstance();
        Question question = q.bulidQuestion();

        for (int i = 0; i < 10; i++) {
            int y = 2 + (int) (Math.random() * (12 - 2));
            question.setXY(2, y);
            System.out.printf("%d) %d X %d\n", i + 1, question.getX(), question.getY());
            question.setChoice();
            for (int j = 0; j < 4; j++) {
                System.out.printf(" %d. %d\n", j + 1, question.getChoice(j));
            }
            if (question.getAnswer() == sc.nextInt()) System.out.println("Correct\n");
            else System.out.println("Wrong\n");
        }

    }

}
