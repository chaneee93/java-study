public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1) 로그 데코레이터 (PostService는 그대로) ===");
        PostRepository repo = new LoggingPostRepository(new InMemoryPostRepository());
        PostService service = new PostService(repo);
        service.write(1L, "첫 글");
        System.out.println("읽기: " + service.read(1L));

        System.out.println("\n=== 2) 데코레이터 겹치기 (캐시+로그) ===");
        System.out.println("--- 순서 A: 캐시(로그(메모리)) ---");
        PostRepository a = new CachingPostRepository(
                               new LoggingPostRepository(
                                   new InMemoryPostRepository()));
        a.save(1L, "글A");
        a.findById(1L);   // 캐시 없음 -> 로그 찍힘
        a.findById(1L);   // 캐시 적중 -> 로그 안 찍힘 (캐시에서 끝남)

        System.out.println("--- 순서 B: 로그(캐시(메모리)) ---");
        PostRepository b = new LoggingPostRepository(
                               new CachingPostRepository(
                                   new InMemoryPostRepository()));
        b.save(1L, "글B");
        b.findById(1L);   // 캐시 없음 -> 로그 찍힘
        b.findById(1L);   // 캐시 적중 -> 그래도 로그 찍힘 (로그가 바깥이라)
        System.out.println("→ 순서가 동작을 바꾼다: A는 캐시적중 시 로그X, B는 로그O");

        System.out.println("\n=== 3) 어댑터 (모양 다른 LegacyStorage를 감쌈) ===");
        PostService legacyService = new PostService(
                new LegacyStorageAdapter(new LegacyStorage()));
        legacyService.write(1L, "레거시에 저장");
        System.out.println("읽기: " + legacyService.read(1L));
        System.out.println("→ PostService는 여전히 그대로. 모양만 어댑터가 맞춰줌");
    }
}
