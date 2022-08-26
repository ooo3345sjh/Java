package ch06;

/*
 * 날짜 : 2022/08/26
 * 이름 : 서정현
 * 내용 : this로 다른 생성자 호출하기
 */
class Person{
	String name;
	int age;

	Person(){
		this("이름없음", 1); //this를 사용해 Person(String, int)생성자 호출
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}


public class P172 {
	public static void main(String[] args) {
		
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}
}
