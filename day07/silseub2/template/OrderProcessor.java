public abstract class OrderProcessor {

    // final = 이 순서(골격)는 절대 못 바꾼다
    public final int process(int price) {
        int base = calculate(price);
        int discounted = base - discount(base);   // ← 여기만 자식마다 다름
        print(discounted);
        return discounted;
    }

    private int calculate(int price) { return price; }
    private void print(int amount) {
        System.out.println("최종 금액: " + amount + "원");
    }

    protected abstract int discount(int price);    // 자식이 채운다
}
