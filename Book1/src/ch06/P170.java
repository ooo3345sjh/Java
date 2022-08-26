package ch06;

/*
 * 날짜 : 2022/08/26
 * 이름 : 서정현
 * 내용 : this 출력하기
 */
class Birthday{
	int day;
	int month;
	int year;
	
	
	//태어난 연도를 지정하는 메서드
	public void setYear(int year) {
		this.year = year;
	}
	
	//this 출력 메서드
	public void printThis() {
		System.out.println(this);
	}
}


public class P170 {
	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		bDay.setYear(2000);				//태어난 연도를 2000으로 저장
		System.out.println(bDay);		//참조 변수 출력
		bDay.printThis();				//this 출력 메서드 호출
		
	}
}
