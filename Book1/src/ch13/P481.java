package ch13;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2022/09/26
 * 이름 : 서정현
 * 내용 : 스트림 활용하기(1)
 */
class TravelCustomer {
	private String name;
	private int age;
	private int price;
	
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return name;
	};
	
	public int getAge() {
		return age;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "name: " + name + "age: " + "price: " + price;
	}
}

public class P481 {
	public static void main(String[] args) {
		TravelCustomer cutomerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer cutomerkim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer cutomerHong = new TravelCustomer("홍길동", 13, 50);
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(cutomerLee);
		customerList.add(cutomerkim);
		customerList.add(cutomerHong);
		
	}
}
