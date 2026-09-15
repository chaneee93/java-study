public class Order {
    private DiscountPolicy policy;   // 할인 방법을 필드로 들고 있음

    public Order(DiscountPolicy policy) { this.policy = policy; }
    public void setPolicy(DiscountPolicy policy) { this.policy = policy; }   // 실행 중 교체!

    public int process(int price) {
        int discounted = price - policy.discount(price);
        System.out.println("최종 금액: " + discounted + "원");
        return discounted;
    }
}
