package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/08/31
 * 이름 : 서정현
 * 내용 : 백준 8단계 1번 : 소수 찾기(2)
 */
public class _01_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = 0;
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			boolean[] prime = make_prime(num);
			
			if(prime[num] == false) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean[] make_prime(int max) {
		
		boolean[] prime = new boolean[max + 1]; // 0부터 시작하므로 +1
		
		//0과 1은 소수가 아니므로 true;
		prime[0] = true;
		prime[1] = true;
		
		for(int i =2; i <= Math.sqrt(max); i++) {
			
			//이미 걸러진 배열일 경우 다음 반복문으로 건너뜀
			if(prime[i] == true) {
				continue;
			}
			
			/*
			정석대로라면 j = i * 2 부터 시작이지만 
			이미 2의 배수가 걸러졌기때문에
			i 의 제곱수부터 시작해도 된다.
			*/
			
			for(int j = i * i; j < max + 1; j = j + i) {
				prime[j] = true;
			}
		}
		
		//배열 index가 소수라면 false로, 아니라면 true로 완성됨
		return prime;
	}
}
