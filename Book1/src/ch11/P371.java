package ch11;

/*
 * 날짜 : 2022/09/19
 * 이름 : 서정현
 * 내용 : 두 문자열 연결하기
 */
public class P371 {
	
	public static void main(String[] args) {
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값 : " + System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr); //새로운 객체를 생성해서 참조변수에 주소를 저장하게 됨.
		
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값: " + System.identityHashCode(javaStr));
	}
}
