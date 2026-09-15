// 진짜 DB 커넥션 흉내만 내는 가짜
public class FakeConnection {
    public void execute(String sql) {
        System.out.println("  실행: " + sql);
    }
}
