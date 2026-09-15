public class SimpleConnectionFactory implements ConnectionFactory {
    private int created = 0;

    @Override public FakeConnection getConnection() {
        created++;
        System.out.println("새 커넥션 생성 (총 " + created + "개)");
        return new FakeConnection();
    }
}
