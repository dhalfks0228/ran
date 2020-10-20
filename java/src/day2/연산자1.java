package day2;

public class 연산자1 {

	public static void main(String[] args) {
		//비교 연산자 : >, <, >=, <=, ==, !=
		//비교 연산자는 연산 결과가 참 또는 거짓으로 나옴.
		// ==와 =을 구별할 수 있어야 한다.
		// A는 B이면 => A는 B와 같다면..
		int num1 =10, num2 = 20;
		System.out.println("---비교연산자 예제---");
		System.out.println(num1 > num2); // 10 > 20 거짓
		System.out.println(num1 < num2);  // 10 < 20 참
		System.out.println(num1 >= num2); // 10 >= 20 거짓
		System.out.println(num1 == num2); // 10 == 20 거짓
		System.out.println(num1 != num2); // 10 != 20 참
		
		// 논리 연산자 : &&, ||, ! 
		// A && B : A가 참이고, B가 참이면 참
		//         => 하나라도 거짓이면 거짓
		// 학생 성적이 90점이면 A
		// 학생 성적이 90점 이상이고, 100점 이하이면 A
		// 학생 성적이 80점 이상이고, 90점 미만이면 B
		// A || B : A가 참이거나 B가 참이면 참
		//          => 둘다 거짓일 때 거짓
		// 출석 체크를 카드로 하거나 비콘으로 하면 출석인정
		// !A : A가 참이면 거짓, 거짓이면 참
		int score = 90;
		// 성적이 90점 이상(성적이 90점보다 크거나 같다) : score >= 90
		// 성적이 100점 이하(성적이 100점보다 작거나 같다) : score <= 100
		// 성적이 90점 이상(이고) 100점 이하
		System.out.println("---논리연산자 예제---");
		System.out.println(score >= 90 && score <= 100);
		// 성적이 0점 미만(이거나) 100점 초과이면 잘못된 성적
		// 성적이 0점 미만(성적이 0보다 작다) => score < 10
		// 성적이 100점 초과(성적이 100보다 크다) => score > 100
		// score < 0 || score > 100
		System.out.println(score < 0 || score > 100);
		
		int num3 = 11;
		// 문제풀이!!  num3이 2의 배수인지 확인하는 코드를 작성하세요.
		// 2의 배수란 : num3을 2로 (나누었을 때 나머지)가 0과 (같다.)
		System.out.println("---연습문제 예제---");
		System.out.println(num3 + "은 2의 배수가?? " + (num3 % 2 == 0));
		// 출력시 식일 경우 ( 식 ) 로 묶어서 표현
		
		
		
		
	}

}
