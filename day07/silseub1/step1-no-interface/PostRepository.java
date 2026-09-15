import java.util.HashMap;
import java.util.Map;

// 인터페이스가 아니라 그냥 클래스임
public class PostRepository {
    private final Map<Long, String> store = new HashMap<>();

    public void save(Long id, String title) { store.put(id, title); }
    public String findById(Long id)         { return store.get(id); }
    public int count()                      { return store.size(); }
}
