package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/08/21
 * 이름 : 서정현
 * 내용 : 백준 3단계 6번 : A+B - 7
 * 소요 시간 : 136ms
 */
public class _06_3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());  
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=num; i++){
			st = new StringTokenizer(br.readLine());
			
			sb.append("Case #");
			sb.append(i);
			sb.append(": ");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			sb.append("\n");
			
			
		}
		System.out.printf("%s", sb);
	}

}
