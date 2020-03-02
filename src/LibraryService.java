import java.util.Scanner;

// 콘솔에서 보여줄 것들
public class LibraryService {

  Scanner sc = new Scanner(System.in);

  public void entrance() {

  }

  public void initMenu() {
    int choice;
    do {
      System.out.print("1. 로그인 2.회원가입 3. 종료>");
      choice = sc.nextInt();
    } while (choice < 1 || choice > 3);

    switch(choice) {
      case 1:
        break;
      case 2:
        break;
      case 3:
      default:
        break;
    }
  }

  public void userMenu() {
    int choice;

    do {
      System.out.print("1. 도서 목록 조회 2.대여 신청 3. 반납 신청 4. 로그아웃>");
      choice = sc.nextInt();
    } while (choice < 1 || choice > 3);

    switch(choice) {
      case 1:
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
      default:
        break;
    }
  }

  public void managerMenu() {
    int choice;

    do {
      System.out.print("1. 회원 목록 조회 2. 대여 목록 조회 3. 로그아웃>");
      choice = sc.nextInt();
    } while (choice < 1 || choice > 3);

    switch(choice) {
      case 1:
        break;
      case 2:
        break;
      case 3:
      default:
        break;
    }
  }
}
