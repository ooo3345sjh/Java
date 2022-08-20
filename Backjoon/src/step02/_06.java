package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/20
 * 이름 : 서정현
 * 내용 : 백준 2단계 6번 : 오븐 시계 
 */

public class _06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int time = sc.nextInt();
		
		//time을 hh:mm으로 분해시키는 작업
		int m = time%60;
		int h = time/60;
		
		hour += h;
		minute += m;
		
		if(minute>=60) {
			hour = hour + (minute/60);
			minute %= 60; 
		}
		
		hour = hour%24;
		
		
		System.out.printf("%d %d", hour, minute);
		
	}

}