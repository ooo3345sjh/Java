package ch02;
/*
 * 날짜 : 2022/08/17
 * 이름 : 서정현
 * 내용 : 명시적 형 변환
 */

public class P68 {
	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
	}
	
}
