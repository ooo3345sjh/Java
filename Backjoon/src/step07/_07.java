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
 */
public class _07 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int weight = Integer.parseInt(br.readLine());
		
		int a = weight / 5;
		int b = (weight % 5) / 3;
		int c = (weight % 5) % 3;
		
		if(c != 0) {
			System.out.println("-1");
			return;
		}
		
		System.out.println(a+b);
	}
}
