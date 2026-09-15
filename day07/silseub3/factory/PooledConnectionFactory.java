import java.util.LinkedList;
import java.util.Queue;

public class PooledConnectionFactory implements ConnectionFactory {
    private final Queue<FakeConnection> pool = new LinkedList<>();

    public PooledConnectionFactory(int size) {
        for (int i = 0; i < size; i++) pool.add(new FakeConnection());
        System.out.println("커넥션 " + size + "개 미리 생성");
    }

    @Override public FakeConnection getConnection() {
        FakeConnection c = pool.poll();
        System.out.println("풀에서 빌려 줌 (남은 " + pool.size() + "개)");
        return c;
    }
}
