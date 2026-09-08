public class UndergradPolicy implements GradePolicy {
    public String grade(int score) {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        return "C";
    }
}
