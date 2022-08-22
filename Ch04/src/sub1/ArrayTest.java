package sub1;


/*
 * 날짜 : 2022/08/22
 * 이름 : 서정현
 * 내용 : Java 배열 실습하기
 * 
 * 배열(Array)
 * 	- 하나 이상의 데이터를 하나의 변수에 저잘할 수 있는 자료구조
 * 	- 현대 프로그래밍에서는 Array대신 List를 더 많이 사용
 */
public class ArrayTest {
	public static void main(String[] args) {
		// 배열
		int[] arr1 = {1, 2, 3, 4, 5};
		char[] arr2 = {'A', 'B', 'C'};
		String[] arr3 = {"서울", "대전", "대구", "부산", "광주"};
		
		// 배열 원소 출력
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[4] : " + arr1[4]);
		System.out.println();
		
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr2[1] : " + arr2[1]);
		System.out.println();

		System.out.println("arr3[1] : " + arr3[1]);
		System.out.println("arr3[3] : " + arr3[3]);
		System.out.println();
	
		// 배열 길이
		System.out.println("arr1의 배열 길이 : " + arr1.length);
		System.out.println("arr2의 배열 길이 : " + arr2.length);
		System.out.println("arr3의 배열 길이 : " + arr3.length);
		System.out.println();

		// 배열 반복문
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(char ch : arr2) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		for(String city : arr3) {
			System.out.print(city + " ");
		}
		System.out.println("\n");

		// 1차원 배열
		int[] scores = {80, 60, 78, 62, 92};
		int total = 0;
		
		for(int score : scores) {
			total += score;
		}
		System.out.println("scores의 합 : " + total);
		System.out.println();

		// 2차원 배열
		int[][] arr2d = {{1, 2, 3, 4},      //arr2d[0]의 배열
						 {5, 6, 7, 8}, 		//arr2d[1]의 배열
						 {9, 10, 11, 12}};	//arr2d[2]의 배열
		
		for(int i=0; i<arr2d.length; i++) {
			for(int j=0; j<arr2d[i].length; j++) {
				System.out.printf("arr2d[%d][%d] : %d\n", i, j, arr2d[i][j]);
			}
		}
		System.out.println();
		
		// 3차원 배열			//arr3d[0]의 배열
		int[][][] arr3d = {{{1, 2, 3},      //arr3d[0][0]의 배열 
							{4, 5, 6}, 		//arr3d[0][1]의 배열
							{7, 8, 9}}, 	//arr3d[0][2]의 배열
				
							//arr3d[1]의 배열
						   {{10, 11, 12}, 	//arr3d[1][0]의 배열
							{13, 14, 15}, 	//arr3d[1][1]의 배열
							{16, 17, 18}}, 	//arr3d[1][2]의 배열
						   
						   //arr3d[2]의 배열
						   {{19, 20, 21}, 	//arr3d[1][0]의 배열
							{22, 23, 24}, 	//arr3d[1][1]의 배열
							{25, 26, 27}}};	//arr3d[1][2]의 배열
		
		for(int i=0; i<arr3d.length; i++) {
			for(int j=0; j<arr3d[i].length; j++) {
				for(int k=0; k<arr3d[i][j].length; k++){
					System.out.printf("arr3d[%d][%d][%d] : %d\n", i, j, k, arr3d[i][j][k]);
				}
			}
		}
		
	}
}
