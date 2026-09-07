public class Main {
    public static void main(String[] args) {
        Student a = new Student("가", 95);
        Student b = new Student("나", 82);
        Student c = new Student("다", 71);

        System.out.println(a.name + " " + a.getGrade());
        System.out.println(b.name + " " + b.getGrade());
        System.out.println(c.name + " " + c.getGrade());
    }
}
