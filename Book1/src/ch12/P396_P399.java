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
abstract class Material {
	public abstract void doPrinting();
}

class Powder1 extends Material {
	public void doPrinting() {
		System.out.println("Powder1 재료로 출력합니다.");
	}
	
	public String toString() {
		return "재료는 Powder1입니다";
	}
}
class Plastic1 extends Material {
	public void doPrinting() {
		System.out.println("Plastic1 재료로 출력합니다.");
	}
	
	public String toString() {
		return "재료는 Plastic1입니다";
	}
}

class Ceramics {
	public void doPrinting() {
		System.out.println("Ceramics 재료로 출력합니다.");
	}
	
	public String toString() {
		return "재료는 Ceramics입니다";
	}
}

class GenericPrinter1<T extends Material>{
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

public class P396_P399 {

	public static void main(String[] args) {
		
		GenericPrinter1<Material> powderPrinter1 = new GenericPrinter1<>();
		powderPrinter1.setMaterial(new Powder1());
		
		GenericPrinter1<Powder1> powderPrinter = new GenericPrinter1<>();
		
		powderPrinter.setMaterial(new Powder1());
		Powder1 powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter1<Plastic1> plasticPrinter = new GenericPrinter1<>();
		
		plasticPrinter.setMaterial(new Plastic1());
		Plastic1 plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}
	
}
