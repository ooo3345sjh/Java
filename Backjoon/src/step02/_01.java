package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 서정현
 * 내용 : 백준 2단계 1번 : 두 수 비교하기 
 */
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) System.out.println(">");
		else if(a < b) System.out.println("<");
		else if(a == b) System.out.println("==");
		
	}
}
