package ch06;

/*
 * 날짜 : 2022/08/26
 * 이름 : 서정현
 * 내용 : this를 사용하여 주소 값 반환하기
 */
class Person1{
	String name;
	int age;

	Person1(){
		this("이름없음", 1); //this를 사용해 Person(String, int)생성자 호출
	}
	
	Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person1 returnItSelf() {
		return this;
	}
}


public class P173 {
	public static void main(String[] args) {
		
		Person1 noName = new Person1();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person1 p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}
}
