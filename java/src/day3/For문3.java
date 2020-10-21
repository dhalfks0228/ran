package day3;

public class For문3 {

	public static void main(String[] args) {
		/* 1부터 100까지 2의 배수들을 출력하는 예제
		 * 
		 * */
		
		int num;
		System.out.println("1부터 100까지 2의 배수를 출력");
		for (num=1 ;num <=100 ;num++ ) {
			if(num % 2 == 0) {
				System.out.print(num + " ");
				if(num % 10 == 0) {       // num가 10의 배수이면 Enter
					System.out.println();
				}
			}
		}
		System.out.println();

	}

}
