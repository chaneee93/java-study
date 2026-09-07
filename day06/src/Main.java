public class Main {
    public static void main(String[] args) {
        Student s = new GraduateStudent("가", 92, "논문");
        if (s instanceof GraduateStudent g) {   // 진짜 대학원생일 때만
            System.out.println(g.getThesis());
        } else {
            System.out.println("대학원생이 아닙니다");
        }
    }
}
