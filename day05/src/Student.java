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
            throw new IllegalArgumentException("점수는 0~100이어야 합니다. 입력값: " + score);
        }
        this.score = score;
    }

    public String getGrade() {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        return "C";
    }

    public static int getCount() {
        return count;
    }
}
