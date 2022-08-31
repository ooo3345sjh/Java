package ch07;

/*
 * 날짜 : 2022/08/31
 * 이름 : 서정현
 * 내용 : 객체 배열의 깊은 복사
 */
public class P216 {
	
	public static void main(String[] args) {
		
		Book5[] bookArray1 = new Book5[3];
		Book5[] bookArray2 = new Book5[3];
		
		bookArray1[0] = new Book5("태백산맥", "조정래");
		bookArray1[1] = new Book5("데미안", "헤르만 헤세");
		bookArray1[2] = new Book5("어떨게 살 것인가", "유시민");

		//디폴트 생성자로 bookArray2 배열 인스턴스 생성
		bookArray2[0] = new Book5();
		bookArray2[1] = new Book5();
		bookArray2[2] = new Book5();
		
		//bookArray1 배열요소를 새로 생성한 bookArray2 배열 인스턴스에 복사
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); //bookArray2 배열 요소 값 출력
		}
		
		//bookArray1 첫 번째 배열 요소 값 수정
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("=== bookArray1 ===");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo(); //bookArray1 배열 요소 값 출력
		}
		
		//bookArray1 배열 요소 값과 다른 내용이 출려됨
		System.out.println("=== bookArray2 ===");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); //bookArray2 배열 요소 값 출력
		}
		
	}
	
}

class Book5{
	
	private String bookName;
	private String author;
	
	public Book5() {} //디폴트 생성자
	public Book5(String bookName, String author) { //책 이름과 저자 이름을 매개변수로 받는 생성자
		this.bookName = bookName;
		this.author = author;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//책 정보를 출력해 주는 메서드
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}
}