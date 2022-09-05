package ch10;

import java.io.IOException;

/*
 * 날짜 : 2022/09/03
 * 이름 : 서정현
 * 내용 : P322 ~ P324
 * 	- Scheduler 인터페이스 정의하기
 * 	- 순서대로 배분하기
 * 	- 짧은 대기열 먼저 배분하기
 * 	- 우선순위에 따라 배분하기
 * 	- 입력 문자에 따라 배분 정책 수행하기
 */
interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
}

//상담원 한 명씩 돌아가며 동일하게 상담 업무 배분
class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
	
}

//현재 상담 업무가 없거나 상담 대기가 가장 적은 상담원에게 배분
class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.");
	}
	
}

//고객 등급이 높은 전화부터 대기열에서 가져와 업무 능력이 높은 상담원 우선 배분
class PriorityAllocation implements Scheduler {
	
	@Override
	public void getNextCall() {
		
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill값이 높은 상담원에게 우선적으로 배분합니다.");
	}
	
}


public class P322 {
	public static void main(String[] args) throws IOException {
		System.out.println("전화 상감 할당 방식을 선택하세요");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		} 
		
		else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		} 
		
		else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
