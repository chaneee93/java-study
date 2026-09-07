public class Main {
    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent("가", 92, "논문제목");
        System.out.println(g.getName());     // 물려받은 것
        System.out.println(g.getGrade());    // 재정의한 것 (92 → B, 95 기준)
        System.out.println(g.getThesis());   // 추가한 것
    }
}
