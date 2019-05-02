package code;

import java.util.Scanner;

public class ConsoleTest {

    public static void main(String[] args) {

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
        for(int i = 0; i < 10; i++) {
            int y = 2 + (int)(Math.random() * (12 - 2));
            question.setXY(2, y);
            System.out.printf("%d) %d X %d\n", i + 1, question.getX(), question.getY());
            question.setChoice();
            for(int j = 0; j < 4; j++) {
                System.out.printf(" %d. %d\n", j + 1, question.getChoice(j));
            }
            if(question.getAnswer() == sc.nextInt()) System.out.println("Correct\n");
            else System.out.println("Wrong\n");
        }

    }

}
