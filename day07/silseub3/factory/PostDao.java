public class PostDao {
    private final ConnectionFactory factory;   // 커넥션 만드는 방법을 밖에서 받음

    public PostDao(ConnectionFactory factory) { this.factory = factory; }

    public void save(String title) {
        FakeConnection conn = factory.getConnection();   // new 를 직접 안 씀!
        conn.execute("INSERT INTO post ... " + title);
    }
}
