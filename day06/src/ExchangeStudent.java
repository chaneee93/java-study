public class ExchangeStudent extends Student {
    private String homeCountry;

    public ExchangeStudent(String name, int score, String homeCountry) {
        super(name, score);
        this.homeCountry = homeCountry;
    }

    @Override
    public String getGrade() {
        return getScore() >= 60 ? "P" : "F";   // 교환학생은 Pass/Fail
    }
}
