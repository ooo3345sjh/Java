package ch13;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2022/09/26
 * 이름 : 서정현
 * 내용 : P481_P482
 * 	- 스트림 활용하기_1(P481)
 * 	- 스트림 활용하기_2(P482)
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
		
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은 :" + total + "입니다.");
		System.out.println();
		
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		customerList.stream().filter(c -> c.getAge() >= 20)
					.map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
		
		
		
		
		
		
		
		
		
	}
}
