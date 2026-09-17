public class Student {
    private int id;
    private String name;
    private int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId()          { return id; }
    public String getName()     { return name; }
    public int getScore()       { return score; }
    public void setScore(int s) { this.score = s; }

    @Override public String toString() {
        return "Student{" + id + ", " + name + ", " + score + "}";
    }
}
