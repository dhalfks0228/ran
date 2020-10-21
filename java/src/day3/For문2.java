package day3;

public class For문2 {

	public static void main(String[] args) {
		/* 1부터 10까지 합
		 * 반복횟수 : i는 1부터 10까지 1씩 증가 
		 * - 초기화 : i는 1부터
		 * - 조건식 : i는 10까지 => i는 10보다 작거나 같다.
		 * - 증감연산식 : i는 1씩 증가
		 * 규칙성 : 
		 * 반복문 종료 후 : sum을 출력
		 * 		sum0 = 0
		 * i=1	sum1 = 0 + 1						sum1 = sum0+1
		 * i=2	sum2 = 0 + 1 + 2					sum2 = sum1+2
		 * i=3	sum3 = 0 + 1 + 2 + 3				sum3 = sum2+3
		 * ...
		 * i=10 sum = 0 + 1 + 2 + 3 + ... + 10		sum10 = sum9+10
		 * 
		 * */
		int i, sum;
		for (i=1,sum=0 ; i <= 10 ; i++ ) {  // ,를 이용하여 여러변수를 초기화 할 수 있다.
			sum = sum+ i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);

		
		/* 1부터 10까지 홀수의 합
		 * 반복횟수 : 1부터 10까지 1씩 증가
		 * - 초기화 : 1부터
		 * - 조건식 : 10까지
		 * - 증감연산식 : 1씩 증가
		 * 규칙성 : 홀수의 합을 구함
		 * 반복문 종료 후 : 홀수의 합을 출력
		 * 
		 * */
		for( i=1, sum=0 ; i<=10 ; i++ ) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
		}
		System.out.println("1부터 10까지 홀수의 합 :" + sum);
		
	}

}
