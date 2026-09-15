public class NoDiscount implements DiscountPolicy {
    @Override public int discount(int price) { return 0; }
}
