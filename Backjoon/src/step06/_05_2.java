package step06;

/*
 * 날짜 : 2022/08/28
 * 이름 : 서정현
 * 내용 : 백준 6단계 5번 : 단어 공부
 *  - 참고한 코드(2)
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class _05_2 {
 
	public static void main(String[] args) throws IOException{
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26]; // 영문자의 개수는 26개임
		String s = br.readLine();
		
 
		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				arr[s.charAt(i) - 97]++;
			} else {
				arr[s.charAt(i) - 65]++;
			}
		}
		int max = -1;
		int ch = -2;
		for (int i = 0; i < 26; i++) {
 
			if (arr[i] > max) {
				max = arr[i];
				ch = i;
			} 
			else if (arr[i] == max) {
				ch = -2;
			}
		}
		System.out.print((char)(ch + 65));
	}
 
}
