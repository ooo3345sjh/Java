package ch15;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/28
 * 이름 : 서정현
 * 내용 : Scanner 테스트하기
 */
public class P518 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("직업: ");
		String job = sc.nextLine();
		System.out.println("사번: ");
		int num = sc.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}
}
