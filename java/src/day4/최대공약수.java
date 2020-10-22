package day4;

import java.util.Scanner;

public class 최대공약수 {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2를 입력받고 두 정수의 최대 공약수를 출력하는 예제
		 * 공약수 : 두 정수의 공통으로 있는 약수
		 * 최대공약수 : 두 정수의 공약수 중 가장 큰수
		 * 8과 12의 공약수 : 1, 2, 4
		 * 8과 12의 최대 공약수 : 4 
		 * */
		/*- 반복횟수 : i는 1부터 num1까지 1씩 증가
		 * - 규칙성(실행문) : i가 num1과 num2의 공약수이면 gcd에 i를 저장
		 * 					=> num1을 i로 나누었을 때 나머지가 0과 같고
		 * 					   num2를 i로 나누었을 때 나머지가 0과 같다면
		 * - 반복문 종료 후 : gcd를 출력 
		 * */ 		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int i;
		int gcd=0;
		for ( i = 1 ; i <=num1 ; i++ ) {
			if(num1 % i == 0 && num2 % i == 0) {    // 약수 중 가장 마지막 값을 최대 공약수라 정의함. 
					gcd = i;
				}
			}
		System.out.println("두 수의 최대공약수는 : " + gcd);
		
		scan.close();
		
	}

}

