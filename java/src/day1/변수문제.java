package day1;

public class 변수문제 {

	public static void main(String[] args) {
		//문제1. 홍길동의 국어점수를 저장하려한다. 
		//이때 필요한 변수를 선언하세요. 단, 점수는 정수로 저장한다.
		
		int korScore;
		
		//문제2. 홍길동의 수학점수를 저장하려한다.
		//이때 필요한 변수를 선언하세요. 단, 점수는 A,B,C,D,F로 저장한다.
		char mathScore;
		
		//다음과 같이 국어(kor), 수학(math), 영어(eng)가 있을 때
		// 성적의 합과, 평균을 저장할 변수를 선언하세요.
		int kor = 100;
		int math = 90;
		int eng = 80;
		
		int sum; //합계
		double avg; //평균
		
		sum = kor + math + eng;
		avg = sum / 3;
		
		//문제4. 다음 중 문제가 있는 변수 선언은? 2, 4, 5
		/* 1. char ch1 = 'A';
		 * 2. char ch2 = '11'; -> 문자는 1글자.
		 * 3. char ch3 = '_';
		 * 4. char ch4 = C;    -> ' ' 빠졌음.
		 * 5. char ch5 = "D";  -> ' ' 가 되야함.  
		 */
		
		System.out.println(sum);
		System.out.println(avg);
		

	}

}
