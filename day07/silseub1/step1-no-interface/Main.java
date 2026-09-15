public class Main {
    public static void main(String[] args) {
        PostService service = new PostService();
        service.write(1L, "첫 번째 글");
        service.write(2L, "두 번째 글");

        System.out.println("1번 글: " + service.read(1L));
        System.out.println("저장된 글 개수: " + service.count());
    }
}
