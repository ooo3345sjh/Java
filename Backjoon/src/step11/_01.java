package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/09/19
 * 이름 : 서정현
 * 번호 : 2798번
 * 내용 : 블랙잭 
 */
public class _01 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = search(arr, n, m);
		
		System.out.println(result);
		
		
		
	}
	
	// 탐색
	public static int search(int[] arr, int n, int m) {
		
		int result = 0;
		
		// 3개를 고르기 때문에 첫번째 카드는 N - 2 까지만 순회
		for(int i=0; i<n-2; i++) {
			
			// 두 번째 카드는 첫 번째 카드 다음부터 N - 1 까지만 순회
			for(int j=i+1; j<n-1; j++) {
				
				// 세 번째 카드는 두 번째 카드 다음부터 N 까지 순회
				for(int k=j+1; k<n; k++) {
					
					// 3개 카드의 합 변수 temp
					int temp = arr[i] + arr[j] + arr[k];
					
					// M과 세 카드의 합이 같다면 temp return 및 종료 
					if(m == temp) {
						return temp;
					}
					
					// 세 카드의 합이 이전 합보다 크면서 M 보다 작을 경우 result 갱신 
					if(result < temp && temp < m) {
						result = temp;
					}
				}
			}
		}
		
		// 모든 순회를 마치면 result 리턴 
		return result;
	}
}
