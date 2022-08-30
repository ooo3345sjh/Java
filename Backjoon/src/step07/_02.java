package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.security.sasl.SaslException;

/*
 * 날짜 : 2022/08/29
 * 이름 : 서정현
 * 내용 : 백준 7단계 2번 : 벌집
 */
public class _02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int level = 2;
		int val = 7;
		
		while(true) {
			if(num == 1) {
				level = 1;
				break;
			} else if(num <= val) {
				break;
			}
			level++;
			val += (level-1)*6;
		}
		System.out.println(level);
	}

}
