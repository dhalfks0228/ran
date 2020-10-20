package day2;

public class 콘솔출력 {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println(5);
		System.out.println(1.23);
		System.out.println('한');
		System.out.println(true);
		
		int num1 = 1, num2 = 2;
		//정수 + 정수 => 정수
		//정수 + 문자열 => 문자열
		//문자열 + 정수 => 문자열
		
		System.out.println(num1 + num2 + "");
		System.out.println("" + num1 + num2 );
		char op = '+';
		//해당 문자의 유니코드값이 있음.  +의 유니코드 값이 출력되어 더해짐.
		//공백을 + 해서 문자열로 변환가능.
		System.out.println("" + num1 + op + num2 + "=" + (num1 + num2));

	}

}
