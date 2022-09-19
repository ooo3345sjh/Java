package ch12;

/*
 * 날짜 : 2022/09/19
 * 이름 : 서정현
 * 내용 : P392_P394
 * 	- Powder 클래스 정의하기(P392)
 * 	- Plastic 클래스 정의하기(P393)
 * 	- GenericPrinter<T> 클래스 정의하기(P393)
 * 	- GenericPrinter<T> 클래스 사용하기(P394)
 */
class Powder {
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}
	
	public String toString() {
		return "재료는 Powder입니다";
	}
}
class Plastic {
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}
	
	public String toString() {
		return "재료는 Plastic입니다";
	}
}

class GenericPrinter<T>{
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
}

public class P392_P394 {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}
	
}
