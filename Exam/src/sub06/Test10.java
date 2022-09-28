package sub06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * 날짜 : 2022/09/27
 * 이름 : 서정현
 * 내용 : 자바 총정리 연습문제
 */
public class Test10 {
	public static GregorianCalendar greInstance = new GregorianCalendar();
	
	public static GregorianCalendar getGreInstance() {
		return greInstance;
	}
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생일 입력(yyyy/MM/dd HH:mm:ss) : ");
		String birth = sc.nextLine();
		String[] temp = birth.split(" ");
		String[] bArr = temp[0].split("/");
		
		int bYear = Integer.parseInt(bArr[0]);
		int bMonth = Integer.parseInt(bArr[1]);;
		int bDay = Integer.parseInt(bArr[2]);;
		
		int tYear = Calendar.getInstance().get(Calendar.YEAR);
		int tMonth = Calendar.getInstance().get(Calendar.MONTH)+1;
		int tDay = Calendar.getInstance().get(Calendar.DATE);
		
		int totalDays = 0;
		
		//올해 1월 1일부터 오늘까지 날짜 수
		totalDays += dayofYear(tYear, tMonth, tDay);
		
		//태어난 해의 생일부터 그해 마지막 날까지의 날짜 수
		int yearDays = isLeapYear(bYear) ? 366:365;
		totalDays += yearDays - dayofYear(bYear, bMonth, bDay);
		
		for(int year = bYear + 1; year < tYear; year++) {
			if(isLeapYear(year)) {
				totalDays += 366;
			} else {
				totalDays += 365;
			}
		}
		System.out.printf("태어난 날부터 오늘까지 일수 : %d", totalDays);
		
		//---------------------------------------------------------------------
		Calendar birthDay = Calendar.getInstance();
		Calendar current = Calendar.getInstance();
		birthDay.clear();
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = sf.parse(birth);
		birthDay.setTime(date);
		
		long difference = current.getTimeInMillis() - birthDay.getTimeInMillis();
		long day = (difference / (1000 * 60 * 60 * 24)); // 일
		long hour = (difference % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60) ; // 시간
		long minute = (difference % (1000 * 60 * 60)) / (1000 * 60) ; // 분
		long second = (difference % (1000 * 60)) / (1000) ; // 초
		
		System.out.printf("\n태어난 날로부터 %d일 %d시간 %d분 %d초 지났습니다.", day, hour, minute, second);
				
		sc.close();
		}
	//평년을 기준으로 각 월의 누적 날짜 수 
	public static int[] days = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
	
	public static int dayofYear(int year, int month, int day) {
		return days[month-1] + day + (month > 2 && isLeapYear(year)? 1 : 0);
	}
	
	public static boolean isLeapYear(int year) {
		return getGreInstance().isLeapYear(year);
	}
}



