package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/21
 * 이름 : 서정현
 * 내용 : 백준 3단계 4번 : 영수증
 */
public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int typeNum = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<typeNum; i++) {
			int cost = sc.nextInt();
			int num = sc.nextInt(); 
			sum += cost * num;
		}
		
		if(sum == total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
