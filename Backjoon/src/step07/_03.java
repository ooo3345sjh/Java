package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.security.sasl.SaslException;

/*
 * 날짜 : 2022/08/30
 * 이름 : 서정현
 * 내용 : 백준 7단계 3번 : 분수찾기
 */
public class _03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int numerator = 0; //분자
		int denominator = 0; //분모

		int pre = 0; //이전 단계
		int total = 0; //현재 단계
		int sum = 2; //분자 + 분모 합
		
		for(int i=1; ; i++, sum++) {
			total += i;  //total = 1 + 2 + 3 + 4 + 5............
			if(num<=total) {
				
				int tmp = num - pre; // 2
				
				if(sum%2 == 0) { //분자 + 분모 합이 짝수일 경우
					numerator = sum - tmp;
					denominator = tmp;
					break;
				} else if (sum%2 != 0) { //분자 + 분모 합이 홀수일 경우
					numerator = tmp;
					denominator = sum - tmp;
					break;
				}
			}
			pre = total;
		}
		String str = numerator + "/" + denominator;
		
		System.out.println(str);
	}

}
