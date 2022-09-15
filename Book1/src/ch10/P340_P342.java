package ch10;

import java.io.IOException;
import java.util.ArrayList;

/*
 * 날짜 : 2022/09/03
 * 이름 : 서정현
 * 내용 : P340 ~ P342
 * 	- Shelf 클래스 만들기
 * 	- Queue 인터페이스 정의하기
 * 	- BookShelf 클래스 구현하기
 * 	- BookShelf 테스트하기
 */
class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}

interface Queue {
	void enQueue(String title); //배열의 맨 마지막에 추가
	String deQueue();			//배열의 맨 처음 항목 반환
	int getSize(); 				//현재 Queue에 있는 개수 반환
}

class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
}

public class P340_P342 {
	public static void main(String[] args) throws IOException {
		
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
