package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/08/26
 * 이름 : 서정현
 * 내용 : 백준 4단계 2번 : 나머지
 */
public class _03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		int[] arr = new int[num];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int maxScore = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[0] < arr[i+1]) {
				int temp = arr[i+1];
				arr[i+1] = arr[0];
				arr[0] = temp;
				maxScore = arr[0];
				
			} else {
				maxScore = arr[0];
			}
		}
		
		if(num == 1) maxScore = arr[0];
		
		double total = 0;
		double avg = 0;
		for(int i : arr) {
			double cal = ((double)i/maxScore) * 100;
			total += cal;
		}
		
		avg = total / num;
		System.out.print(avg);
	}
}
