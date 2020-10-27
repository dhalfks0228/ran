package day7;

public class 메소드1 {

	public static void main(String[] args) {
		/* 메소드 : 기능
		 * 매개변수 : 기능을 실행하기 위해 필요한 정보(필요 정보)
		 * 리턴타입 : 기능을 실행 후 알려주는 정보(자료형으로 표시)
		 * 메소드 선언 및 구현
		 * 리턴타입 메소드명(매개변수){
		 * 		구현;
		 * }
		 * 
		 * */
		//int result = sum(1,2)+sum(3,4); // sum은 재사용 가능. 
		//System.out.println(result);
		//sum2(3,4);						// sum2는 재사용 X 바로 출력할수만 있는 코드
		//System.out.println(isPrime(8));
		
		/* isPrime 메소드를 이용하여 100이하의 소수를 출력하는 코드를 작성하세요.*/
		
		System.out.println("100이하의 소수를 출력" + "");
		for(int i=2; i<=100; i++) {
			// if문 안의 조건식은 true 또는 false를 만들기 위한 식. 
			// 값 자체가 true/false일 경우 굳이 식으로 만들필요 없음.
			if(isPrime(i)) {
				System.out.print( i + " " );
			}
		}
		

	}
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메소드
	 *모든 매개변수 앞에 자료형을 붙여줘야 함.
	 * 매개변수 : 두 정수 => int num1, int num2 (자료형 변수명, 자료형 변수명)  
	 * 리턴타입 : 합 => 정수 => int
	 * 메소드명 : sum 
	 * */
	static int sum(int num1, int num2) {
		int result = num1 + num2;  // 두 자료형이 같아야 한다.
		return result; 
	}
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 콘솔에 출력하는 메소드
	 * 메개변수 : 두 정수 => int num1, int num2; 
	 * 리턴타입 : 없음. = void
	 * 메소드명 : sum2
	 * */
	static void sum2(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
		
	}
	/* 정수가 주어지면 정수가 소수인지 아닌지 알려주는 메소드
	 * 매개변수 : 정수 => int num
	 * 리턴타입 : result1 => boolean  yes/no
	 * 메소드명 : isPrime
	 * */
	static boolean isPrime(int num) {
		int j=0;
		for ( int i = 1 ; i <= num ; i ++ ) {
			if(num % i == 0) {
				j ++;
			}
		}
		if(j == 2) {
			return true;
		}else {
			return false;
		}
		
	}
}
