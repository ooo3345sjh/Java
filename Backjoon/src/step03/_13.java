package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/08/22
 * 이름 : 서정현
 * 내용 : 백준 3단계 13번 : 더하기 사이클
 */
public class _13 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num = br.readLine();

		int numInt = Integer.parseInt(num);

		int intA;
		int intB;
		int sum;

		if (numInt >= 10) {
			char a = num.charAt(0);
			char b = num.charAt(1);
			intA = a - '0';
			intB = b - '0';
		} else {
			char b = num.charAt(0);
			intA = 0;
			intB = b - '0';
		}
		int count=0;
		
		while (true) {
			count++;
			
			sum = intA + intB;

			num = String.valueOf(intB) + String.valueOf(sum%=10);
			
			if (Integer.parseInt(num) == numInt) {
				System.out.println(count);
				break;
			}
			
			char a = num.charAt(0);
			char b = num.charAt(1);
			intA = a - '0';
			intB = b - '0';
		}
	}
}
