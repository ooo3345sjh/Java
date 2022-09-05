package ch09;

/*
 * 날짜 : 2022/09/02
 * 이름 : 서정현
 * 내용 : P308
 * 	- 테스트 코드(최종 실행 파일)부터 만들기
 */ 
class Player1 {
	
	PlayerLevel1 level;
	
	Player1 (){
		level = new BeginnerLevel1();
		level.showLevelMessage();
	}
	
	public void upgradeLevel1(PlayerLevel1 level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.play(count);
	}
	
	
}

abstract class PlayerLevel1 {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final void play(int n) {
		run();
		for(int i = 0; i < n; i++) {
			jump();
		}
		turn();
	}
}

class BeginnerLevel1 extends PlayerLevel1 {
	
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump할 줄 모르지롱");
	}

	@Override
	public void turn() {
		System.out.println("turn할 줄 모르지롱");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 초급자 레벨입니다. ******");
		
	}
	
}

class AdvancedLevel1 extends PlayerLevel1 {
	
	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}
	
	@Override
	public void jump() {
		System.out.println("높이 jump합니다.");
	}
	
	@Override
	public void turn() {
		System.out.println("turn할 줄 모르지롱");
	}

	@Override
	public void showLevelMessage() {
		
		System.out.println("****** 중급자 레벨입니다. ******");
	}
	
}

class SuperLevel1 extends PlayerLevel1 {
	
	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}
	
	@Override
	public void jump() {
		System.out.println("아주 높이 jump합니다.");
	}
	
	@Override
	public void turn() {
		System.out.println("한 바퀴 돕니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 고급자 레벨입니다. ******");
		
	}
	
}

public class P308 {
	public static void main(String[] args) {
		Player1 player = new Player1();
		player.play(1);
		
		AdvancedLevel1 aLevel = new AdvancedLevel1();
		player.upgradeLevel1(aLevel);
		player.play(2);
	
		SuperLevel1 sLevel = new SuperLevel1();
		player.upgradeLevel1(sLevel);
		player.play(3);
	}
}
