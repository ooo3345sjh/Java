package ch06;

/*
 * 날짜 : 2022/08/29
 * 이름 : 서정현
 * 내용 : serialNum의 get(), set() 메서드 사용하기 / 학번 출력하기
 */

class Student2{
	private static int serialNum = 1000; //private 변수로 변경
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
		serialNum++;  			//학생이 생성될 때마다 증가
		studentId = serialNum;	//증가된 값을 학번 인스턴스 변수에 부여
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
	
}

public class P187_P188 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이지원");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLee.studentName + " 학번:" + studentLee.studentId);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수경");
		System.out.println(Student2.getSerialNum()); 
		System.out.println(studentSon.studentName + " 학번:" + studentSon.studentId);
	}
}






