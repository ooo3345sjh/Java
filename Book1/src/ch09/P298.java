package ch09;

/*
 * 날짜 : 2022/09/02
 * 이름 : 서정현
 * 내용 : P298 ~ P303 
 * 	- Player 클래스 구현하기 
 * 	- PlayerLevel 추상 클래스 구현하기 
 * 	- 초보자 레벨 클래스 구현하기 
 * 	- 중급자 레벨 클래스 구현하기 
 * 	- 고급자 레벨 클래스 구현하기 
 * 	- 테스트 프로그램 실행하기 
 */
class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}

abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}

class BeginnerLevel extends PlayerLevel {
	
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump할 줄 모르지롱.");
	}

	@Override
	public void turn() {
		 System.out.println("Turn할 줄 모르지롱.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 초보자 레벨입니다. ******");
	}
	
}

class AdvancedLevel extends PlayerLevel {
	
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
		 System.out.println("Turn할 줄 모르지롱.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 중급자 레벨입니다. ******");
	}
	
}

class SuperLevel extends PlayerLevel {
	
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
		System.out.println("***** 고급자 레벨입니다. ******");
	}
	
}

public class P298 {
	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
	}

}
