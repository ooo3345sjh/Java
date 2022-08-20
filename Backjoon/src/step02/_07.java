package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/20
 * 이름 : 서정현
 * 내용 : 백준 2단계 7번 : 주사위 세개 
 */

public class _07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int money = 0;
		int top;
		
		if((num1 == num2) && (num1 == num3)) {
			
			money = 10000 + (num1 *1000);
		}
		else if(((num1 == num2) && (num1 != num3))) {
			
			money = 1000 + (num1 *100);
		}
		else if(((num1 == num3) && (num1 != num2))){
			
			money = 1000 + (num1 *100);
			
		}
		else if(((num2 == num3) && (num2 != num1))) {
			
			money = 1000 + (num2 *100);
			
		}
		else if((num1 != num2) && (num3 != num1) && (num2 != num3)) {
			if(num1>num2) {
				top = num1;
			} else {
				top = num2;
			}
			
			if(top < num3) {
				top = num3;
			}
			money = top*100;
		}
		
		System.out.println(money);
		
		sc.close();
	
	}

}