public class Main {
    public static void main(String[] args) {
        Student a = new Student("가", 95);
        Student b = new Student("나", 82);
        Student c = new Student("다", 71);
        System.out.println(a.getName() + " " + a.getGrade());
        System.out.println(b.getName() + " " + b.getGrade());
        System.out.println(c.getName() + " " + c.getGrade());
        System.out.println("학생 수: " + Student.getCount());
    }
}
