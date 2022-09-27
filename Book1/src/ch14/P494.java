package ch14;

import java.io.FileInputStream;

/*
 * 날짜 : 2022/09/27
 * 이름 : 서정현
 * 내용 : try-catch문 사용하기 
 */
public class P494 {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (Exception e) {
			System.out.println(e); //예외 클래스의 toString() 메서드 호출
		}
		
		System.out.println("여기도 수행됩니다."); //정상 출력
	}
}
