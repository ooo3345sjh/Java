package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/08/27
 * 이름 : 서정현
 * 내용 : 백준 4단계 5번 : 평균은 넘겠지
 */
public class _05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		int[] arr = null;
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			int length = Integer.parseInt(st.nextToken());
			arr = new int[length];
			
			for(int j=0; j<arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			double total = 0;
			double avg;
			int studentNum = 0;
			
			for(int k=0; k<arr.length; k++) {
				total += arr[k];
			}
			
			avg = total / length;
			
			for(int n=0; n<arr.length; n++) {
				if(arr[n] > avg) {
					studentNum++;
				}
			}
			
			double ratio = ((double)studentNum / length) * 100;
			
			System.out.printf("%.3f%%\n", ratio);
		}
	}
}
