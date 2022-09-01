package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/08/31
 * 이름 : 서정현
 * 내용 : 백준 8단계 2번 : 소수
 */
public class _02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] prime;
		int num[] = new int[2];
		num[0] = Integer.parseInt(br.readLine()); 
		num[1] = Integer.parseInt(br.readLine()); 
		
		if(num[0] > num[1]) {
			prime =  make_prime(num[0]);
	
			int tmp = num[1];
			num[1] = num[0];
			num[0] = tmp;
			
		} else {
			
			prime = make_prime(num[1]);
			
		}
		
		int sum = 0;
		int min = 9999999;
		
		for(int i = num[0]; i <= num[1]; i++) {
			if(prime[i] == false) {
				sum += i;
				if(min > i) {
					min = i;
				}
			} 
		}
		
		if(sum == 0) {
			System.out.println(-1);
			return;
		}

		System.out.println(sum);
		System.out.println(min);
		
		
	}
	
	public static boolean[] make_prime(int max) {
		
		boolean[] prime = new boolean[max + 1];
		
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2; i <= Math.sqrt(max); i++) {

			
			if(prime[i] == true) {
				continue;
			}
			
			for(int j = i*2; j < max+1; j = j+i) {
				prime[j] = true;
			}
		}
		
		return prime;
	}
}
