package ch11;

/*
 * 날짜 : 2022/09/13
 * 이름 : 서정현
 * 내용 : hashCode()메서드 정의하기
 */
class Student2 {

	int studentId;
	String studentName;

	public Student2(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentId + "," + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student2))
			return false;
		Student2 student = (Student2) obj;
		return this.studentId == student.studentId;

	}

	@Override
	public int hashCode() {
		
		return studentId;
	}
}

public class P365 {

	public static void main(String[] args) {

		Student2 studentLee = new Student2(100, "이상원");
		Student2 studentLee2 = studentLee; // 주소 복사
		Student2 studentSang = new Student2(100, "이상원");

		if (studentLee == studentLee2) // == 기호로 비교
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");

		if (studentLee.equals(studentLee2)) // equals() 메서드로 비교
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");

		if (studentLee == studentSang) // == 기호로 비교
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");

		if (studentLee.equals(studentSang)) // equals() 메서드로 비교
			System.out.println("studentLee와 studentSang는 동일합니다.");
		else
			System.out.println("studentLee와 studentSang는 동일하지 않습니다.");
		
		System.out.println("studentLee의 hashCode : " + studentLee.hashCode());
		System.out.println("studentSang의 hashCode : " + studentSang.hashCode());

		System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값 : " + System.identityHashCode(studentSang));
		
	}

}