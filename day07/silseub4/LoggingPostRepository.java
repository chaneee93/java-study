// 데코레이터 - 원래 것을 품고, 하는 일에 '로그'를 더한다
public class LoggingPostRepository implements PostRepository {

    private final PostRepository delegate;   // 원래 것(감싸는 대상)

    public LoggingPostRepository(PostRepository delegate) {
        this.delegate = delegate;
    }

    @Override public void save(Long id, String title) {
        long t = System.nanoTime();
        delegate.save(id, title);            // 진짜 일은 원래 것에 넘긴다
        System.out.printf("[LOG] save(%d) %.2fms%n", id, (System.nanoTime() - t) / 1_000_000.0);
    }

    @Override public String findById(Long id) {
        long t = System.nanoTime();
        String r = delegate.findById(id);
        System.out.printf("[LOG] findById(%d) %.2fms%n", id, (System.nanoTime() - t) / 1_000_000.0);
        return r;
    }

    @Override public int count() { return delegate.count(); }
}
