package step09;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 서정현
 * 내용 : 피보나치 수 5
 */
public class _02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = Fibonacci(n);
		System.out.println(total);
		
		sc.close();
	}
	
	public static int Fibonacci (int n) {
		
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}
}
