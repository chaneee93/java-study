public interface PostRepository {   // 약속(규격)만 적는다, 내용물 없음
    void save(Long id, String title);
    String findById(Long id);
    int count();
}
