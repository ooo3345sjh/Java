package step10;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/
 * 이름 : 서정현
 * 번호 : 11729번
 * 내용 : 하노이 탑 이동 순서
 */
public class _07 {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		sb.append((int)Math.pow(2, n)-1).append("\n");
		
		hanoi(n, 1, 2, 3);
		
		System.out.println(sb.toString());
		
		
	}
	
	/*
	N : 원판의 개수 
	start : 출발지 
	mid : 옮기기 위해 이동해야 장소 
	to : 목적지
	 */
	public static void hanoi(int n, int start, int mid, int to) {
		
		// 이동할 원반의 수가 1개라면?
		if(n == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		
		// A -> C로 옮긴다고 가정할 떄,
		// STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
		hanoi(n-1, start, to, mid);
		
		// STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
		sb.append(start + " " + to + "\n");
		
		// STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
		hanoi(n-1, mid, start, to);
	}
	
}
