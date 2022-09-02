package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/09/01
 * 이름 : 서정현
 * 내용 : 백준 8단계 4번 : 소수 구하기
 */
public class _04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		boolean prime[];
		
		if(a > b) {
			int temp = b;
			b = a;
			a = temp;
		}
		
		prime = make_prime(b);
		
		for(int i = a; i <= b; i++) {
			if(prime[i] == false) {
				System.out.println(i);
			}
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
