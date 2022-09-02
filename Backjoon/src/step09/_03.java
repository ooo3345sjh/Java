package step09;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 서정현
 * 내용 : 재귀함수가 뭔가요?
 */
public class _03 {
	
	public static void main(String[] args) {
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다");
		
		
	}
	
	public static int Fibonacci (int n) {
		
		
		
		
		return 1;
	}
	
	public static String stringA() {
		StringBuilder sb = new StringBuilder();
		sb.append("\"재귀함수가 뭔가요?\"\n");
		sb.append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
		sb.append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지\n");
		sb.append("그의 답은 대부분 옳았다고 하네. 그런데 어느날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
		
		return sb.toString();
	}
	
	public static String stringB(int n) {
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n+1; i++) {
			if(i == 1) {
				sb.append(stringA());
				continue;
			}
			sb.append("----");
		}
		
		
		return sb.toString();
	}
}
