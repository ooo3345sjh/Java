package ch08;

/*
 * 날짜 : 2022/09/01
 * 이름 : 서정현
 * 내용 : P262 ~ P268
 * 	- 고객관리 프로그램 완성하기(1)
 * 	- 고객관리 프로그램 완성하기(2)
 * 	- 고객관리 프로그램 완성하기(3)
 * 	- 새로운 등급 고객 추가하기
 * 
 */
class Customer1 {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer1() {
		initCustomer();
	}
	
	public Customer1(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
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

	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}
	
}

class VIPCustomer1 extends Customer1 {
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer1(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다";
	}
}

class GoldCustomer extends Customer1 {
	
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}

public class P262 {
	public static void main(String[] args) {
		
		Customer1 customerLee = new Customer1();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		Customer1 customerKim = new VIPCustomer1(10020, "김유신", 12345);
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo());
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		
		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kimPrice = customerKim.calcPrice(price);
		
		System.out.println(customerLee.getCustomerName() + "님이 " + leePrice + "원 지불하셨습니다.");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.getCustomerName() + "님이 " + kimPrice + "원 지불하셨습니다.");
		System.out.println(customerKim.showCustomerInfo());
		
		
		
		
		
	
	}
}
