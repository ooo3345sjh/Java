package test;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 서정현
 * 내용 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 프로그램을 작성하시오.
 * 		 (단, 오른쪽 기준으로 정렬)
 * 		 입력조건 : 첫째 줄에 N(1 <= N <= 100)이 주어진다.
 * 		 출력조건 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */
public class test02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			for(int j = 1; j <num-i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
