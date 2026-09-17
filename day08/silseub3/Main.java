public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1) 리터럴 비교 ===");
        String a = "안녕";
        String b = "안녕";
        System.out.println("a == b     : " + (a == b));        // true (상수 풀에서 공유)
        System.out.println("a.equals(b): " + a.equals(b));      // true

        System.out.println("\n=== 2) new String 으로 만들어 비교 ===");
        String c = new String("안녕");
        System.out.println("a == c     : " + (a == c));        // false (새 객체!)
        System.out.println("a.equals(c): " + a.equals(c));      // true (내용은 같음)

        System.out.println("\n=== 4) intern() (참고) ===");
        System.out.println("c.intern() == a : " + (c.intern() == a));  // true

        System.out.println("\n=== 5) 문자열은 불변(immutable) ===");
        String s = "가";
        int before = System.identityHashCode(s);
        s = s + "나";                       // 고치는 게 아니라 새로 만드는 것
        int after = System.identityHashCode(s);
        System.out.println("연결 전 주소: " + before);
        System.out.println("연결 후 주소: " + after);
        System.out.println("주소 바뀜? " + (before != after) + "  → 원래 \"가\"를 고친 게 아니라 새 객체");

        System.out.println("\n=== 6) 속도 측정 (숫자로 확인) ===");
        for (int N : new int[]{10000, 100000}) {
            long t1 = System.currentTimeMillis();
            String str = "";
            for (int i = 0; i < N; i++) str += "a";     // 매번 새 객체 + 통째 복사
            long stringMs = System.currentTimeMillis() - t1;

            long t2 = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) sb.append("a");  // 한 곳에 이어붙임
            long sbMs = System.currentTimeMillis() - t2;

            System.out.printf("N=%,d  String=%dms  StringBuilder=%dms%n", N, stringMs, sbMs);
        }
        System.out.println("→ N을 10배 늘리면 String은 ~100배 느려짐");

        System.out.println("\n=== 7) 자주 쓰는 메서드 (원본 안 바뀜) ===");
        String raw = "  hello  ";
        System.out.println("trim(): [" + raw.trim() + "]  원본: [" + raw + "] (원본 그대로!)");
        System.out.println("substring(0,3) of 'hello': " + "hello".substring(0, 3)); // hel (끝 미포함)
        System.out.println("''.isEmpty()  = " + "".isEmpty());     // true
        System.out.println("'  '.isEmpty()= " + "  ".isEmpty());   // false (공백 있음)
        System.out.println("'  '.isBlank()= " + "  ".isBlank());   // true (공백만)

        System.out.println("\n=== 8) CSV 한 줄 파싱 ===");
        String line = "1,김철수,90";
        String[] parts = line.split(",");
        System.out.println("학번=" + parts[0] + " 이름=" + parts[1] + " 점수=" + parts[2]);

        System.out.println("\n=== 9) 잘못된 데이터를 예외 처리로 막기 ===");
        String bad1 = "1,김철수";          // 필드 부족
        try {
            String[] p = bad1.split(",");
            System.out.println("점수=" + p[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("필드 부족! ArrayIndexOutOfBoundsException 막음");
        }
        String bad2 = "1,김철수,구십";      // 숫자가 아님
        try {
            int score = Integer.parseInt(bad2.split(",")[2]);
            System.out.println("점수=" + score);
        } catch (NumberFormatException e) {
            System.out.println("숫자 아님! NumberFormatException 막음");
        }
    }
}
