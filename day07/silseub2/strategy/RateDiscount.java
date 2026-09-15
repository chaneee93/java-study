public class RateDiscount implements DiscountPolicy {
    private final int rate;
    public RateDiscount(int rate) { this.rate = rate; }
    @Override public int discount(int price) { return price * rate / 100; }
}
