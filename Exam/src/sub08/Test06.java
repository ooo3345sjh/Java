package sub08;

/*
 * 날짜 : 2022/09/29
 * 이름 : 서정현
 * 내용 : 자바 총정리 연습문제
 */
@FunctionalInterface
interface MyLambda<T> {
	public T what(T n);
}
public class Test06 {
	
	public static void main(String[] args) {
		
		MyLambda<Integer> factoral = n -> {
			
			int result = 1;
			
			for(int i=1; i<=n; i++) {
				result *= i;
			}
			return result;
		};
		
		System.out.println("3! = " + factoral.what(3));
		System.out.println("5! = " + factoral.what(5));
		
		MyLambda<String> reverse = (s) -> {
			
			String result = "";
			
			for(int i=s.length()-1; i>=0; i--) {
				result += s.charAt(i);
			}
			return result;
		};
		
		System.out.println("Hello 역순 : " +  reverse.what("Hello"));
		System.out.println("Hello 역순 : " +  reverse.what("World"));
	
		
		
	}
	
}
