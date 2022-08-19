package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 서정현
 * 내용 : 백준 2단계 5번 : 알람 시계 
 */

public class _05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		int temp = minute - 45;
		
		int oMinute;
		int oHour = hour;
		
		if(temp < 0) {
			oMinute = 60 + temp;
			oHour--;
			
			if(oHour < 0) {
				oHour = 23;
			}
			
		} else {
			oMinute = temp;
		}
		
		System.out.printf("%d %d", oHour, oMinute);
		
	}

}
