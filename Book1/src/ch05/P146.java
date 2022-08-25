package ch05;

/*
 * 날짜 : 2022/08/25
 * 이름 : 서정현
 * 내용 : StudentTest 실행 클래스 만들기
 */

public class P146 {
	public static void main(String[] args) {
		
		Student3 studentAhn = new Student3(); //Student3 클래스 생성
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
	
