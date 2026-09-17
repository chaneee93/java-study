import java.util.Scanner;

public class InputCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\"안녕\" 을 입력해보세요: ");
        String input = sc.nextLine();

        System.out.println("input == \"안녕\"      : " + (input == "안녕"));       // false!
        System.out.println("input.equals(\"안녕\") : " + input.equals("안녕"));    // true
        System.out.println("→ 입력값은 새 객체라 ==는 false. 그래서 항상 equals!");
    }
}
