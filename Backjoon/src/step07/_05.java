package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.security.sasl.SaslException;

/*
 * 날짜 : 2022/08/30
 * 이름 : 서정현
 * 내용 : 백준 7단계 5번 : ACM 호텔
 */
public class _05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //테스트 케이스 수
		StringTokenizer st; 
		
		for(int i=0; i<n; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int floor = Integer.parseInt(st.nextToken()); //층수
			int roomNumOfFloor = Integer.parseInt(st.nextToken()); //방 갯수
			int number = Integer.parseInt(st.nextToken()); //몇번째 고객
			int colum = 1;
			int roomNum = 0;
			
			if(number > roomNumOfFloor) {
				System.out.println("객실이 만실입니다.");
				return;
			}
			
			while(true) {
				if(number > floor) {
					number -= floor;
					colum++;
				} else if(number <= floor) {
					roomNum = (number*100) + colum;
					break;
				}
			}
			
			System.out.println(roomNum);
		}
	}
}
