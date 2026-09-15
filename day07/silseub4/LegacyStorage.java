import java.util.HashMap;
import java.util.Map;

// 남이 만든(=못 고치는) 라이브러리. 우리 인터페이스와 '모양'이 다르다.
public class LegacyStorage {
    private final Map<String, String> data = new HashMap<>();

    public void put(String key, String value) { data.put(key, value); }
    public String get(String key)             { return data.get(key); }
    public int size()                         { return data.size(); }
}
