package ch11;

/*
 * 날짜 : 2022/09/19
 * 이름 : 서정현
 * 내용 : Person 클래스의 인스턴스 생성하기
 */
public class P383 {
	
	public static void main(String[] args) throws Exception {
		
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("ch11.Person");
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
	}
}
