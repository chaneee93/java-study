public class Student {
    String name;
    int score;

    Student(String name, int score) {   // 생성자
        this.name = name;
        this.score = score;
    }

    String getGrade() {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        return "C";
    }
}
