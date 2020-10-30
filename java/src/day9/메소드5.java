package day9;

public class 메소드5 {

	public static void main(String[] args) {
		sum(1,2,3);
		System.out.println(1);
		System.out.println('1'); // 메소드 오버로딩의 대표적인 예.

	}
	/* 메소드 오버로딩 : 동일한 이름을 가지는 메소드가 여러개인 경우 아래 조건을 만족하면 적용됨. 
	 * 1. 매개변수의 개수가 다른 경우
	 * 2. 매개변수의 형태(자료형)가 다른 경우
	 * 매개변수의 이름은 상관 없고, 리턴타입의 자료형도 상관없음. 
	 * */
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
}
