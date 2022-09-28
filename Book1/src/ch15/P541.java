package ch15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/28
 * 이름 : 서정현
 * 내용 : InputStreamReader 사용하기
 * 
 */
public class P541 {
	
	public static void main(String[] args) throws IOException {

		try (InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			while((i = isr.read()) != -1) {
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
