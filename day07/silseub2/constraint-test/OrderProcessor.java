public abstract class OrderProcessor {
    public final int process(int price) {
        int discounted = price - discount(price);
        System.out.println("최종 금액: " + discounted + "원");
        return discounted;
    }
    protected abstract int discount(int price);
}
