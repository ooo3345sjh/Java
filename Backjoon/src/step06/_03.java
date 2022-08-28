package step06;

import java.io.IOException;
import java.util.Scanner;

/*
 * 날짜 : 2022/08/27
 * 이름 : 서정현
 * 내용 : 백준 6단계 3번 : 알파벳 찾기
 */
public class _03 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] word = str.toCharArray();
		
		char var = 'a'; 
		for(int i=0; i<26; i++, var++) {
			int loc = -1;
			
			for(int j=0; j<word.length; j++) {
				
				if(var == word[j]) {
					loc = j;
					break;
				}  
			}
			System.out.print(loc + " ");
		}
		
	}
}
