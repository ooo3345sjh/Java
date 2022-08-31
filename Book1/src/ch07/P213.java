package ch07;

/*
 * 날짜 : 2022/08/31
 * 이름 : 서정현
 * 내용 : 객체 배열 복사하기
 */
public class P213 {
	
	public static void main(String[] args) {
		
		Book3[] bookArray1 = new Book3[3];
		Book3[] bookArray2 = new Book3[3];
		
		bookArray1[0] = new Book3("태백산맥", "조정래");
		bookArray1[1] = new Book3("데미안", "헤르만 헤세");
		bookArray1[2] = new Book3("어떨게 살 것인가", "유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		
	}
}

class Book3{
	
	private String bookName;
	private String author;
	
	public Book3() {} //디폴트 생성자
	public Book3(String bookName, String author) { //책 이름과 저자 이름을 매개변수로 받는 생성자
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