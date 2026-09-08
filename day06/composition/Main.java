public class Main {
    public static void main(String[] args) {
        Student s = new Student("가", 92, new UndergradPolicy());
        System.out.println(s.getGrade());   // A (학부 기준)

        s.setPolicy(new GraduatePolicy());  // 대학원 정책으로 교체!
        System.out.println(s.getGrade());   // C (대학원 기준)
    }
}
