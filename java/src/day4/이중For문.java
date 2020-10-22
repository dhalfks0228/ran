package day4;

public class 이중For문 {

	public static void main(String[] args) {
		/* for(1.초기화; 2.조건식; 3.증감식){       // 실행순서 아님.
		 * 		for(4.초기화; 5.조건식; 6.증감식){
		 * 		실행문;
		 * 		}
		 * 	기타 실행문;
		 * }
		 * 1, 2, 3에서 사용하는 변수와 4, 5, 6에서 사용하는 변수가 일반적으로 다름.
		 * *****
		 * *****
		 * *****
		 * */
		int i, j;
		for (i=1; i<=5; i++) {
			for(j=1; j<=10;j++) {
				System.out.print("*");  // 줄 바꾸지 말고
			}
			System.out.println();    //줄바꿈
		}
		
		/* 구구단 7단을 출력하는 예제
		 * */
		int num = 7; 
		for(num=2; num<=9;num++) {
			//num단 출력하는 코드
			for(i=1; i<=9; i++) {
				System.out.println(num + " X "+ i + " = " + i * num);
			}
			System.out.println();
		}
		// num단을 출력
		
		/* 2~100사이의 모든 소수를 출력하는 예제
		 * 
		 * */
		//num=3;
		int cnt=0;
		for(num=2; num<=100; num++) {
			//cnt 변수 초기화
			for(i=1,cnt=0; i<=100; i++) {
				if(num % i == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				System.out.print(num + " ");
			}
			
		}
	
	}

}
