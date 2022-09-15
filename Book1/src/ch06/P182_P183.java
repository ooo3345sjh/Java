package ch06;

/*
 * 날짜 : 2022/08/26
 * 이름 : 서정현
 * 내용 : static 변수 사용하기 / static 변수 테스트 하기
 */

class Student{
	public static int serialNum = 1000; //static변수는 인스턴스 생성과 상관없이 먼저 생성됨
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}

public class P182_P183 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);  //serialNum 변수의 초깃값 출력
		studentLee.serialNum++; //static 변수 증가
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum); //증가된 값 출력
		System.out.println(studentLee.serialNum);
	}
}






