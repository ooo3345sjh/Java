package ch05;

/*
 * 날짜 : 2022/08/26
 * 이름 : 서정현
 * 내용 : 디폴트 생성자
 */

class Person2{
	
	String name;
	float height;
	float weight;
	
	public Person2() {} //자바 컴파일러가 자동으로 제공하는 디폴트 생성자
	
	//사람 이름을 매개변수로 입력받아서 Person 클래스를 생성하는 생성자
	public Person2(String name) {
		this.name = name;
	}
	
	//이름, 키, 몸무게를 매개변수로 입력 받는 생성자
	public Person2(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
}

class PersonTest1{
	public static void main(String[] args) {
		
		//디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화
		Person2 personKim = new Person2();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		//인스턴스 변수 초기화와 동시에 클래스 생성
		@SuppressWarnings("unused")
		Person2 personLee = new Person2("이순신", 175, 75);
		
	}
	
}


public class P154 {
}
	
