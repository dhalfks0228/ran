package day12;

public class wapper클래스 {
	public static void main(String[] args) {
		/* Wrapper 클래스는 기본 자료형을 클래스로 변환한것
		 * 차이점
		 * - 래퍼 클래스는 null을 허용, 기본 자료형은 null을 허용하지 않음.
		 * - 래퍼 클래스는 기능(메서드)를 제공
		 * 
		 * */
//		int num1 = null; // 기본 자료형은 null을 사용할 수 없음. 
		//null은 참조변수에서만 사용할 수 있다. 
		Integer num2 = null; // 클래스로 만든 참조변수라 null을 허용. 
		num2 =Integer.parseInt("1234"); //문자열을 정수로 만들어주는 메소드
		System.out.println(num2);
		num2 = Integer.valueOf("5678");
		System.out.println(num2);
		num2 = Integer.valueOf("FF",16); // 16진수 ff 를 정수로 변환
		System.out.println(num2);
		//num2 = null;
		int num3 = num2; // 언박싱
		System.out.println(num3);
		num2 = 23;  // 오토박싱
		System.out.println(num2);
		
	}
}
