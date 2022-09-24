package ch12;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/24
 * 이름 : 서정현
 * 내용 : 큐 구현하기
 */
class MyQueue{
	private ArrayList<String> arrayQueue = new ArrayList<>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("큐이 비었습니다.");
			return null;
		}
		
		return (arrayQueue.remove(0));
	}
}

public class P420 {
	public static void main(String[] args) {
		MyQueue Queue = new MyQueue();
		Queue.enQueue("A");
		Queue.enQueue("B");
		Queue.enQueue("C");
		
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
	}
}
