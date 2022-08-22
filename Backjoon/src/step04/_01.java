package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/08/23
 * 이름 : 서정현
 * 내용 : 백준 4단계 1번 : 최소, 최대
 */
public class _01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] array = new int[num];
		for(int i=0; i<num; i++) {
			if(st.hasMoreTokens()) {
				array[i] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(array);
		
		System.out.printf("%d %d", array[0], array[num-1]);
	}
}
