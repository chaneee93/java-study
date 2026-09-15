public interface PostRepository {
    void save(Long id, String title);
    String findById(Long id);
    int count();
}
