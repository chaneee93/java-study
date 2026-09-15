public class Main {
    public static void main(String[] args) {
        System.out.println("=== Simple 팩토리 (매번 새로 만듦) ===");
        PostDao dao1 = new PostDao(new SimpleConnectionFactory());
        dao1.save("첫 글");
        dao1.save("둘째 글");

        System.out.println("\n=== Pooled 팩토리 (미리 만들어 빌려줌) ===");
        PostDao dao2 = new PostDao(new PooledConnectionFactory(5));
        dao2.save("셋째 글");
        dao2.save("넷째 글");

        System.out.println("\n→ 만드는 방식을 통째로 바꿨는데 PostDao 코드는 한 줄도 안 고침");
    }
}
