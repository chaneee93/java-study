import java.util.concurrent.atomic.AtomicInteger;

// 이른 싱글톤 - 클래스 로딩 때 JVM이 딱 한 번 만들어 줌. 안전.
public class Eager {
    private static final AtomicInteger createdCount = new AtomicInteger();   // INSTANCE보다 먼저 선언해야 함
    private static final Eager INSTANCE = new Eager();

    private Eager() { createdCount.incrementAndGet(); }

    public static Eager getInstance() { return INSTANCE; }
    public static int getCreatedCount() { return createdCount.get(); }
}
