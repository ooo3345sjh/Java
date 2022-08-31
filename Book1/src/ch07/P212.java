package ch07;

/*
 * 날짜 : 2022/08/31
 * 이름 : 서정현
 * 내용 : System.arraycopy()로 배열 복사하기
 */
public class P212 {
	
	public static void main(String[] args) {
	
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(arr1, 0, arr2, 1, 4);
		
		for(int i=0; i< arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}
}