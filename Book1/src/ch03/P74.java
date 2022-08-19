package ch03;
/*
 * 날짜 : 2022/08/18
 * 이름 : 서정현
 * 내용 : 산술 연산자를 사용하여 총점과 평균 구하기
 */
public class P74 {
	public static void main(String[] args) {
		int mathScore = 4;
		int engScore = 5;
		
		int totalScore = mathScore + engScore; // 총점 구하기
		System.out.println(totalScore);
		
		double avgScore1 = totalScore/2.0; //double타입으로 변경된 후에 계산이 되어 저장된다.
		double avgScore2 = totalScore/2;   //int타입으로 계산한 후에 저장된다.
		
		System.out.println(avgScore1);
		System.out.println(avgScore2);
		
		
	}
}
