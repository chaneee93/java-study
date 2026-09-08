public class GraduatePolicy implements GradePolicy {
    public String grade(int score) {
        return score >= 95 ? "A" : "C";
    }
}
