package day5;

public class 알파벳문제 {

	public static void main(String[] args) {
		/* a부터 z까지 반복문을 이용하여 출력하는 예제
		 * 
		 * */
		for( char ch = 'A'; ch<='Z' ; ch++ ) {
			//문자의 유니코드값을 비교하여 실행/증가 가능.
			System.out.print(ch);
		}
		System.out.println();
		/* A
		 * AB
		 * ABC
		 * ABCD
		 * ...
		 * ABC...XYZ
		 * */
		for(char ch='A'; ch<='Z' ; ch++) {    //전체 줄개수
			for(char i='A'; i<=ch; i++) {	// 알파벳 증가변수도 char을 이용.
				System.out.print(ch);
			}
			System.out.println();
		}
		
		

	}

}
