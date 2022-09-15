package ch08;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/01
 * 이름 : 서정현
 * 내용 : instanceof로 원해 인스턴스형 확인 후 다운 캐스팅하기
 * 	
 */
class Animal1 {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human1 extends Animal1 {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger1 extends Animal1 {
	
	@Override
	public void move() {
		System.out.println("호랑이가 네 바로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle1 extends Animal1 {
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
	
}

public class P275 {
	
	ArrayList<Animal1> aniList = new ArrayList<>();
	
	public static void main(String[] args) {

		P275 aTest = new P275();
		aTest.addAnimal();
		System.out.println("원해 형으로 다운 캐스팅");
		aTest.testCasting();
		
	}
	
	public void addAnimal() {
		aniList.add(new Human1());
		aniList.add(new Tiger1());
		aniList.add(new Eagle1());
		
		for(Animal1 ani : aniList) {
			ani.move();
		}
	}
	
	public void testCasting() {
		
		for(int i = 0; i < aniList.size(); i++) {
			Animal1 ani = aniList.get(i);
			if(ani instanceof Human1) {
				Human1 h = (Human1)ani;
				h.readBook();
 			}
			else if(ani instanceof Tiger1) {
				Tiger1 t = (Tiger1)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle1) {
				Eagle1 e = (Eagle1)ani;
				e.flying();
			}
			else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
