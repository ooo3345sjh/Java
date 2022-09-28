package ch15;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/28
 * 이름 : 서정현
 * 내용 : 파일에 한 바이트씩 출력하기
 */
public class P529 {
	
	public static void main(String[] args) {
		
		try (FileOutputStream fos = new FileOutputStream("output2.txt")) {
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
	
}
