package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/08/28
 * 이름 : 서정현
 * 내용 : 백준 6단계 7번 : 상수
 */
public class _07 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		char[] a = st.nextToken().toCharArray();
		char[] b = st.nextToken().toCharArray();
		
		char arr[][] = {a, b};
		int[] num = new int[2];
	
		for(int i=0; i<2; i++) {
				char temp = arr[i][2];
				arr[i][2] = arr[i][0];
				arr[i][0] = temp;
				
				num[i] += (arr[i][0] - '0')*100;
				num[i] += (arr[i][1] - '0')*10;
				num[i] += (arr[i][2] - '0')*1;
		}
		
		if(num[0] > num[1]) {
			System.out.println(num[0]);
		} else {
			System.out.println(num[1]);
		}
	}
}
