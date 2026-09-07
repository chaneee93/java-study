public class Main {
    public static void main(String[] args) {
        parseScore("abc");
    }
    static int parseScore(String raw) {
        try {
            return Integer.parseInt(raw);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("점수 변환 실패: " + raw, e);  // e를 두 번째 인자로!
        }
    }
}
