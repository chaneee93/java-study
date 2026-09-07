public class Student {
    private static int count = 0;
    private String name;
    private int score;

    Student(String name, int score) {
        this.name = name;
        setScore(score);
        count++;
    }

    public String getName() { return name; }
    public int getScore() { return score; }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            throw new ScoreOutOfRangeException(score);   // 내 예외 던지기
        }
        this.score = score;
    }

    public String getGrade() {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        return "C";
    }

    public static int getCount() { return count; }
}
