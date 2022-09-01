package ch08;

/*
 * 날짜 : 2022/09/01
 * 이름 : 서정현
 * 내용 : 다형성 테스트하기
 */
class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal {
	
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}


public class P259 {
	public static void main(String[] args) {
		P259.moveAnimal(new Human());
		P259.moveAnimal(new Tiger());
		P259.moveAnimal(new Eagle());
	
	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}
}
