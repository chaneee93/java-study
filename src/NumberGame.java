import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) 정답 만들기 (1~100)
        int answer = new Random().nextInt(100) + 1;

        // 카운터는 반복문 '밖'에서 선언
        int count = 0;

        System.out.println("1부터 100 사이 숫자를 맞혀 보세요.");

        // 4) 맞힐 때까지 반복
        while (true) {
            System.out.print("숫자: ");
            int input = sc.nextInt();
            count++;  // 시도 횟수 +1

            // 5) 범위 밖 입력 걸러내기
            if (input < 1 || input > 100) {
                System.out.println("1~100 사이로 입력하세요.");
                continue;  // 이번 건 무효, 다시 위로
            }

            // 3) 비교해서 힌트
            if (input > answer) {
                System.out.println("더 작게!");
            } else if (input < answer) {
                System.out.println("더 크게!");
            } else {
                System.out.println("정답! " + count + "번 만에 맞히셨습니다.");
                break;  // 정답이면 반복 끝
            }
        }

        sc.close();
    }
}