package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/08/21
 * 이름 : 서정현
 * 내용 : 백준 3단계 7번 : A+B - 7
 * 소요 시간 : 136ms
 * 참고 사이트 : https://st-lab.tistory.com/33
 */
public class _07 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());  
		
		for(int i=1; i<=num; i++){
			String str = br.readLine();
			
			st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append("Case #");
			sb.append(i);
			sb.append(": ");
			sb.append(a);
			sb.append(" + ");
			sb.append(b);
			sb.append(" = ");
			sb.append(a+b);
			sb.append("\n");
		}
		System.out.printf("%s", sb);
	}

}
