package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/09/02
 * 이름 : 서정현
 * 내용 : 백준 8단계 5번 : 베르트랑 공준
 */
public class _05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] prime;
		
		
		while(true) {
			int a = Integer.parseInt(br.readLine());
		
			if(a == 0) return ;
			
			int count = 0;	
			
			prime = make_prime(a * 2);
			
			for(int i = a + 1; i <= a * 2; i++) {
				
				if(prime[i] == false) {
					count++;
				}
			}
			System.out.println(count);
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
}
