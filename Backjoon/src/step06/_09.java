package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/08/28
 * 이름 : 서정현
 * 내용 : 백준 6단계 9번 : 크로아티아 알파벳
 */
public class _09 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] al = {"c=","c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i=0; i<al.length; i++) {
			str = str.replaceAll(al[i], "w");
		}
		System.out.println(str.length());
	}
}
