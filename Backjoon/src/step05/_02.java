package step05;

/*
 * 날짜 : 2022/08/27
 * 이름 : 서정현
 * 내용 : 백준 5단계 2번 : 셀프 넘버
 */

public class _02 {
	public static void main(String[] args) {
		
//		Set<Integer> set = new TreeSet<>();
//		
//		for(int i=1; i<=10000; i++) {
//			int num = d(i);
//			 while(num<10000) {
//				 set.add(num);
//				 num = d(num);
//			 };
//		}
//		
//		Iterator<Integer> it = set.iterator();
//		
//		for(int i=1; i<10000; i++) {
//			if(set.contains(i) == false) {
//				System.out.println(i);
//			};
//		}
		//위의 코드는 내가 작성한 코드 밑에는 사이트 참고 완전 간결....
		boolean[] check = new boolean[10001]; //1부터 10000이므로
		
		for(int i=1; i<10001; i++) {
			int n = d(i);
			
	
			if(n<10001) { //10000이 넘는 수는 필요가 없음
				check[n] = true;
			}
		}
		
		for(int i=1; i<10001; i++) {
			if(!check[i]) { //false인 인덱스만 출력
				System.out.println(i);
			}
		}
	} 
	
	public static int d(int num) {
//		int a1, a2, a3, a4;
//		if(num < 10) {
//			num += num;
//		} else if(num >= 10 && num < 100) {
//			a1 = num%10;
//			a2 = num/10;
//			num = num + a1 + a2;
//		} else if(num >= 100 && num < 1000) {
//			a1 = num%10;
//			a2 = (num%100)/10;
//			a3 = num/100;
//			num = num + a1 + a2 + a3;
//		} else if(num >= 1000 && num < 10000) {
//			a1 = num%10;
//			a2 = num%100/10;
//			a3 = (num%1000)/100;
//			a4 = num/1000;
//			num = num + a1 + a2 + a3 + a4;
//		}
		
		//위에는 내가 작성한 코드.....밑에 코드와 동일하다...간결하고 가독성 최고...
		int sum = num;
		while(num != 0) {
			sum = sum + (num % 10); //첫 째 자리수
			num = num / 10; // 10을 나누어 첫 째 자리를 없앤다.
		}
		return sum;
	}
}
