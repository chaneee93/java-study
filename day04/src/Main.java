public class Main {
    public static void main(String[] args) {
        Student a = new Student("가", 95);
        System.out.println(a.getName() + " " + a.getScore() + " " + a.getGrade());

        a.setScore(88);              // 정상값 - 통과
        System.out.println("변경 후: " + a.getScore());

        a.setScore(-50);             // 이상한 값 - 여기서 막힘!
    }
}
