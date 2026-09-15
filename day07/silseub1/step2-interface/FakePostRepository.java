import java.util.ArrayList;
import java.util.List;

// 파일도 DB도 없이 테스트만 하려고 만든 가짜
public class FakePostRepository implements PostRepository {
    private final List<String> saved = new ArrayList<>();

    @Override public void save(Long id, String title) { saved.add(title); }
    @Override public String findById(Long id)         { return saved.get(0); }
    @Override public int count()                      { return saved.size(); }

    public List<String> getSaved() { return saved; }   // 테스트에서 들여다보려고
}
