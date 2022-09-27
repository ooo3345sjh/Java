package ch14;

/*
 * 날짜 : 2022/09/27
 * 이름 : 서정현
 * 내용 : tru-catch문 사용하기
 */
public class P491 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			for(int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("예외 처리 부분");
		}
		System.out.println("프로그램 종료");
	}

}
