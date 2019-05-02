package sample;

public class QuestionBuilder {

    private static QuestionBuilder instance;

    private QuestionBuilder() {

    }

    public static QuestionBuilder getInstance() {
        if (instance == null) instance = new QuestionBuilder();
        return instance;
    }

    public Question bulidQuestion(int mae) {
//        int x = min + (int)(Math.random() * (max - min));
        int y = 2 + (int) (Math.random() * (12 - 2));
        return new Question(mae, y);
    }

}
