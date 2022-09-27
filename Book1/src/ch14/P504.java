package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 날짜 : 2022/09/27
 * 이름 : 서정현
 * 내용 : 여러 catch문 사용하기
 */
public class P504 {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c= Class.forName(className);
		return c;
	}
	
	
	public static void main(String[] args) {
		P504 test = new P504();
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace(); //Exception 클래스로 그 외 예외 상황 처리
		}
		
		System.out.println("프로그램 종료...");
	}
}
