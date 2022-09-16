package step10;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 서정현
 * 내용 : 팩토리얼
 */
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = factorial(n);
		
		System.out.println(total);
		
		sc.close();
	}
	
	public static int factorial(int n) {
		
		if(n == 1 || n == 0) {
			return 1;
		} else{
			return n * factorial(n - 1);
		}
	}
}
