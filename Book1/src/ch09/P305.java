package ch09;

/*
 * 날짜 : 2022/09/02
 * 이름 : 서정현
 * 내용 : final 실습하기
 */
class Constant {
	int num = 10;
	final int NUM = 100;
}

public class P305 {
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
		//	cons.NUM = 200; 상수에 값을 대입하여 오류 발생
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}

}
