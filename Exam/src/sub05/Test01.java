package sub05;
/*
 * 날짜 : 2022/09/26
 * 이름 : 서정현
 * 내용 : 자바 총정리 연습문제
 */
public class Test01 {
	public static void main(String[] args) {
		char a = 'A';
		int b = a;
		char c = 66;
		int d = a + b;
		
		System.out.println("a : " + a);
		System.out.println("a : " + b);
		System.out.println("a : " + c);
		System.out.println("a : " + d);
		
		float n1 = 3.1415922653589793f;
		double n2 = 3.1415922653589793;
		
		int n3 = (int) n1;
		int n4 = (int) n2;
		
		System.out.println("n1 : " + n1);
		System.out.println("n1 : " + n2);
		System.out.println("n1 : " + n3);
		System.out.println("n1 : " + n4);
		
		String str1 = "홍길동";
		String str2 = null;
		String str3 = "Hello\n"
					+ "world\n"
					+ "Korea";
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		
	}
}
