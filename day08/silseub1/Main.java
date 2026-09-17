import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== 2) 초기화 안 한 배열의 기본값 ===");
        int[]     ints    = new int[3];
        double[]  dbls    = new double[3];
        boolean[] bools   = new boolean[3];
        String[]  strs    = new String[3];
        System.out.println("int[]     : " + ints[0]);      // 0
        System.out.println("double[]  : " + dbls[0]);      // 0.0
        System.out.println("boolean[] : " + bools[0]);     // false
        System.out.println("String[]  : " + strs[0]);      // null

        System.out.println("\n=== 3) 함정1: 인덱스 초과 ===");
        int[] nums = {10, 20, 30};
        try {
            for (int i = 0; i <= nums.length; i++) {   // <= 가 함정! (0,1,2,3 접근)
                System.out.println("i=" + i + " -> " + nums[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("터짐! 메시지: " + e.getMessage());
            System.out.println("→ 3칸 배열의 인덱스는 0,1,2. i < length 로 고쳐야 함");
        }

        System.out.println("\n=== 4) 함정2: 객체 배열 NPE ===");
        Student[] students = new Student[3];   // 자리 3개만 만듦 (내용물 없음)
        try {
            System.out.println(students[0].getName());   // null.getName() -> 터짐
        } catch (NullPointerException e) {
            System.out.println("터짐! new Student[3]은 자리만 만든 것. 학생은 없음");
        }
        students[0] = new Student(1, "김철수", 90);   // 자리를 채운다
        System.out.println("채운 뒤: " + students[0].getName());

        System.out.println("\n=== 5) 함정3: 배열 대입은 '주소 복사' (오늘 제일 중요) ===");
        int[] a = {10, 20, 30};
        int[] b = a;          // 같은 배열을 가리킴 (복사 아님!)
        b[0] = 999;
        System.out.println("a[0] = " + a[0] + "  (b를 바꿨는데 a도 바뀜)");
        System.out.println("a == b : " + (a == b) + "  (같은 집을 가리킴)");
        System.out.println("→ int 배열이어도 그렇다. 배열 자체가 '객체'라서");

        System.out.println("\n=== 6) 진짜 복사 ===");
        int[] c = Arrays.copyOf(a, a.length);   // 새 배열
        c[0] = 1;
        System.out.println("a[0] = " + a[0] + ", c[0] = " + c[0] + ", a == c : " + (a == c));

        System.out.println("\n=== 7) 얕은 복사 vs 깊은 복사 (객체 배열) ===");
        Student[] orig = { new Student(1, "이영희", 80) };
        Student[] shallow = Arrays.copyOf(orig, orig.length);  // 배열은 새로, 내용물 주소는 공유
        shallow[0].setScore(0);
        System.out.println("얕은 복사 후 orig 점수: " + orig[0].getScore() + "  (같이 바뀜!)");
        // 깊은 복사 - 요소도 새로 만든다
        Student[] deep = new Student[orig.length];
        for (int i = 0; i < orig.length; i++) {
            deep[i] = new Student(orig[i].getId(), orig[i].getName(), orig[i].getScore());
        }
        deep[0].setScore(100);
        System.out.println("깊은 복사 후 orig 점수: " + orig[0].getScore() + "  (deep를 바꿔도 안 바뀜)");

        System.out.println("\n=== 8) 향상된 for로는 원본 못 바꿈 ===");
        int[] scores = {95, 88, 77};
        for (int s : scores) { s = 100; }        // s는 복사본 -> 원본 안 바뀜
        System.out.println("향상된 for 후: " + scores[0] + "  (95 그대로)");
        for (int i = 0; i < scores.length; i++) { scores[i] = 100; }  // 일반 for로 바꿔야
        System.out.println("일반 for 후: " + scores[0] + "  (100으로 바뀜)");

        System.out.println("\n=== 9) 2차원 배열 성적표 ===");
        int[][] table = {
            {90, 80, 70, 60},
            {85, 95, 75, 65},
            {50, 60, 70, 80}
        };
        System.out.println("table.length    = " + table.length);      // 행 수 3
        System.out.println("table[0].length = " + table[0].length);   // 열 수 4
        System.out.println("table[2][3]     = " + table[2][3]);       // 80
    }
}
