public class BadMain {
    public static void main(String[] args) {
        // enum 타입에 int를 넣으려 하면? → 컴파일러가 막는다
        PostStatus s = 1;   // incompatible types: int cannot be converted to PostStatus
        System.out.println(s);
    }
}
