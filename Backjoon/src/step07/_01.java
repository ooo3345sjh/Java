package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.security.sasl.SaslException;

/*
 * 날짜 : 2022/08/29
 * 이름 : 서정현
 * 내용 : 백준 7단계 1번 : 손익분기점
 */
public class _01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int fixedCost = Integer.parseInt(st.nextToken()); //고정 비용
		int variableCost = Integer.parseInt(st.nextToken()); //가변 비용
		int cost = Integer.parseInt(st.nextToken()); //소비자가
		long salesCost = 0; //총 판매수입
		
		long total = fixedCost; // 고정 + 가변
		long count = 0; //판매량
		
		if(cost <= variableCost) {
			
			count = -1;
			
		} else {
			
//			while(salesCost <= total) {
//				total += variableCost;
//				salesCost += cost;
//				
//				count++;
//			}
			
			count = (fixedCost / (cost - variableCost)) + 1;
			
		}
		
		System.out.println(count);
		
	}

}
