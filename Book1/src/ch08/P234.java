package ch08;

/*
 * 날짜 : 2022/09/01
 * 이름 : 서정현
 * 내용 : P234 ~ P258
 * 
 * 	- Customer 클래스 구현하기
 * 	- VIPCustomer 클래스 구현하기
 * 	- protected 변수 선언
 *  - 상속 클래스 테스트하기 
 *  - 상속에서 클래스 생성 과정(1)
 *  - 상속에서 클래스 생성 과정(2)
 *  - 하위 클래스 생성하기
 *  - Customer 클래스에 새로운 생성자 추가하
 *  - 명시적으로 상위 클래스 생성자 호출하기
 *  - 클래스 형 변환과 재정의 메서드 호출하기
 *  - 클래스형에 기반하여 지불 금액 계산하기
 */
class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}
}

class VIPCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer 생성자 호출 ");
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer(int, String) 생성자 호출 ");
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	};
	
	public int getAgentID() {
		return agentID;
	}
}

public class P234 {
	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + "님이 지불해야 하는 금액은 " + customerLee.calcPrice(price) + "원입니다.");
		System.out.println(customerKim.getCustomerName() + "님이 지불해야 하는 금액은 " + customerKim.calcPrice(price) + "원입니다.");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		
		System.out.println("======================================================");
		
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + "님이 지불해야하는 금액은 " + vc.calcPrice(10000) + "원입니다.");
		
		
		
	}

}
