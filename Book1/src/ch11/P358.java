package ch11;

/*
 * 날짜 : 2022/09/08
 * 이름 : 서정현
 * 내용 : Object 클래스의 equals() 메서드 사용하기
 */
class Student {
	
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
	 this.studentId = studentId;
	 this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentId + "," + studentName;
	}
}

public class P358 {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee; // 주소 복사
		Student studentSang = new Student(100, "이상원");
		
		if(studentLee == studentLee2) // == 기호로 비교
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
			
		if(studentLee.equals(studentLee2)) // equals() 메서드로 비교
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
	}
	

}
