package ch11;

/*
 * 날짜 : 2022/09/19
 * 이름 : 서정현
 * 내용 : P379_P380 
 * 	- Person 클래스 생성하기(P379)
 * 	- Person의 Class 클래스 가져오기(P380)
 */
class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

public class P379_P380 {
	
	public static void main(String[] args) throws Exception {
		Person person = new Person();
		Class pClass1 = person.getClass(); //Object의 getClass() 메서드 사용하기
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class; //직접 class 파일 대입하기
		System.out.println(pClass2.getName()); 
		
		Class pClass3 = Class.forName("ch11.Person"); //클래스 이름으로 가져오기
		System.out.println(pClass3.getName());
		
		
		
	}	
	
}
