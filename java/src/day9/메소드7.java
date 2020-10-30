package day9;

public class 메소드7 {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(fact(5));

	}
	/* 재귀 메소드 : 메소드 A안에 메소드 A를 호출하는 메소드(드물게 사용)
	 * 5! = 5 * 4 * 3 * 2 * 1
	 * 		5 * 4!
	 * 4! = 4 * 3 * 2 * 1
	 * 0! = 1
	 * */
	/* 기능 : 양수가 주어지면 주어진 양수의 팩토리얼 값을 알려주는 메소드
	 * 매개변수 : 양수 num => int num
	 * 리턴타입 : 팩토리얼 값 => int
	 * 메소드명 : factorial
	 * */
	
	public static int factorial(int num) {
		if(num < 0) {  // num가 0보다 작다면 리턴 0 
			return 0;   //  이 부분이 없다면 스택 오버플로 발생. 
		}
		if(num == 0 || num == 1) { // num가 0도는 1이면 리턴 1
			return 1;   //  이 부분이 없다면 스택 오버플로 발생. 
		}
		return num * factorial(num-1);  // 재귀 호출.
	}
	
	public static int fact(int num) {
		if(num < 0) {  // num가 0보다 작다면 리턴 0 
			return 0;   //  이 부분이 없다면 스택 오버플로 발생. 
		}
		if(num == 0 || num == 1) { // num가 0도는 1이면 리턴 1
			return 1;   //  이 부분이 없다면 스택 오버플로 발생. 
		}
		int res = 1;
		for(int i = 2; i<=num ; i++) {
			res *= i;
		}
		return res;
	}
}
