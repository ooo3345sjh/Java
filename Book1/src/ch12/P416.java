package ch12;

import java.util.LinkedList;

/*
 * 날짜 : 2022/09/22
 * 이름 : 서정현
 * 내용 : LinkedList 테스트하기
 */
public class P416 {
	
	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1, "D");
		System.out.println(myList);
		
		myList.addFirst("0");
		System.out.println(myList);
		
		System.out.println(myList.removeLast());
		System.out.println(myList);
		
	}

}
