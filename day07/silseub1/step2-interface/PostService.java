public class PostService {
    private final PostRepository repository;

    public PostService(PostRepository repository) {   // 생성자로 주입받음
        this.repository = repository;
    }

    public void write(Long id, String title) {
        if (title == null || title.isBlank())
            throw new IllegalArgumentException("제목은 필수입니다");
        repository.save(id, title);
    }

    public String read(Long id) { return repository.findById(id); }
    public int count()          { return repository.count(); }
}
