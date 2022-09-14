package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/13
 * 이름 : 서정현
 * 내용 : 파일 입출력 스트림 실습하기
 * 
 * 입출력 스트림(Stream)
 * 	- 파일(File)은 컴퓨터 저장매체(HDD)에 저장되는 데이터 묶음
 * 	- 프로그램은 데이터 처리와 함께 데이터 저장을 위해 파일 입출력 수행
 * 	- 파일 입출력을 위해 입출력 스트림을 사용
 */
public class FileIOTest {

	public static void main(String[] args) {
		
	String path = "C:\\Users\\java2\\Desktop\\sample1.txt";
	String target = "C:\\Users\\java2\\Desktop\\sample2.txt";
	
	try {
		FileInputStream fis = new FileInputStream(path);
		FileOutputStream fos = new FileOutputStream(target);
		
		while(true) {
			int data = fis.read();
			
			if(data == -1) {
				break; // 파일을 모두 읽었을 경우
			}
			
			//데이터 출력
			char c = (char)data;
			System.out.print(c);
			
			//파일 쓰기
			fos.write(data);
		}
		
		//스트링 해제
		fis.close();
		fos.close();
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	System.out.println();
	System.out.println("프로그램 종료...");
	
		
	}
}
