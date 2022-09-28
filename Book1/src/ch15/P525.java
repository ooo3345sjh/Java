package ch15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 날짜 : 2022/09/28
 * 이름 : 서정현
 * 내용 : 파일 끝까지 읽기
 */
public class P525 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			int i;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
