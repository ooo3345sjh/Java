package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/08/26
 * 이름 : 서정현
 * 내용 : 백준 4단계 2번 : 최댓값
 */
public class _02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = new String[9];
		for(int i=0; i<arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		int[] intArr = new int[9];
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]); 
		}
		
		int maxNum = 0;
		int loc = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(intArr[0]<intArr[i+1]) {
				int temp = intArr[i+1];
				intArr[i+1] = intArr[0];
				intArr[0] = temp;
				maxNum = intArr[0];
				loc = i+1;
			} else {
				maxNum = intArr[0];
			}
		}
		
		System.out.println(maxNum);
		System.out.println(loc+1);
		
	}
}
