package management;

import java.util.Scanner;
import dao.UserDAO;

public class UserManageImpl implements UserManage {

  Scanner sc = new Scanner(System.in);
  Storage storage = Storage.getInstance();

  @Override
  public void login() {
    String id;
    String pw;

    System.out.println("아이디> ");
    id = sc.next();
    System.out.println("패스워드> ");
    pw = sc.next();

    if (id.equals("admin") && pw.equals("1234")) {
      System.out.println("관리자로 로그인하였습니다.");
      storage.setLoginedUser(new UserDAO("admin", "1234", "관리자"));
      return;
    }

    UserDAO user = storage.getUser(id);
    if (user == null || !(user.getPassword().equals(pw))) {
      System.out.println("로그인에 실패했습니다.");
      return;
    }


    storage.setLoginedUser(user);
    System.out.println("로그인되었습니다." + user.getName());
  }


  @Override
  public void logout() {
    storage.setLoginedUser(null); // 레퍼런스주소를 없앤다.
    System.out.println("로그아웃되었습니다.");
  }

  @Override
  public void join() {
    String id;
    String pw;
    String name;
    boolean duplicated;

    do {
      duplicated= false;
      System.out.println("희망 아이디 입력> ");
      id = sc.next();
      if (storage.getUser(id) != null) {
        // id 가 이미 존재하면
        System.out.println("아이디가 이미 존재합니다. 다시 입력!");
        duplicated = true;
      }
    } while (duplicated);

    System.out.println("희망 패스워드 입력> ");
    pw = sc.next();
    System.out.println("사용자 이름 입력> ");
    name = sc.next();

    UserDAO user = new UserDAO();
    user.setId(id);
    user.setPassword(pw);
    user.setName(name);

    storage.getUserList().add(user);
    System.out.println("회원 가입이 완료되었습니다.");

  }


}
