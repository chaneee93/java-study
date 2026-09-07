import java.io.File;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        Scanner sc = new Scanner(new File("없는파일.txt"));
    }
}
