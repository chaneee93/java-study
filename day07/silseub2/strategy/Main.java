public class Main {
    public static void main(String[] args) {
        System.out.println("=== 전략 패턴 (100000원 주문) ===");

        Order order = new Order(new NoDiscount());
        System.out.print("일반: ");  order.process(100000);

        order.setPolicy(new RateDiscount(5));    // ← 같은 객체, 방식만 교체
        System.out.print("실버로 교체: ");  order.process(100000);

        order.setPolicy(new CappedRateDiscount());
        System.out.print("골드로 교체: ");  order.process(100000);

        System.out.println("→ order 객체 하나로 실행 중에 방식을 계속 갈아끼움 (교체 가능)");
    }
}
