import java.util.Objects;

public class Student {
    private final int id;       // 학번
    private final String name;
    private final int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId()      { return id; }
    public String getName() { return name; }
    public int getScore()   { return score; }

    // 학번(id)이 같으면 같은 학생으로 본다
    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        return id == ((Student) o).id;
    }
    @Override public int hashCode() { return Objects.hash(id); }

    @Override public String toString() {
        return "[" + id + "] " + name + " (" + score + "점)";
    }
}
