package ch06;

/*
 * 날짜 : 2022/08/29
 * 이름 : 서정현
 * 내용 : static 응용 - 싱글콘 패턴
 */

class Company{
	private static Company instance = new Company(); //유일하게 생성한 인스턴스
	private Company() {}
	
	//인스턴스를 외부에서 참조할 수 있도록 public get()메서드 구현
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		} 
		return instance; //유일하게 생성한 인스턴스 반환
	}
}

public class P194 {
	public static void main(String[] args) {
		
		//클래스 이름을 getInstance() 호출하여 참조 변수에 대입
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		//두 변수가 같은 주소인지 확인
		System.out.println(myCompany1 == myCompany2);
		
	
	}
}






