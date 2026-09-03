import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수: ");
        int a = sc.nextInt();
        System.out.print("두 번째 수: ");
        int b = sc.nextInt();

        // 1) 사칙연산 5종
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));   // 정수 나눗셈(버림)
        System.out.println(a + " % " + b + " = " + (a % b));   // 나머지

        // 2) 나눗셈을 실수로
        System.out.println("실수 나눗셈: " + ((double) a / b));

        // 4) 삼항 연산자로 큰 수
        int max = a > b ? a : b;
        System.out.println("더 큰 수: " + max);

        // 5) 단락 회로 평가로 0 나누기 방어
        if (b != 0 && a / b > 1) {
            System.out.println("몫이 1보다 큽니다");
        } else {
            System.out.println("몫이 1 이하이거나 b가 0입니다");
        }

        sc.close();
    }
}