package ch13;

import java.util.Arrays;
import java.util.function.BinaryOperator;

/*
 * 날짜 : 2022/09/26
 * 이름 : 서정현
 * 내용 : reduce() 사용하기
 */
class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		}
		return s2;
	}
	
}
public class P480 {
	public static void main(String[] args) {
		String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
		
		//매개변수에 람다식을 직접 쓰는 경우
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else {
				return s2;
			}
		}));
		
		//BinaryOperator인터페이스를 구현한 클래스를 사용하는 경우
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
		
		
		
	}
}
