import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[10];
        items[0] = new Book("자바의 정석");
        items[1] = new Book("클린 코드");
        items[2] = new Magazine("월간 개발자 9월호");
        items[3] = new Dvd("리팩터링 강의");
        items[1].borrow("홍길동");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("========== 시립도서관 ==========");
            System.out.println("[1] 목록  [2] 대출  [3] 반납  [4] 검색  [0] 종료");
            System.out.print("> ");

            int menu;
            try {
                menu = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해 주세요.");
                continue;
            }

            if (menu == 0) {
                System.out.println("이용해 주셔서 감사합니다.");
                break;

            } else if (menu == 1) {
                for (LibraryItem item : items) {
                    if (item == null) continue;
                    System.out.printf("[%d] %s  %s  %d일%n",
                            item.getId(), item.getTitle(),
                            item.isBorrowed() ? "대출중 (" + item.getBorrower() + ")" : "대출 가능",
                            item.getLoanDays());
                }

            } else if (menu == 2) {
                System.out.print("자료 번호: ");
                long no = Long.parseLong(sc.nextLine());
                System.out.print("회원 이름: ");
                String member = sc.nextLine();
                try {
                    LibraryItem item = findById(items, no);
                    item.borrow(member);
                    System.out.println(item.getTitle() + "를 대출했습니다. "
                            + item.getLoanDays() + "일 뒤 반납해 주세요.");
                } catch (ItemNotFoundException e) {
                    System.out.println(e.getMessage());
                } catch (AlreadyBorrowedException e) {
                    System.out.println(e.getMessage());
                }

            } else {
                System.out.println(menu + "번 메뉴 (다음 단계에서 채웁니다)");
            }
        }
    }

    static LibraryItem findById(LibraryItem[] items, long id) {
        for (LibraryItem item : items) {
            if (item != null && item.getId() == id) return item;
        }
        throw new ItemNotFoundException(id);
    }
}
