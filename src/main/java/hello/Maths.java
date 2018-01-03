package hello;

public class Maths {
    private int answer;
    private int multipliedBy;
    public Maths(int answer, int multipliedBy) {
        this.multipliedBy = multipliedBy;
        this.answer=answer;

    }


    public int getAnswer() {
        return answer;
    }

    public int getMultipliedBy() {
        return multipliedBy;
    }
}