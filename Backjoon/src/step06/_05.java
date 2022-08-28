package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/08/28
 * 이름 : 서정현
 * 내용 : 백준 6단계 5번 : 단어 공부
 *  - 참고한 코드(1)
 */
public class _05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		
		int[] arr = new int[26];
		char[] word = str.toCharArray();
		
		for(int i=0; i<word.length; i++) {
			arr[word[i] - 65]++;
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65);
			} else if(arr[i] == max) {
				ch = '?';
			}
			
		}
		System.out.println(ch);
	}
}
