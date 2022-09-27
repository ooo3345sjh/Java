package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 날짜 : 2022/09/27
 * 이름 : 서정현
 * 내용 : throws로 예외 미루기
 */
public class P501 {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c= Class.forName(className);
		return c;
	}
	
	
	public static void main(String[] args) {
		P501 test = new P501();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}
