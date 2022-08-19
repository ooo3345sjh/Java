package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 서정현
 * 내용 : 백준 1단계 12번 : 곱셈 
 */
public class _12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int a = (num2%10);
		int b = (num2%100)/10;
		int c = num2/100;
		
		System.out.println(a*num1);
		System.out.println(b*num1);
		System.out.println(c*num1);
		System.out.println(num1*num2);
	}
}
