package code;

public class Question {

    private int multiplyee;
    private int multiplier;
    private int answer;
    private int[] choice;

    public Question(int multiplyee, int multiplier) {
        this.multiplyee = multiplyee;
        this.multiplier = multiplier;
        this.answer = multiplyee * multiplier;
        this.choice = new int[4];
    }

    public int getAnswer() {
        return answer;
    }

    public void setChoice() {
        int subtractNum = (int)(Math.random() * (3));
        int first = answer - (subtractNum * multiplyee);
        if(first <= 0) first = answer;
        for (int i = 0; i < 4; i++) {
            choice[i] = first + (i * multiplyee);
        }
    }

    public int getChoice(int index) {
        return choice[index];
    }

    public int getX() {
        return multiplyee;
    }

    public int getY() {
        return multiplier;
    }

}
