package ch07;

/*
 * 날짜 : 2022/08/31
 * 이름 : 서정현
 * 내용 : 객체 배열의 얕은 복사
 */
public class P214 {
	
	public static void main(String[] args) {
		
		Book4[] bookArray1 = new Book4[3];
		Book4[] bookArray2 = new Book4[3];
		
		bookArray1[0] = new Book4("태백산맥", "조정래");
		bookArray1[1] = new Book4("데미안", "헤르만 헤세");
		bookArray1[2] = new Book4("어떨게 살 것인가", "유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		//bookArray1 배열의 첫 번째 요소 값 변경
		System.out.println("=== bookArray1 ===");
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		//bookArray2 배열 요소 값도 변경되어 출력
		System.out.println("=== bookArray2 ===");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
	}
}

class Book4{
	
	private String bookName;
	private String author;
	
	public Book4() {} //디폴트 생성자
	public Book4(String bookName, String author) { //책 이름과 저자 이름을 매개변수로 받는 생성자
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