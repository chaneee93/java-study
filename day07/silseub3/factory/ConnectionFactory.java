public interface ConnectionFactory {   // "커넥션 만들어 주는 곳" 규격
    FakeConnection getConnection();
}
