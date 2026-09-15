public class LoggingTodoStore implements TodoStore {
    private final TodoStore inner;                  // 감싼 대상

    public LoggingTodoStore(TodoStore inner) { this.inner = inner; }

    @Override
    public void add(Todo todo) {
        System.out.println("[LOG] 추가: " + todo.getTitle());
        inner.add(todo);
    }

    @Override
    public boolean remove(long id) {
        System.out.println("[LOG] 삭제: " + id);
        return inner.remove(id);
    }

    @Override public Todo findById(long id) { return inner.findById(id); }
    @Override public Todo[] findAll()       { return inner.findAll(); }
    @Override public int size()             { return inner.size(); }
}
