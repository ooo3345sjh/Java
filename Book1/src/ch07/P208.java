package ch07;



/*
 * 날짜 : 2022/08/31
 * 이름 : 서정현
 * 내용 : 객체 배열 만들기(2)
 */
public class P208 {
	
	public static void main(String[] args) {
	
		Book1[] library = new Book1[5]; //Book 클래스형으로 객체 배열 생성
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
	
	class Book1{
		
		private String bookName;
		private String author;
		
		public Book1() {} //디폴트 생성자
		public Book1(String bookName, String author) { //책 이름과 저자 이름을 매개변수로 받는 생성자
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

