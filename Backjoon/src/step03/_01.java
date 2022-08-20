package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/20
 * 이름 : 서정현
 * 내용 : 백준 3단계 1번 : 구구단 
 */
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d", dan, i, (dan * i));
			System.out.println();
		}
	}

}
