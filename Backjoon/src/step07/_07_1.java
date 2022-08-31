package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.security.sasl.SaslException;

/*
 * 날짜 : 2022/08/30
 * 이름 : 서정현
 * 내용 : 백준 7단계 7번 : 설탕 배달
 * 참고한 코드(https://st-lab.tistory.com/72)
 * 
 */
public class _07_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if (n == 4 || n == 7) {
			System.out.println(-1);
		}
		else if (n % 5 == 0) {
			System.out.println(n / 5);
		}
		else if (n % 5 == 1 || n % 5 == 3) {
			System.out.println((n / 5) + 1);
		}
		else if (n % 5 == 2 || n % 5 == 4) {
			System.out.println((n / 5) + 2);
		}
	}
}
