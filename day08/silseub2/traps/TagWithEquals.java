import java.util.Objects;

// equals 를 만든 버전
public class TagWithEquals {
    private final String name;
    public TagWithEquals(String name) { this.name = name; }
    public String getName() { return name; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TagWithEquals)) return false;
        return name.equals(((TagWithEquals) o).name);
    }
    @Override public int hashCode() { return Objects.hash(name); }
}
