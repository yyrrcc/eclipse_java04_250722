package method_ch06_04;

// 혼공자 책 챕터6_4 3번 문제
public class MemberService {

	public boolean login(String id, String password) {
		return id.equals("hong") && password.equals("12345");
	}

	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
