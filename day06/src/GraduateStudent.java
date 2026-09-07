public class GraduateStudent extends Student {   // Student를 물려받음
    private String thesis;   // 대학원생만의 추가 필드 (논문)

    public GraduateStudent(String name, int score, String thesis) {
        super(name, score);        // 부모 생성자 호출 (name, score는 부모가 처리)
        this.thesis = thesis;      // 내 것만 내가 처리
    }

    @Override
    public String getGrade() {     // 학점 기준을 95로 바꿔서 재정의
        if (getScore() >= 95) return "A";   // score가 private이라 getScore()로!
        if (getScore() >= 90) return "B";
        return "C";
    }

    public String getThesis() {
        return thesis;
    }
}
