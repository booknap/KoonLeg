package sample;

public class Question {

    private int x;
    private int y;
    private int answer;
    private int[] choice;

    public Question() {
        this.choice = new int[4];
    }

    public int getAnswer() {
        return answer;
    }

    public void setChoice() {
        int subtractNum = (int) (Math.random() * (3));
        int first = answer - (subtractNum * x);
        if (first <= 0) first = answer;
        for (int i = 0; i < 4; i++) {
            choice[i] = first + (i * x);
        }
    }

    public int getChoice(int index) {
        return choice[index];
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        this.answer = x * y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
