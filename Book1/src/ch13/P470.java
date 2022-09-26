package ch13;

/*
 * 날짜 : 2022/09/26
 * 이름 : 서정현
 * 내용 : 매개변수로 전달하는 람다식 
 */
interface PrintString {
	void showString(String str);
}
public class P470 {
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lamda_1");
		showMyString(lambdaStr);
	}
	
	public static void showMyString(PrintString p) {
		p.showString("hello lamda_2");
	}
}
