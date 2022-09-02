package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/09/02
 * 이름 : 서정현
 * 내용 : 백준 8단계 6번 : 골드바흐의 추측
 */
public class _06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int repeat = 0;
		
		while(repeat++ < n) {
			int num = Integer.parseInt(br.readLine());
			int arr[] = arrPrime(num);
			int pre = 99999999;
			int a = 0;
			int b = 0;
			
			for(int i = 0; i < arr.length; i++) {
				
				if((arr[i] + arr[arr.length-1]) < num) {
					continue;
				}
				
				for(int j = i; j < arr.length; j++) {
					if(arr[i] + arr[j] == num) {
						if(j - i < pre) {
							pre = j - i;
							a = arr[i];
							b = arr[j];
						}
					}
				}
			}
			System.out.println(a + " " + b);
		}	
	}
	
	public static boolean[] make_prime(int num) {
		
		boolean[] prime = new boolean[num + 1];
		
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 0; i <= Math.sqrt(num); i++) {
			
			if(prime[i] == true) {
				continue;
			}
			
			for(int j = i * i; j < num + 1; j = j + i) {
				prime[j] = true;
			}
		}
		
		return prime;
	}
	
	public static int[] arrPrime(int num) {
		
		boolean[] prime = make_prime(num);
		
		int[] arr;
		int count = 0;
		
		for(int i = 2; i < prime.length; i++) {
			if(prime[i] == false) {
				count++;
			}
		}
		arr = new int[count];
		
		count = 0;
		for(int i = 0; i < prime.length; i++) {
			if(prime[i] == false) {
				arr[count++] = i; 
			}
		}
		
		return arr;
	}
}
