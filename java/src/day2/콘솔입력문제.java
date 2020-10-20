package day2;

import java.util.Scanner;

public class 콘솔입력문제 {

	public static void main(String[] args) {
		/* 정수와 문자와 정수를 입력받으세요.
		 * 예시
		 * 정수 문자 정수를 입력하세요 (예 : 1 + 2 ) : 1 + 2 
		 * 입력받은 값 : 1 + 2 */

		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		char op;
		System.out.println("정수 문자 정수를 입력하세요. (예 : 1 + 2 )");
		num1 = scan.nextInt();
		op = scan.next().charAt(0);
		num2 = scan.nextInt();
		
		System.out.println(num1 + " " + op + " " + num2); // Enter  포함. 
		//print 는 괄호안의 값이 꼭 있어야 함. 없으면 에러. 
		System.out.printf("입력받은 값은 : %d %c %d\n", num1, op, num2);
		
		scan.close();
		
		
		
		
		
	}

}
