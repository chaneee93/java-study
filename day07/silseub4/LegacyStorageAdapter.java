// 어댑터 - 모양이 다른 LegacyStorage를 우리 PostRepository 모양으로 변환
public class LegacyStorageAdapter implements PostRepository {
    private final LegacyStorage legacy;

    public LegacyStorageAdapter(LegacyStorage legacy) {
        this.legacy = legacy;
    }

    @Override public void save(Long id, String title) {
        legacy.put(String.valueOf(id), title);       // Long -> String 변환
    }

    @Override public String findById(Long id) {
        return legacy.get(String.valueOf(id));
    }

    @Override public int count() { return legacy.size(); }
}
