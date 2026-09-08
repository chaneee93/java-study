public class ExchangePolicy implements GradePolicy {
    public String grade(int score) {
        return score >= 60 ? "P" : "F";
    }
}
