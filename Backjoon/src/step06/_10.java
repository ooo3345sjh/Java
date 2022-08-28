package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/08/28
 * 이름 : 서정현
 * 내용 : 백준 6단계 10번 : 그룹 단어 체커
 */
public class _10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] str = new String[num];
		
		for(int i=0; i<num; i++) {
			str[i] = br.readLine();
		}
		int count = 0;
		for(int i=0; i<str.length; i++) {
			if(check(str[i]) == true) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean check(String str) {
		
		boolean[] b = new boolean[26];
		
		int prev = -1;
		
		for(int i=0; i<str.length(); i++) {
			int now = str.charAt(i); // i 번째 문자 저장 (현재 문자)
			
			// 앞선 문자와 i 번째 문자가 같지 않다면?
			if(prev != now) 
			{
				
				// 해당 문자가 처음 나오는 경우 (false 인 경우)
				if(b[str.charAt(i) - 97] == false) 
				{
					b[str.charAt(i) - 97] = true;
					prev = str.charAt(i);
				} 
				
				// 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨) 
				else 
				{
					return false;
				}
			}
			
			// 앞선 문자와 i 번째 문자가 같다면? (연속된 문자)
			else 
			{
				continue;
			}
			
		}
		return true;
	}
}
