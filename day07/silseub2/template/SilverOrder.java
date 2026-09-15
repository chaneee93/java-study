public class SilverOrder extends OrderProcessor {
    @Override protected int discount(int price) { return price * 5 / 100; }
}
