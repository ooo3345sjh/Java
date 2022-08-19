package ch04;

/*
 * 날짜 : 2022/08/19
 * 이름 : 서정현
 * 내용 : switch-case문 예제(2)
 */

public class P105 {
	public static void main(String[] args) {
		String medal = "Gold";
		
		switch(medal) {
			case "Gold" : {
				System.out.println("금메달입니다.");
			}
			case "Silver" : {
				System.out.println("은메달입니다.");
			}
			case "Bronze" : {
				System.out.println("동메달입니다.");
			}
			default : {
				System.out.println("메달이 없습니다.");
			}
		}
	}
}
