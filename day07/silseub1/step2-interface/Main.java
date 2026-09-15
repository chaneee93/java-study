public class Main {
    public static void main(String[] args) {

        System.out.println("=== 메모리 플러그 ===");
        PostService a = new PostService(new InMemoryPostRepository());
        a.write(1L, "메모리에 저장된 글");
        System.out.println("개수: " + a.count());

        System.out.println("\n=== 파일 플러그 (posts.txt 생김) ===");
        PostService b = new PostService(new FilePostRepository());
        b.write(1L, "파일에 저장된 글");
        System.out.println("개수: " + b.count());
        // ↑ PostService 코드는 한 줄도 안 고쳤는데 저장방식이 바뀜!

        System.out.println("\n=== 가짜 플러그 (테스트용) ===");
        FakePostRepository fake = new FakePostRepository();
        PostService c = new PostService(fake);
        c.write(1L, "첫 글");
        System.out.println("가짜에 저장된 개수: " + fake.count());  // 1
    }
}
