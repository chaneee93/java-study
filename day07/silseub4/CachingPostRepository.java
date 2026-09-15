import java.util.HashMap;
import java.util.Map;

// 데코레이터 - 원래 것을 품고, '캐시' 기능을 더한다
public class CachingPostRepository implements PostRepository {
    private final PostRepository delegate;
    private final Map<Long, String> cache = new HashMap<>();

    public CachingPostRepository(PostRepository delegate) {
        this.delegate = delegate;
    }

    @Override public String findById(Long id) {
        if (cache.containsKey(id)) {
            System.out.println("[CACHE] 적중! id=" + id);
            return cache.get(id);            // 캐시에서 바로 반환 (원래 것 안 부름)
        }
        String r = delegate.findById(id);
        cache.put(id, r);
        return r;
    }

    @Override public void save(Long id, String title) {
        delegate.save(id, title);
        cache.remove(id);                    // 저장하면 캐시 무효화
    }

    @Override public int count() { return delegate.count(); }
}
