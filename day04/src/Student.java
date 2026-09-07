public class Student {
    String name;   // 필드 - 무엇을 갖는가
    int score;

    String getGrade() {   // 메서드 - 무엇을 하는가
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        return "C";
    }
}
