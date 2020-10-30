package day9;

public class 메소드6 {

	public static void main(String[] args) {
				
		System.out.println(calc(5, 7, '+'));
		System.out.println(calc(5, 7, '-'));
		System.out.println(calc(5, 7, '*'));
		System.out.println(calc(5, 7, '/'));
		System.out.println(calc(5, 7, '%'));
		
		System.out.println(calc2(1.5, '+', 2.3));
		System.out.println(calc2(2.3, '-', 1.5));
		System.out.println(calc2(2.3, '*', 1.5));
		System.out.println(calc2(2.3, '/', 1.5));
		System.out.println(calc2(2.3, '%', 1.5));
	}

/* 기능 : 두 정수와 산술연산자(+,-,*,/,%)가 주어졌을 때 산술 연산 결과를 알려주는 메소드
 * 매개변수 : 두 정수, 연산자
 * 리턴타입 : 산술연산의 결과 double
 * 메소드명 : calc
 * */

	public static double calc(int num1, int num2, char op) {
		double res;
		switch(op) {
		case '+' : 
			res = num1 + num2;
			break;
		case '-' :
			res = num1 - num2;
			break;
		case '*' :
			res = num1 * num2;
			break;
		case '/' :
			res = (double)num1 / num2;
			break;
		case '%' :
			res = num1 % num2;
			break;
		default :
			res = 00000;
		}
		return res;
	}
	
	/* 기능 : 두 실수와 산술연산자(+,-,*,/,%)가 주어졌을 때 산술 연산 결과를 알려주는 메소드
	 * 매개변수 : 두 실수, 연산자
	 * 리턴타입 : 연산의 결과 double
	 * 메소드명 : clac2
	 * */
	public static double calc2(double num1, char op, double num2) {
		switch(op) {
		case '+' : return num1 + num2;
		case '-' : return num1 - num2;
		case '*' : return num1 * num2;
		case '/' : return num1 / num2;
		case '%' : return num1 % num2;
		}
		return 0;  // default 처리가 필요함. 
	}
	
	
	
}
	
