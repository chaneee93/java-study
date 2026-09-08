public class UndergradStudent extends Student {
    public UndergradStudent(String name, int score) {
        super(name, score);
    }
    @Override
    public String getGrade() {   // abstract 메서드 구현
        if (getScore() >= 90) return "A";
        if (getScore() >= 80) return "B";
        return "C";
    }
}
