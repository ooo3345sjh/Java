package sub08;

import java.io.File;
import java.io.FileWriter;

/*
 * 날짜 : 2022/09/29
 * 이름 : 서정현
 * 내용 : 자바 총정리 연습문제
 */

public class Test09 {
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java2\\Desktop\\Gugudan.txt";
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			
			for(int x=2; x<=9; x++) {
				fw.write(x + "단" + "\n");
				for(int y=1; y<=9; y++) {
					int z = x * y;
					fw.write(x + " x" + y + "=" + x*y + "\n");
				}
				fw.write("\n");
			}
			
			fw.flush();
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("구구단 파일생성 완료...");
	}
	
}
