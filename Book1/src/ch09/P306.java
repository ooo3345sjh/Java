package ch09;

/*
 * 날짜 : 2022/09/02
 * 이름 : 서정현
 * 내용 : P306 ~ P307
 * 	- 여러 파일에서 공유하는 상수
 * 	- 상수 사용하기
 */ 
class Define {
	public static final int MIN = 1;
	public static final int MAX = 99999;
	public static final int ENG = 1001;
	public static final int MATH = 2001;
	public static final double PI = 3.14;
	public static final String GOOD_MORNING = "Good Morning!";
}

public class P306 {
	public static void main(String[] args) {
		System.out.println(Define.GOOD_MORNING);
		System.out.println("최솟값은 " + Define.MIN + "입니다.");
		System.out.println("최댓값은 " + Define.MAX + "입니다.");
		System.out.println("수학 과목 코드 값은 " + Define.MATH + "입니다.");
		System.out.println("영어 과목 코드 값은 " + Define.ENG + "입니다.");
	}
}
