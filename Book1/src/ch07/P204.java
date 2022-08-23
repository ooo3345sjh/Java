package ch07;

/*
 * 날짜 : 2022/08/23
 * 이름 : 서정현
 * 내용 : 배열 길이만큼 출력하기
 */
public class P204 {
	
	public static void main(String[] args) {

		//double형으로 길이 5인 배열 선언
		double[] data = new double[5];
		
		data[0] = 10.0; //첫 번째 요소에 값 10.0 대입
		data[1] = 20.0; //두 번째 요소에 값 20.0 대입
		data[2] = 30.0; //세 번째 요소에 값 30.0 대입
		
		//전체 배열 길이만큼 반복
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
