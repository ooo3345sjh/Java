package step06;

import java.io.IOException;
import java.util.Scanner;

/*
 * 날짜 : 2022/08/27
 * 이름 : 서정현
 * 내용 : 백준 6단계 2번 : 숫자의 합
 */
public class _02 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		
		char[] c = str.toCharArray();
		int sum = 0;
		for(int i=0; i<c.length; i++) {
			sum += c[i] - '0';
		}
		
		System.out.println(sum);
	}
}
