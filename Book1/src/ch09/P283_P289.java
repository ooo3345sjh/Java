package ch09;

/*
 * 날짜 : 2022/09/02
 * 이름 : 서정현
 * 내용 : P283 ~ P289
 * 	- 추상 클래스 구현하기
 * 	- 추상 클래스 상속받기 
 * 	- 추상 메서드 구현하기 
 * 	- NoteBook 클래스 구현하기 
 * 	- MyNoteBook 클래스 구현하기
 * 	- 추상 클래스 테스트하기
 */
abstract class Computer {
	
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOdd() {
		System.out.println("전원을 끕니다.");
	}
}

class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}
	
}

abstract class NoteBook extends Computer{
	
	@Override
	public void display() {
		System.out.println("NoteBook display()");
	}
}

class MyNoteBook extends NoteBook {
	
	@Override
	public void typing() {
		System.out.println("MyNotBook typing()");
	}
}

public class P283_P289 {
	public static void main(String[] args) {
	//추상클래스는 객체생성이 불가능
	//	Computer c1 = new Computer();  
		Computer c2 = new DeskTop();
	//	Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
	}
	
	

}
