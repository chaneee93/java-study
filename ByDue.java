public class ByDue implements SortStrategy {
    @Override public String name() { return "마감 임박순"; }
    @Override public void sort(Todo[] todos) {
        for (int i = 0; i < todos.length - 1; i++)
            for (int j = 0; j < todos.length - 1 - i; j++)
                if (todos[j].getDueInDays() > todos[j + 1].getDueInDays()) {
                    Todo tmp = todos[j]; todos[j] = todos[j + 1]; todos[j + 1] = tmp;
                }
    }
}
