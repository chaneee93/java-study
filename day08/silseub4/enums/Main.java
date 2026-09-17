public class Main {
    static final int DRAFT = 0, PUBLISHED = 1, ARCHIVED = 2;

    static String nameOf(int status) {   // 상수 따로, 이름 따로 (두 곳 관리)
        switch (status) {
            case 0:  return "작성 중";
            case 1:  return "게시됨";
            case 2:  return "보관됨";
            default: return "알 수 없는 상태";
        }
    }

    static String describe(PostStatus s) {   // enum switch (default 없이도 컴파일됨)
        return switch (s) {
            case DRAFT     -> "아직 작성 중입니다";
            case PUBLISHED -> "공개되었습니다";
            case ARCHIVED  -> "보관 처리되었습니다";
        };
    }

    public static void main(String[] args) {

        System.out.println("=== 1~3) int 상수 방식의 문제 ===");
        int s1 = 99;                         // 없는 값인데...
        System.out.println("s1 = 99 → 컴파일도 실행도 다 됨 (int니까)");
        System.out.println("이름: " + nameOf(s1));   // "알 수 없는 상태"
        System.out.println("→ 상수(0,1,2)와 이름을 두 곳에서 관리. 하나 추가하면 둘 다 고쳐야 함");

        System.out.println("\n=== 4) enum 으로 바꾸면 ===");
        PostStatus s2 = PostStatus.PUBLISHED;
        System.out.println(s2 + " / 한글: " + s2.getLabel());

        System.out.println("\n=== 6) values() / name() / ordinal() / valueOf() ===");
        for (PostStatus p : PostStatus.values()) {
            System.out.println("  " + p.name() + "  ordinal=" + p.ordinal() + "  label=" + p.getLabel());
        }
        System.out.println("valueOf(\"DRAFT\") = " + PostStatus.valueOf("DRAFT"));
        System.out.println("⚠️ ordinal()은 DB에 저장하지 말 것. 저장은 name()");

        System.out.println("\n=== 7) enum switch ===");
        System.out.println(describe(s2));
        System.out.println("→ default 안 썼는데도 컴파일됨. 모든 경우를 다뤘으니까");
    }
}
