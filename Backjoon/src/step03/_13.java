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
		
//		String num = br.readLine();
		String num = "23";
		
		int numInt = Integer.parseInt(num);
		
		int intA;
		int intB;
		int sum;
		
		if(numInt >= 10) {
			char a = num.charAt(0);
			char b = num.charAt(1);
			intA = a - '0';
			intB = b - '0';
		} else {
			char b = num.charAt(0);
			intA = 0;
			intB = b -'0';
		}
		
		sum = intA + intB;
		
		
		
		
		System.out.println(a + ", " + b);
		
		
	}
}
