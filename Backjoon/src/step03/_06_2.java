package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/21
 * 이름 : 서정현
 * 내용 : 백준 3단계 6번 : A+B - 7
 * 소요 시간 : 276ms(가장 느림)
 */

public class _06_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();  
		
		for(int i=1; i<=num; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.printf("%s%d%s%d%s","Case #", i,  ": ", (a+b), "\n");
		}
		
		sc.close();
	}

}
