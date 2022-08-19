package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 서정현
 * 내용 : 백준 1단계 10번 : 킹, 퀸, 룩, 비숍, 나이트, 폰 
 */

public class _10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		System.out.printf("%d %d %d %d %d %d", 1-a, 1-b, 2-c, 2-d, 2-e, 8-f);
		
	}

}
