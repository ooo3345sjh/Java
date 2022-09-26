package ch13;

/*
 * 날짜 : 2022/09/26
 * 이름 : 서정현
 * 내용 : 
 * 	- 함수형 인터페이스 선언하기
 * 	- 람다식 구현과 호출
 */

@FunctionalInterface
interface Mynumber {
	int getMax(int num1, int num2);
}

public class P463 {
	public static void main(String[] args) {
		Mynumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMax(10, 20));
	}
}
