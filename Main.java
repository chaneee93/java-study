public class Main {
    static class Res implements AutoCloseable {
        private final String name;
        Res(String name) { this.name = name; System.out.println(name + " 열림"); }
        public void close() { System.out.println(name + " 닫힘"); }
    }

    public static void main(String[] args) {
        try (Res a = new Res("A"); Res b = new Res("B")) {
            System.out.println("블록 안");
        }
    }
}
