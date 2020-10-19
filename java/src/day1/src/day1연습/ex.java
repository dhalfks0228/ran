package day1연습;

public class ex {

	public static void main(String[] args) {
		// 국영수 세 과목의 합계 구하기
		
		int kor = 90, math = 87, eng = 97;
		int sum = kor + math + eng;
		int cou = 3;
		
		double avg = (double)sum / cou;
		
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
		

	}

}
