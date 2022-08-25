package ch05;

/*
 * 날짜 : 2022/08/25
 * 이름 : 서정현
 * 내용 : Student 클래스에 main()함수 추가하기
 */
class Student3{
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
}

public class P144 {
	public static void main(String[] args) {
		
		Student3 studentAhn = new Student3(); //Student 클래스 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
	
