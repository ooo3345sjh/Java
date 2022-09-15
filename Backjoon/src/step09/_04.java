package step09;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/15
 * 이름 : 서정현
 * 내용 : 재귀의 귀재
 */
public class _04 {
	
	public static int count = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.valueOf(sc.nextLine());
		for(int i=0; i<n; i++) {
			String s = sc.nextLine();
			System.out.println(isPalindrome(s) + " " + count);
			count = 0;
		}
	}
	
	public static int recursion(String s, int i, int j) {
		count++;
		if(i >= j) return 1;
		else if(s.charAt(i) != s.charAt(j)) return 0;
		else return recursion(s, i+1, j-1);
	}
	
	public static int isPalindrome(String s) {
		return recursion(s, 0, s.length()-1);
	}
}
