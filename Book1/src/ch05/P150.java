package ch05;

/*
 * 날짜 : 2022/08/25
 * 이름 : 서정현
 * 내용 : 참조 값 출력하기
 */

public class P150 {
	public static void main(String[] args) {
		
		Student3 student1 = new Student3(); //첫 번째 학생 생성
		student1.studentName = "홍길동";
		
		Student3 student2 = new Student3(); //두 번째 학생 생성
		student2.studentName = "이순신";
		
		System.out.println(student1); //student1 참조 변수 값 출력
		System.out.println(student2); //student2 참조 변수 값 출력
		
	}
}
	
