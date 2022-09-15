package ch06;

/*
 * 날짜 : 2022/08/26
 * 이름 : 서정현
 * 내용 : 학번 자동으로 부여하기 / 학번 확인하기
 */

class Student1{
	public static int serialNum = 1000; //static변수는 인스턴스 생성과 상관없이 먼저 생성됨
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++;  			//학생이 생성될 때마다 증가
		studentId = serialNum;	//증가된 값을 학번 인스턴스 변수에 부여
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}

public class P184_P185 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + " 학번:" + studentLee.studentId);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum); 
		System.out.println(studentSon.studentName + " 학번:" + studentSon.studentId);
	}
}






