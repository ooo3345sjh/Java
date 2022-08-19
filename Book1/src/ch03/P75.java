package ch03;

/*
 * 날짜 : 2022/08/18
 * 이름 : 서정현
 * 내용 : 증가, 감소 연산자를 사용하여 값 연산하기
 */
public class P75 {
	public static void main(String[] args) {
		int gameScore = 150; //게임에서 획득한 점수는 150점;
		
		int lastScore1 = ++gameScore; 	//gameScore에 1만큼 더한 값을 lastScore1에 대입
		System.out.println(lastScore1); //151

		int lastScore2 = --gameScore; 	//gameScore에 1만큼 뺀 값을 lastScore2에 대입
		System.out.println(lastScore2);	//150
		
		System.out.println(gameScore);
		
		
		
	}
}
