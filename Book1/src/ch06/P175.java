package ch06;

/*
 * 날짜 : 2022/08/26
 * 이름 : 서정현
 * 내용 : 버스와 지하철 타기
 */

class Customer{
	public String customerName;
	public int age;
	public int money;
	
	//승객 이름과 가진 돈을 매개변수로 받는 생성자
	public Customer(String customerNamem, int money) {
		this.customerName = customerNamem;
		this.money = money;
	}

	//승객이 버스를 타면 1000원을 지불하는 기능을 구현한 메서드 
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	//승객이 지하철을 타면 1500원을 지불하는 기능을 구현한 메서드
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	//승객의 현재 정보를 출력하는 메서드
	public void showInfo() {
		System.out.println(customerName + "님의 남은 돈은 " + money + "입니다.");
	}
}

class Bus{
	int busNumber;
	int passengerCount;
	int money;
	
	//버스 번호를 매개변수로 받는 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//승객이 버스에 탄 경우를 구현한 메서드
	public void take(int money) {
		this.money += money; //버스 수입 증가
		passengerCount++;	 //승객 수 증가
	}
	
	//버스 정보를 출력하는 메서드
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
	
}

class Subway{

	String lineNumber;
	int passengerCount;
	int money;
	
	//지하철 노선 번호를 매개변수로 받는 생정자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//승객이 지하철에 탄 경우를 구현한 메서드
	public void take(int money) {
		this.money += money; //수입 증가
		passengerCount++;  	 //승객 수 증가
	}
	
	//지하철 정보를 출력하는 메서드
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
	
}

public class P175 {
	public static void main(String[] args) {
		Customer customerJames = new Customer("James", 5000);
		Customer customerTomas = new Customer("Tomas", 10000);
		
		Bus bus100 = new Bus(100);				 //노선 번호가 100번인 버스 생성
		customerJames.takeBus(bus100);			 //James가 100번 버스에 탐
		customerJames. showInfo();				 //James	정보 출력
		bus100.showInfo();						 //버스 정보 출력
		
		Subway subwayGreen = new Subway("2호선"); //노선 번호가 2호선인 지하철 생성
		customerTomas.takeSubway(subwayGreen);	 //Tomas가 2호선에 탐
		customerTomas.showInfo();			   	 //Tomas 정보 출력
		subwayGreen.showInfo();					 //지하철 정보 출력
		
	}
}






