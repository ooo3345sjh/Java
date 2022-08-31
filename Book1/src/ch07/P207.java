package ch07;

/*
 * 날짜 : 2022/08/31
 * 이름 : 서정현
 * 내용 : 객체 배열 만들기(1)
 */
 class Book{
	
	private String bookName;
	private String author;
	
	public Book() {} //디폴트 생성자
	public Book(String bookName, String author) { //책 이름과 저자 이름을 매개변수로 받는 생성자
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


public class P207 {
	
	public static void main(String[] args) {
		
	}

}
