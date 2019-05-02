package code;

public class QuestionBuilder {

    private static QuestionBuilder instance;

    private QuestionBuilder() {

    }

    public static QuestionBuilder getInstance() {
        if (instance == null) instance = new QuestionBuilder();
        return instance;
    }

    public Question bulidQuestion() {
        return new Question();

    }

}