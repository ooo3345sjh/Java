package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/08/27
 * 이름 : 서정현
 * 내용 : 백준 4단계 4번 : OX퀴즈
 */
public class _04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] arr = new String[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = br.readLine();
		}
		
		for(String s : arr) {
			int score = 0;
			int temp = 0;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == 'O') {
					score += ++temp;
				} else {
					temp = 0;
				}
			}
			System.out.println(score);
		}
	}
}
