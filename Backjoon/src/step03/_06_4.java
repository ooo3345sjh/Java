package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/08/21
 * 이름 : 서정현
 * 내용 : 백준 3단계 6번 : A+B - 7
 * 소요 시간 : 132ms (가장 빠름)
 * 참고 사이트 : https://st-lab.tistory.com/33
 */
public class _06_4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());  
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=num; i++){
			String str = br.readLine();
			sb.append("Case #");
			sb.append(i);
			sb.append(": ");
			sb.append((str.charAt(0)-'0') + (str.charAt(2)-'0'));
			sb.append("\n");
			
			
		}
		System.out.printf("%s", sb);
	}

}
