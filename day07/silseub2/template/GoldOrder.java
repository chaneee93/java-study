public class GoldOrder extends OrderProcessor {
    @Override protected int discount(int price) {
        return Math.min(price / 10, 5000);   // 10% 할인, 최대 5000원
    }
}
