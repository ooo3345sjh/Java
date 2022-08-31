package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 날짜 : 2022/08/30
 * 이름 : 서정현
 * 내용 : 백준 7단계 8번 : 큰 수 A+B
 */
public class _08 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] tmpA = st.nextToken().toCharArray();
		char[] tmpB = st.nextToken().toCharArray();
		
		int length = 0;
		int[] sum;
		if(tmpA.length <= tmpB.length) {
			length = tmpB.length;
			sum = new int[tmpB.length];
		} else {
			length = tmpA.length;
			sum = new int[tmpA.length];
		}
		
		int[] arrA = intArr(tmpA, length);
		int[] arrB = intArr(tmpB, length);
		
//		for(int i=length - tmpA.length, j=0; i<length; i++, j++) {
//			if(j<tmpA.length) {
//				arrA[i] = tmpA[j] - '0';
//			} else {
//				arrA[i] = 1;
//			}
//		}
//		
//		for(int i=length - tmpB.length, j=0; i<length; i++, j++) {
//			if(j<tmpB.length) {
//				arrB[i] = tmpB[j] - '0';
//			} else {
//				arrB[i] = 0;
//			}
//		}
		
		
		int ascendNum  = 0;
		for(int i=length-1; i>=0; i--) {
			
			int temp = arrA[i] + arrB[i] + ascendNum;
			sum[i] = temp%10;
			
			if(temp / 10 != 0) {
				ascendNum = temp / 10;
				if(i == 0) {
					int arrTemp[] = sum.clone();
					sum = new int[sum.length+1];
					for(int j=arrTemp.length-1; j>=0; j--) {
						sum[j+1] = arrTemp[j];
					}
					sum[0] = 1; 
				}
			} else {
				ascendNum = 0;
			}
		}
		
		for(int i=0; i<sum.length; i++) {
			System.out.print(sum[i]);
		}
	}
	
	public static int[] intArr(char[] ch, int length) {
		
		int[] arr = new int[length];
		
		for(int i=length - ch.length, j=0; i<length; i++, j++) {
			if(j<ch.length) {
				arr[i] = ch[j] - '0';
			} else {
				arr[i] = 1;
			}
		}
		
		return arr;
	}
}
