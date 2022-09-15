package ch11;

/*
 * 날짜 : 2022/09/08
 * 이름 : 서정현
 * 내용 : P354 ~ 356
 * 	- Object 클래스의 toStirng()메서드 사용하기
 * 	- toString() 메서드 재정의하기
 */
class Book {
	int bookNumber;
	String bookTitle;
	
	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	//toString() 메서드 재정의
	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}

public class P354_P356 {
	
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}

}
