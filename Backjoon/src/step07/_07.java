package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.security.sasl.SaslException;

/*
 * 날짜 : 2022/08/30
 * 이름 : 서정현
 * 내용 : 백준 7단계 7번 : 설탕 배달
 */
public class _07 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int weight = Integer.parseInt(br.readLine());
		int num = 0; //필요한 봉지 개수
		
		A:if(weight >= 5) { //중량이 5KG보다 크거나 같은가?
			if(weight % 5 == 0){ //5로 나누어 떨어진다면 5kg봉지로만 배달
				num = weight / 5; 
			} else if((weight % 5) % 3 == 0) { //5으로 나누고 남은 나머지 중량을 3으로 나누어
				num = weight / 5;			   //떨어진다면 배달
				num += (weight % 5) / 3;
			} else {
				int leftWeight = weight % 5;   //5kg 봉지로 나누고 남은 중량
				int count = weight / 5;        //5kg 봉지로 나누었을때 몫값
				while(--count>=0) {            //5kg 봉지를 하나씩 줄여가며 3kg 봉지로 나누어지는지 확인한다.
					leftWeight += 5;
					if(leftWeight % 3 == 0) {
						num = count;
						num += leftWeight/3;
						break A;
					}
				}
				
				num = -1; // 어떠한 조건도 해당하지 않으면 계산 불가
			}
				
		} else {//중량이 5kg보다 작은가?
			if(weight % 3 == 0) { //3으로 나누어 떨어진다면 3kg 봉지로만 배달
				num = weight / 3;
			} else { //3으로 나누어 떨어지지 않는다면 계산 불가
				num = -1;
			}
		}
		System.out.println(num);
	}
}
