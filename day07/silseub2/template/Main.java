public class Main {
    public static void main(String[] args) {
        System.out.println("=== 템플릿 메서드 (100000원 주문) ===");

        System.out.print("일반: ");  new NormalOrder().process(100000);
        System.out.print("실버: ");  new SilverOrder().process(100000);
        System.out.print("골드: ");  new GoldOrder().process(100000);

        System.out.println("\n[실행 중 교체 시도]");
        OrderProcessor p = new NormalOrder();
        System.out.print("일반으로: ");  p.process(100000);
        System.out.println("→ 방식을 바꾸려면 객체를 새로 만들어야 함 (교체 불가)");
    }
}
