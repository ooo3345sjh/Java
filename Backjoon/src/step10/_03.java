package step10;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 서정현
 * 내용 : 재귀함수가 뭔가요? 
 */
public class _03 {
	
	static String[] str = new String[6];
	static StringBuilder sb = new StringBuilder();
	static int num;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		addArr();
		
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		f(num);
		System.out.println(sb.toString());
		
		
	}
	
	public static void f(int n) {

		
		if(n == 0) { //재귀함수에 대한 대답을 들을 때
			
			String[] strArr = {str[0], str[4], str[5]};

			for (int i = 0; i < 3; i++) {
			
				for (int j = 0; j < num; j++) {

					sb.append("____");
				}
				sb.append(strArr[i]);
			}
			
			for(int j = 0; j < num; j++) {
				
				for(int i = j + 1; i <num; i++) {
					sb.append("____");
				}
				
				sb.append(strArr[2]);
			}
			
			
			return;
			
		} else {
			
			for (int i = 0; i < 4; i++) {
				for (int j = n; j < num; j++) {

					sb.append("____");
				}

				sb.append(str[i]);
			}
			
			f(n-1);
		}
	}
	
	public static void addArr() {
		str[0] = "\"재귀함수가 뭔가요?\"\n";
		str[1] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
		str[2] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
		str[3] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
		str[4] = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
		str[5] = "라고 답변하였지.\n";
	}
	
}
