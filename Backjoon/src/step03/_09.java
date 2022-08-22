package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 날짜 : 2022/08/21
 * 이름 : 서정현
 * 내용 : 백준 3단계 9번 : 별 찍기 - 2
 */
public class _09 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=num; i++) {
			
			for(int k=num; k>i; k--) {
				sb.append(" ");
			}
			
			for(int j=0; j<i ; j++) {
				sb.append("*");
			}
			
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
