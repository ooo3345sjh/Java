package test;

/*
 * 날짜 : 2022/09/07
 * 이름 : 서정현
 */
public class test04 {
	
	public static void main(String[] args) {
		
		int num = 4;
		int count = 1;
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = 0; j <num-i; j++) {
				System.out.print("☆");
			}
			
			for(int j = 1; j <= count; j++) {
				System.out.print("★");
			}
			
			for(int j = 0; j <num-i; j++) {
				System.out.print("☆");
			}
			
			count += 2;
			
			System.out.println();
		}
		
	}

}
