package ch15;

/*
 * 날짜 : 2022/09/28
 * 이름 : 서정현
 * 내용 : 문자 하나를 입력받기
 */

public class P515 {
	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
