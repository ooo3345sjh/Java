package ch04;

/*
 * 날짜 : 2022/08/19
 * 이름 : 서정현
 * 내용 : while문 활용하여 1부터 10까지 더하기
 */

public class P109 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <=10) { //num값이 10보다 작거나 같을 동안
			sum += num;	  //합계를 뜻하는 sum에 num를 더하고
			num++;  	  //num에 1씩 더해 나감
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}
}
