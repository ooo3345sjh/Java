package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.security.sasl.SaslException;

/*
 * 날짜 : 2022/08/30
 * 이름 : 서정현
 * 내용 : 백준 7단계 6번 : 부녀회장이 될테야
 */
public class _06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = null;
		int peopleNum = 0; //k층 i호에 사는 주민 수 
		
		for(int i=0; i<n; i++) {
			int floor = Integer.parseInt(br.readLine()); //층수
			int roomNum = Integer.parseInt(br.readLine()); //방번호
			int cal = 0;
			arr = new int[roomNum+1];
			
			for(int j=0; j<arr.length; j++) {
				arr[j] = j;
			}
			
			if(floor == 0) {
				System.out.println(arr[roomNum]);
				continue;
			}
			
			for(int j=1; j<=floor; j++) {
				cal = 0;
				for(int k=1; k<=roomNum; k++) {
					cal += arr[k];
					arr[k] = cal;
					
					if(j == floor && k == roomNum) {
						peopleNum = arr[k];
					}
				}
				
			}
			System.out.println(peopleNum);
		}
	}
}
