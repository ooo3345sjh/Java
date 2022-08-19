package ch03;

/*
 * 날짜 : 2022/08/18
 * 이름 : 서정현
 * 내용 : 단락 회로 평가 실습하기
 */
public class P78 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1+10) < 10) && ((i = i+2) < 10); //논리 곱에서 앞 항의 결과 값이 거짓이므로 이 문장은 실행되지 않음.
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1+10) > 10) || ((i = 2+i) < 10); //논리 합에서 앞 항의 결과 값이 참이므로 이 문장은 실행되지 않음.
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}
}
