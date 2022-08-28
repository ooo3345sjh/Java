package step06;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/08/28
 * 이름 : 서정현
 * 내용 : 백준 6단계 4번 : 문자열 반복
 */
public class _04 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		
		for(int k=0; k<count; k++) {
			String tmp[] = sc.nextLine().split(" ");
			
			int num = Integer.parseInt(tmp[0]);
			char[] word = tmp[1].toCharArray();
			
			for(int i=0; i<word.length; i++) {
				
				for(int j=0; j<num; j++) {
					
					System.out.print(word[i]);
				}
			}
			System.out.println();
		}
	}
}
