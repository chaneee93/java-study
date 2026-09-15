public class CappedRateDiscount implements DiscountPolicy {
    @Override public int discount(int price) { return Math.min(price / 10, 5000); }
}
