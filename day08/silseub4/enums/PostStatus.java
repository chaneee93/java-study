public enum PostStatus {
    DRAFT("작성 중"),
    PUBLISHED("게시됨"),
    ARCHIVED("보관됨");     // 필드가 있으면 마지막 상수 뒤에 ; 필수

    private final String label;
    PostStatus(String label) { this.label = label; }   // 생성자 (public 붙이면 안 됨)
    public String getLabel() { return label; }
}
