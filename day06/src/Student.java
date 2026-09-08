public abstract class Student {   // abstract = 직접 못 만듦
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }

    public abstract String getGrade();   // 뼈대만! 몸통 없음 → 자식이 채워야

    public String describe() {           // 공통 코드는 부모가 제공
        return name + " " + getGrade();
    }
}
