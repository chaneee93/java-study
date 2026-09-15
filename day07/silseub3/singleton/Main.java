import java.util.Set;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(50);   // 풀 하나로 두 실험 다 함

        System.out.println("=== Lazy 싱글톤을 스레드 100개로 공격 ===");
        Set<Integer> lazyHashes = ConcurrentHashMap.newKeySet();
        CountDownLatch latch1 = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            pool.submit(() -> {
                lazyHashes.add(System.identityHashCode(Lazy.getInstance()));
                latch1.countDown();
            });
        }
        latch1.await();
        System.out.println("서로 다른 객체 수: " + lazyHashes.size() + "  (기대값 1)");
        System.out.println("생성자 호출 횟수: " + Lazy.getCreatedCount() + "  (기대값 1)");
        System.out.println("→ 1보다 크면 싱글톤이 깨진 것! 여러 개 만들어졌다는 뜻");

        System.out.println("\n=== Eager 싱글톤을 똑같이 공격 ===");
        Set<Integer> eagerHashes = ConcurrentHashMap.newKeySet();
        CountDownLatch latch2 = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            pool.submit(() -> {
                eagerHashes.add(System.identityHashCode(Eager.getInstance()));
                latch2.countDown();
            });
        }
        latch2.await();
        System.out.println("서로 다른 객체 수: " + eagerHashes.size());
        System.out.println("생성자 호출 횟수: " + Eager.getCreatedCount());
        System.out.println("→ 항상 1. 경쟁이 일어날 자리가 없음");

        pool.shutdown();
    }
}
