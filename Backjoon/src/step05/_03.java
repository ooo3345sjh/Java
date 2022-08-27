package step05;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/27
 * 이름 : 서정현
 * 내용 : 백준 5단계 3번 : 한수
 */

public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(isArithmetical(sc.nextInt()));
		
	}
	
	public static int isArithmetical(int num) {
		int val;
		int arr[];
		int n = 0; // 한수의 개수
		String tmp = String.valueOf(num);
		int length = tmp.length(); // 배열길이
		
		if(num < 100) { //99이하는 전부 등차수열이다.
			n = num;
		} else if(num >= 100) {
			n = 99; //100이상일 경우 한수의 최소 개수는 99개이다.
			
			for(int i=100; i<=num; i++) {
				arr = new int[length];
				val = i; //100 ~ num까지 넣어서 등차수열인지 확인
				
				int count = length-1; 
				while(val != 0) {
					arr[count--] = val%10; //일의 자릿수부터 대입하기 시작
					val = val/10;
				}
				
				int allowance = arr[0] - arr[1]; //공차
				for(int j=1; j<arr.length-1; j++) {
					int var = arr[j] - arr[j+1];
					if(allowance == var && j == arr.length-2) { //공차가 같으면 등차 수열
						n++;
					}
				}
			}
		}
		return n;
	}
}
