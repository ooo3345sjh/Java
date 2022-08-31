package ch07;

/*
 * 날짜 : 2022/08/31
 * 이름 : 서정현
 * 내용 : 객체 배열 만들기(3)
 */
public class P209 {
	
	public static void main(String[] args) {
	
		Book1[] library = new Book1[5];
		
		library[0] = new Book1("태백산맥", "조정래");
		library[1] = new Book1("데미안", "헤르만 헤세");
		library[2] = new Book1("어떨게 살 것인가", "유시민");
		library[3] = new Book1("토지", "박경리");
		library[4] = new Book1("어린왕자", "생텍쥐페리");
		
		
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}
}

class Book2{
	
	private String bookName;
	private String author;
	
	public Book2() {} //디폴트 생성자
	public Book2(String bookName, String author) { //책 이름과 저자 이름을 매개변수로 받는 생성자
		this.bookName = bookName;
		this.author = author;
	}
	
	public String getBookNum() {
		return bookName;
	}
	
	public void setBookNum(String bookNum) {
		this.bookName = bookNum;
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