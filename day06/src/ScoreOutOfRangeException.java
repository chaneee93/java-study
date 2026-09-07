public class ScoreOutOfRangeException extends IllegalArgumentException {
    private final int input;

    public ScoreOutOfRangeException(int input) {
        super("점수는 0~100입니다. 입력값: " + input);
        this.input = input;
    }

    public int getInput() {
        return input;
    }
}
