public class Student {
    private final String name;
    private final int score;
    private GradePolicy policy;   // 정책을 '가지고' 있음 (has-a)

    public Student(String name, int score, GradePolicy policy) {
        this.name = name;
        this.score = score;
        this.policy = policy;
    }

    public String getGrade() {
        return policy.grade(score);   // 정책한테 위임
    }

    public void setPolicy(GradePolicy policy) {   // 실행 중에 갈아끼우기!
        this.policy = policy;
    }
}
