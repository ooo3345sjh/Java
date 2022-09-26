package ch13;

/*
 * 날짜 : 2022/09/26
 * 이름 : 서정현
 * 내용 : 반환 값으로 쓰이는 람다식  
 */
public class P471 {
	public static void main(String[] args) {
		PrintString reStr = returnString();
		reStr.showString("hello ");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("hello lamda_2");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "world");
	}
}
