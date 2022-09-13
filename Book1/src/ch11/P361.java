package ch11;

/*
 * 날짜 : 2022/09/08
 * 이름 : 서정현
 * 내용 : equals() 메서드 재정의하기
 */
class Student1 {
	
	int studentId;
	String studentName;
	
	public Student1(int studentId, String studentName) {
	 this.studentId = studentId;
	 this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentId + "," + studentName;
	}
	
	@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof Student1)) return false;
			Student1 student = (Student1) obj;
			return this.studentId == student.studentId;
	
		}
}

public class P361 {
	
	public static void main(String[] args) {
		
		Student1 studentLee = new Student1(100, "이상원");
		Student1 studentLee2 = studentLee; // 주소 복사
		Student1 studentSang = new Student1(100, "이상원");
		
		if(studentLee == studentLee2) // == 기호로 비교
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
			
		if(studentLee.equals(studentLee2)) // equals() 메서드로 비교
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		
		if(studentLee == studentSang) // == 기호로 비교
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		
		if(studentLee.equals(studentSang)) // equals() 메서드로 비교
			System.out.println("studentLee와 studentSang는 동일합니다.");
		else
			System.out.println("studentLee와 studentSang는 동일하지 않습니다.");
		
	}
	

}
