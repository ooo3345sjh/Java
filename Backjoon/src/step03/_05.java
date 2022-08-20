package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/08/21
 * 이름 : 서정현
 * 내용 : 백준 3단계 5번 : 빠른 A+B
 */
public class _05 {
	public static void main(String[] args) throws IOException  {
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int num = Integer.parseInt(bs.readLine());
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(bs.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int sum = a+b;
			
			bw.write(sum + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}

}
