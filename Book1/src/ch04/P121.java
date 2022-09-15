package ch04;

/*
 * 날짜 : 2022/08/19
 * 이름 : 서정현
 * 내용 : break문 예제
 */

public class P121 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 0; ; num++) { //합한 값이 100보다 클 때 종료
			sum += num;
			if(sum > 100) {
				break;
			}
		}
		
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}
}
