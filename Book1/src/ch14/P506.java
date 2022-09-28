package ch14;

/*
 * 날짜 : 2022/09/27
 * 이름 : 서정현
 * 내용 : P506_P507
 * 	- 사용자 정의 예외 구현하기
 * 	- 사용자 정의 예외 테스트하기
 */
class IDFormatException extends Exception {
	public IDFormatException(String message) {
		super(message);
	}
}
public class P506 {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUser(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요."); 
		}
		
		this.userID = userID;
	}

	public static void main(String[] args) {
	
		P506 test = new P506();
		
		String userID = null;
		try {
			test.setUser(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());;
		}
		
		userID = "1234567";
		try {
			test.setUser(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());;
		}
	}

}
