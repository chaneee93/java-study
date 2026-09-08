public class Main {
    public static void main(String[] args) {
        Student s = new GraduateStudent("가", 92, "논문");
        System.out.println(s.describe());   // 부모의 describe()
    }
}
