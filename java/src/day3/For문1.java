package day3;

public class For문1 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * 종류 : for문, while문, do while문
		 * - for문과 while문은 문법은 다르지만 동작 방식은 같다.
		 * - do while문은 조금 다르다.
		 * for ( 1.초기화 ; 2.5.8.조건식 ; 4.7.증감연산식 ){
		 * 3.6.실행문; 
		 * }
		 * 1. 초기화 : 조건식이나 실행문에서 사용하는 변수를 초기화, 반복문 실행시 처음만 실행된다. 생략 가능.
		 * 2. 조건식 : 반복문의 반복을 결정하는 식. 참이면 반복, 거짓이면 그만. 생략가능(생략하면 무조건 참)
		 * 4. 증감연산식 : 조건식에서 사용하는 변수를 증가/감소시켜서 반복 횟수를 결정. 생략가능
		 * 
		 * */
		/* 1부터 10까지 출력하는 예제
		 * 반복횟수 : num이 1부터 10까지 1씩 증가
		 * - 초기화 : num은 1부터
		 * - 조건식 : num가 10까지 => 10보다 작거나 같다.
		 * - 증감연산식 : num가 1씩 증가
		 * 규칙성(실행문) : num를 출력 
		 * 반복문 종료후 : 없음. 
		 * */
		
		int num;
		//num=num+1 // num++ // ++num
		for(num = 1 ; num<=10 ; ++num ) {
			System.out.print(num+" ");
		}
		System.out.println(" ");
		
		/* 10부터 1까지 출력하는 예제
		 * 반복횟수 : num1은 10부터 1까지 1씩 감소
		 * - 초기화 : num1은 10부터
		 * - 조건식 : num1이 1까지
		 * - 증감연산식 : num1이 1씩 감소 
		 * 규칙성 : num1의 숫자를 출력
		 * 반복문 종료 후 : 없음.
		 * 
		 * */
		int num1;
		for (num1 = 10 ; num1>=1 ; num1--) {
			System.out.print(num1 +" ");
		}
		System.out.println(" ");
		
		/* 1부터 10사이의 모든 짝수를 출력하는 예제
		 * 반복횟수 : num2는 2부터 10까지 2씩 증가 
		 * - 초기화 : num2는 2부터
		 * - 조건식 : num2는 10까지 (참일경우 실행)
		 * - 증감연산식 : num2가 2씩 증가
		 * 규칙성 : num2의 숫자를 출력
		 * */
		int num2;
		for (num2 = 2 ; num2 <=10 ; num2 = num2 + 2) {
			System.out.print(num2 + " ");
		}
		System.out.println(" ");
		
		/* 1부터 10사이의 모든 짝수를 출력하는 예제
		 * 반복횟수 : num2는 1부터 10까지 1씩 증가 
		 * - 초기화 : num2는 1부터
		 * - 조건식 : num2는 10까지 (참일경우 실행)
		 * - 증감연산식 : num2가 1씩 증가
		 * 규칙성 : num2가 짝수이면 num2를 출력
		 * */
		for (num2=1 ; num2 <=10 ; num2++) {
			if (num2 % 2 == 0) {
				System.out.print(num2 + " ");
			}
		}
		System.out.println(" ");
		
		/* 구구단 7단을 출력하는예제
		 * 반복횟수 : num3은 1부터 9까지 1씩 증가
		 * - 초기화 : num3은 1부터
		 * - 조건식 : num3은 9까지 
		 * - 증감연산식 : num3이 1씩 증가
		 * 규칙성 : num3에 7을 곱한 수를 출력.
		 * 출력 예시 7 X 1 = 7 한줄식
		 * */
		int num3;
		int num4;
		
		
		for (num4 = 2 ; num4 <= 9 ; num4++) {
			
		for (num3 = 1 ; num3 <= 9 ; num3++ ) {
			//System.out.println( "7 X " + num3 + " = " + num3*7);
			
			System.out.println(num4 + " X " + num3 + " = " + num3*num4);
		}
		System.out.println(" ");
		
		}
		
	}
	
}
