public class Main {
    public static void main(String[] args) {
        Student a = new Student();
        a.name = "가";  a.score = 95;

        Student b = new Student();
        b.name = "나";  b.score = 82;

        Student c = new Student();
        c.name = "다";  c.score = 71;

        System.out.println(a.name + " " + a.getGrade());
        System.out.println(b.name + " " + b.getGrade());
        System.out.println(c.name + " " + c.getGrade());
    }
}
