package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.security.sasl.SaslException;

/*
 * 날짜 : 2022/08/30
 * 이름 : 서정현
 * 내용 : 백준 7단계 4번 : 달팽이는 올라가고 싶다
 */
public class _04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int goUp = Integer.parseInt(st.nextToken());
		int goDown = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		int day = 1;
		
		sum = goUp - goDown;
		int tmp = (height - goUp);
		
		if(tmp%sum > 0) {
			day = (tmp / sum) + 2; 
		} else {
			day = (tmp / sum) + 1;
		}
		
//		while(sum<height) {
//			sum += goUp;
//			if(sum >= height) {
//				break;
//			}
//			sum -= goDown;
//			day++;
//		}
		System.out.println(day);
	}
}
