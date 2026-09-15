import java.util.HashMap;
import java.util.Map;

public class InMemoryPostRepository implements PostRepository {
    private final Map<Long, String> store = new HashMap<>();

    @Override public void save(Long id, String title) { store.put(id, title); }
    @Override public String findById(Long id)         { return store.get(id); }
    @Override public int count()                      { return store.size(); }
}
