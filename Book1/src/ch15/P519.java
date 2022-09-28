package ch15;

import java.io.Console;

/*
 * 날짜 : 2022/09/28
 * 이름 : 서정현
 * 내용 : Console 테스트하기
 */
public class P519 {
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("이름: ");
		String name = console.readLine();
		System.out.println("직업:");
		String job = console.readLine();
		System.out.println("비밀번호:");
		char[] pass = console.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}
}
