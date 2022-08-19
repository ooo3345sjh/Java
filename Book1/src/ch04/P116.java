package ch04;

/*
 * 날짜 : 2022/08/19
 * 이름 : 서정현
 * 내용 : 중첩된 반복문
 */

public class P116 {
	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan=2; dan<=9; dan++) {
			System.out.println(dan + "단");
			for(times=1; times<=9; times++) {
				System.out.printf("%d x %d = %d\n", dan, times, (dan*times));
			}
			System.out.println();
		}
	}
}
