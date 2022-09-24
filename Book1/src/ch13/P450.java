package ch13;

/*
 * 날짜 : 2022/09/24
 * 이름 : 서정현
 * 내용 : 인스턴스 내부 클래스 예제 
 */
class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {
		int inNum = 100;
		//static int sInNum = 200;
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 인스턴스 변수)");
		}
		
		//static void sTest() {}
		
	}
	
	public void usingClass() {
		inClass.inTest();
	}
}
public class P450 {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
	}
}
