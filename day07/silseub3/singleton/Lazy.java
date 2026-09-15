import java.util.concurrent.atomic.AtomicInteger;

// 게으른 싱글톤 - "필요할 때 만든다". 문제가 있는 버전.
public class Lazy {
    private static Lazy instance;
    private static final AtomicInteger createdCount = new AtomicInteger();

    private Lazy() {
        createdCount.incrementAndGet();   // 생성자가 몇 번 불렸나 센다
    }

    public static Lazy getInstance() {
        if (instance == null) {                       // ① 없나 검사
            try { Thread.sleep(10); } catch (InterruptedException ignored) {}
            instance = new Lazy();                    // ② 만든다  ← ①과 ② 사이 '틈'이 문제
        }
        return instance;
    }

    public static int getCreatedCount() { return createdCount.get(); }
}
