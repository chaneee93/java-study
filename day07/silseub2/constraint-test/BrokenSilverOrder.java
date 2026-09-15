// 이미 OrderProcessor를 extends 중인데 Auditable도 상속시키려 하면?
// → 자바는 부모 하나만 허용(다중 상속 금지) → 컴파일 에러
public class BrokenSilverOrder extends OrderProcessor extends Auditable {
    @Override protected int discount(int price) { return price * 5 / 100; }
}
