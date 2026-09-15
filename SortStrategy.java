public interface SortStrategy {
    String name();
    void sort(Todo[] todos);
}
