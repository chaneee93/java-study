public class Main {
    static class Res implements AutoCloseable {   // AutoCloseable = "자동으로 닫힐 수 있음"
        private final String name;
        Res(String name) { this.name = name; System.out.println(name + " 열림"); }
        public void close() { System.out.println(name + " 닫힘"); }
    }

    public static void main(String[] args) {
        try (Res r = new Res("A")) {
            System.out.println("블록 안");
            throw new RuntimeException("일부러");   // 예외 던져도?
        } catch (RuntimeException e) {
            System.out.println("잡음");
        }
    }
}
