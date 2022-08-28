package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/08/28
 * 이름 : 서정현
 * 내용 : 백준 6단계 8번 : 다이얼
 */
public class _08 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] ch = str.toCharArray();
		
		char[][] al = {{'A', 'B', 'C'},
					   {'D', 'E', 'F'}, 
					   {'G', 'H', 'I'}, 
					   {'J', 'K', 'L'},
					   {'M', 'N', 'O'},
					   {'P', 'Q', 'R', 'S'},
					   {'T', 'U', 'V'},
					   {'W', 'X', 'Y', 'Z'}
				};
		int[] arr = {3, 4, 5, 6, 7, 8, 9, 10};
		int sec = 0;
		
		for(int i=0; i<ch.length; i++) {
			A:for(int j=0; j<al.length; j++) {
				for(int k=0; k<al[j].length; k++) {
					if(ch[i] == al[j][k]) {
						sec += arr[j];
						break A;
					}
				}
			}
		}
		System.out.println(sec);
	}
}
