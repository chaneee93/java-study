import java.io.*;

public class FilePostRepository implements PostRepository {
    private final String path = "posts.txt";

    @Override public void save(Long id, String title) {
        try (FileWriter fw = new FileWriter(path, true)) {   // true = 이어쓰기
            fw.write(id + "\t" + title + "\n");
        } catch (IOException e) { throw new RuntimeException(e); }
    }

    @Override public String findById(Long id) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\t", 2);
                if (Long.parseLong(p[0]) == id) return p[1];
            }
        } catch (IOException e) { return null; }
        return null;
    }

    @Override public int count() {
        int c = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while (br.readLine() != null) c++;
        } catch (IOException e) { return 0; }
        return c;
    }
}
