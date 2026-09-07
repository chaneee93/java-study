public class ResearchStudent extends Student {
    public ResearchStudent(String name, int score) {
        super(name, score);
    }
    @Override
    public String getGrade() {
        return getScore() >= 98 ? "A" : "B";
    }
}
