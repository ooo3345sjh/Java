package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/01
 * 이름 : 서정현
 * 내용 : 백준 8단계 3번 : 소인수분해
 */
public class _03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		boolean[] checkPrime = make_prime(num);
		
		
		int share = num;
		
		while(true) {
			
			if(checkPrime[share] == false) {
				System.out.println(share);
				return;
			} else if(share == 1) {
				return;
			}
			
			for(int i=2; i<=Math.sqrt(num); i++) {
				
				if(share%i == 0) {
					share /= i;
					System.out.println(i);
					i--;
				} 
			}
		}
		
	}
	
	public static boolean[] make_prime(int num) {
		
		boolean[] prime = new boolean[num + 1];
		
		prime[0] = true;
		prime[1] = true;
		
		for(int i=0; i<=Math.sqrt(num); i++) {
			
			if(prime[i] == true) {
				continue;
			}
			
			for(int j = i * i; j < num + 1 ; j = j + i) {
				prime[j] = true;
			}
		}
		
		return prime;
	}
}
