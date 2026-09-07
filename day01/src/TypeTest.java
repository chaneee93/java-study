public class TypeTest {
    public static void main(String[] args) {
        // 1) 자료형 범위 출력
        System.out.println("int 최대: " + Integer.MAX_VALUE);
        System.out.println("int 최소: " + Integer.MIN_VALUE);
        System.out.println("long 최대: " + Long.MAX_VALUE);

        // 2) 오버플로 재현
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(max + 1);   // 음수 나옴!

        // 3) 부동소수점 오차
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += 0.1;
        }
        System.out.println(sum);        // 1.0 아님
        System.out.println(sum == 1.0); // false

        // 4) 형 변환
        double d = 3.9;
        System.out.println((int) d);       // 3 (버림)
        System.out.println(Math.round(d)); // 4 (반올림)

        // 5) 내 정보를 알맞은 자료형으로
        String name = "차니";
        int age = 34;
        double heightCm = 175.5;
        boolean isAdult = true;
        long studentId = 2026090112L; // 10자리는 int(21억)를 넘길 수 있어서 long
        System.out.println(name + " / " + age + " / " + heightCm + " / " + isAdult + " / " + studentId);
    }
}