package ch06_03ex;

public class MemberService {
	
	public boolean login(String id, String password) {
		
		if(id.equals("Hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃되었습니다.");
	}
	
	
	

}
