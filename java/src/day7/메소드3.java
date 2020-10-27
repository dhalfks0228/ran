package day7;

public class 메소드3 {

	public static void main(String[] args) {
		printMulti(7);
		System.out.println(mathRandom(5, 9));
	
	}
	/* 기능 :구구단 한 단을 출력하는 메소드
	 * 매개변수 : 정수 => int num1 
	 * 리턴타입 : 없음 => void    // return이 필수가 아님.
	 * 메소드명 : printMulti
	 * 
	 * */
	static void printMulti(int num1) {
		
		//for(num1=num1; num1<=9;num1++) {
			//num단 출력하는 코드
			for(int i= 1; i<=9; i++) {
				System.out.println(num1 + " X "+ i + " = " + i * num1);
			}
			System.out.println();
		//}
		
	}
	/* 기능 : 원하는 범위의 랜덤 값을 알려주는 메소드
	 * 매개변수 : min과 max의 범위 값 => int min, int max 
	 * 리턴타입 : 랜덤의 값 => int
	 * 메소드명 : mathRandom
	 * */
	static int mathRandom(int min, int max) {
		return (int)((max - min + 1)* Math.random() + min);
		
	}
	
}
