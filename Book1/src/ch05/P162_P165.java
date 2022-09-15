package ch05;

/*
 * 날짜 : 2022/08/26
 * 이름 : 서정현
 * 내용 : private 사용하기 / private 변수 테스트하기 / get(), set()메서드 사용하기
 *       private 변수에 접근하기 
 */
class Student6{
	int studentId;
	private String studentName; //studentName 변수를 private으로 선언
	int grade;
	String address;
	
	
	//private 변수인 studentName에 접근해 값을 가져오는 public get() 메서드
	public String getStudentName() {
		return studentName;
	}
	
	//private 변수인 studentName에 접근해 값을 지정하는 public set() 메서드
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}

public class P162_P165 {
	public static void main(String[] args) {
		Student6 studentLee = new Student6();
		//studentLee.studentName; // studentName 변수가 private으로 선언되어 오류 발생
		
		
		// serStudentName() 메서드를 활용해 private 변수에 접근 가능
		studentLee.setStudentName("이상원"); 
		
		
	}
}
	
