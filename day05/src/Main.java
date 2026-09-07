public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
