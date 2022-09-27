package ch14;

/*
 * 날짜 : 2022/09/27
 * 이름 : 서정현
 * 내용 : P498_
 * 	- AutoCloseable 인터페이스 구현하기(P498)
 * 	- try-with-resoutces문 사용하기_1(P498)
 * 	- try-with-resoutces문 사용하기_2(P499)
 */

class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다."); //close 메서드 구현
	}
}

public class P498_P499 {
	public static void main(String[] args) {
		try (AutoCloseObj obj = new AutoCloseObj()){
			throw new Exception();
			
		} catch (Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}

}
