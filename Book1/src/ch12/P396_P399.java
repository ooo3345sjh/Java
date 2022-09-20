package ch12;

/*
 * 날짜 : 2022/09/19
 * 이름 : 서정현
 * 내용 : P396_P399
 * 	- Material 추상 클래스(P396)
 * 	- Powder 클래스(P396)
 * 	- Plastic 클래스(P396)
 * 	- GenericPrinter<T extends> 클래스(P397)
 * 	- <T extends 클래스> 클래스 사용하기(P398)
 * 	- <T extends 클래스> 테스트하기(P399)
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
	
	public void printing() {
		material.doPrinting();
	}
}

public class P396_P399 {

	public static void main(String[] args) {
		
		GenericPrinter1<Powder1> powderPrinter = new GenericPrinter1<>();
		powderPrinter.setMaterial(new Powder1());
		powderPrinter.printing();
		
		GenericPrinter1<Plastic1> plasticPrinter = new GenericPrinter1<>();
		plasticPrinter.setMaterial(new Plastic1());
		plasticPrinter.printing();
	
//		세라믹(Ceramics)은 Material의 자식 클래스가 아니기 때문에 GenericPrinter의 자료형이 될 수 없다.
		
//		GenericPrinter1<Ceramics> ceramicsPrinter = new GenericPrinter1<>();
//		plasticPrinter.setMaterial(new Ceramics());
//		plasticPrinter.printing();
	}
	
}
