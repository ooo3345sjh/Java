package sub3;

/*
 * 날짜 : 2022/08/29
 * 이름 : 서정현
 * 내용 : 클래스 변수, 클래스 메서드 실습하기
 * 
 * 클래스 변수, 클래스 메서드(Static 변수, 메서드)
 *  - static을 선언한 변수, 메서드로 Java Class Area에 생성
 *  - 별도의 객체생성(new)하지 않고 해당 클래스 타입으로 참조, 실생
 *  - 객체(인스턴스)들간의 공유에 목적으로 클래스 변수, 클래스 메서드 사용
 *  
 *  싱글콘 객체(Singleton)
 *   - 싱글톤 패턴이 적용된 객체는 하나의 인스턴스로 존재
 *   - 싱글콘 객체를 사용해서 메모리 절약과 성능 향상을 기대
 */
class Increament {
	
	private int num1;
	private static int num2;
	
	public Increament() {
		num1++;
		num2++;
		
		System.out.println("num1 : " + num1);
	}
	
	public static void show() {
		System.out.println("num2 : " + num2);
	}
}

public class StaticTest {
	public static void main(String[] args) {

		// 클래스 변수 실습, 클래스 메서드 실습
		Increament inc1 = new Increament();
		Increament.show();
		
		Increament inc2 = new Increament();
		Increament.show();

		Increament inc3 = new Increament();
		Increament.show();
		
		Car sonata = new Car("소나타", "흰색", 0);
		Car avante = new Car("아반테", "은색", 0);
		
		sonata.show();
		avante.show();
		
		System.out.println("전체 차량수 : " + Car.count);

		//싱글콘(Singleton) 객체 실습
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		
		int r1 = c1.plus(1, 2);
		int r2 = c2.minus(2, 3);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		
		
		
		
		
		
		
	}
}
