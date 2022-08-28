package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/08/28
 * 이름 : 서정현
 * 내용 : 백준 6단계 5번 : 단어 공부
 *  - 내가 작성한 코드 결과 값은 맞게 나오나 시간초과로 틀림.
 */
public class _05_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		
		
		char[] word = str.toCharArray();
		int[] duplication = new int[word.length];
		int count;
		
		if(word.length == 1) {
			System.out.println(word[0]);
			return;
		}
		
		for(int i=0; i<word.length-1; i++) {
			count = 0;
			
			for(int j=i+1; j<word.length; j++) {
				if(word[i] == word[j]) {
					count++;
				}
				duplication[i] = count;
			}
		}
		
		char output = ' ';
		int maxWord = 0;
		int[] tempArray = duplication.clone(); 
			for(int k=1; k<tempArray.length; k++) {
				
				if(tempArray[0] < tempArray[k]) {
					int temp = tempArray[k];
					tempArray[k] = tempArray[0];
					tempArray[0] = temp;
					maxWord = k;
				} else if(tempArray[0] == tempArray[k]) {
					output = '?';
				}
			}
			
			if(output == '?') {
				System.out.println(output);
				return;
			}
			
			for(int j=maxWord+1; j<duplication.length; j++) {
			
				if(duplication[maxWord]==duplication[j]) {
					output = '?';
				} else {
					output = word[maxWord];
				}
			}
			System.out.println(output);
	}
}
