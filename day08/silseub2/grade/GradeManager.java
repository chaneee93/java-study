import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeManager {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 성적 관리 ===");
            System.out.println("1.추가  2.목록  3.학번검색  4.평균  5.종료");
            System.out.print("선택> ");
            String menu = sc.nextLine().trim();

            switch (menu) {
                case "1" -> {
                    System.out.print("학번: ");   int id = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("이름: ");    String name = sc.nextLine().trim();
                    System.out.print("점수: ");    int score = Integer.parseInt(sc.nextLine().trim());
                    students.add(new Student(id, name, score));
                    System.out.println("추가됨");
                }
                case "2" -> {
                    if (students.isEmpty()) System.out.println("(비어 있음)");
                    else students.forEach(System.out::println);
                }
                case "3" -> {
                    System.out.print("찾을 학번: ");   int id = Integer.parseInt(sc.nextLine().trim());
                    int idx = students.indexOf(new Student(id, "", 0));  // equals(학번)로 검색
                    if (idx >= 0) System.out.println("찾음: " + students.get(idx));
                    else          System.out.println("없는 학번");
                }
                case "4" -> {
                    if (students.isEmpty()) {          // 빈 목록 -> 0으로 나누기 방지
                        System.out.println("학생이 없어 평균을 낼 수 없음");
                    } else {
                        int sum = 0;
                        for (Student s : students) sum += s.getScore();
                        double avg = (double) sum / students.size();
                        System.out.printf("평균: %.1f점%n", avg);
                    }
                }
                case "5" -> { System.out.println("종료"); return; }
                default -> System.out.println("잘못된 선택");
            }
        }
    }
}
