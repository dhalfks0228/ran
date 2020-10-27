package day7;

public class 메소드2 {

	public static void main(String[] args) {
		
		System.out.println(gcd(10, 15));
		System.out.println(lcm(10, 15));
		System.out.println(lcm2(10,15));

	}
	/* 기능 : 최대공약수 구하는 메소드
	 * 매개변수 : 두 수 => int num1, int num2
	 * 리턴타입 : 최대공약수 => int
	 * 메소드명 : gcd
	 * */
	static int gcd(int num1, int num2) {
		int result = 0;
		for ( int i = 1 ; i <=num1 ; i++ ) {
			if(num1 % i == 0 && num2 % i == 0) {    // 약수 중 가장 마지막 값을 최대 공약수라 정의함. 
				result = i;
				}
			}
		return result;
		 
	}
	/* 기능 : 최소공배수 구하는 메소드
	 * 매개변수 : 두 수 => int num1, int num2
	 * 리턴타입 : 최소공배수 => int
	 * 메소드명 : lcm
	 * */
	static int lcm(int num1, int num2) {
		
		for(int i=num1 ; ; i += num1) {
			if( i % num2 == 0 ) {
				return i;
			}
		}
	}
	
	static int lcm2(int num1, int num2) {
		return num1*num2/gcd(num1,num2);
	}
}
