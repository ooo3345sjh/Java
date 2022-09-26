package ch13;

/*
 * 날짜 : 2022/09/26
 * 이름 : 서정현
 * 내용 : 
 * 	- 인터페이스 구현하기
 * 	- 추상 메서드 구현하기(P466)
 * 	- 메서드 테스트하기(P466)
 * 	- 람다식으로 인터페이스 구현하기(P467)
 *  - 
 */

@FunctionalInterface
interface StringConcat {
	public void makeString(String s1, String s2);
}

class StringConCatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "," + s2);
	}
	
}

public class P465_P467 {
	public static void main(String[] args) {
		
		// 1. 객체 지향 프로그래밍 방식
		String s1 = "Hello";
		String s2 = "World";
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2);
		
		// 2. 람다식
		StringConcat concat2 = (s, v) -> System.out.println(s1 + "," + s2);
		concat2.makeString(s1, s2);
		
		
	}
}


