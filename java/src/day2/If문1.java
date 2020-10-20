package day2;

public class If문1 {

	public static void main(String[] args) {
		/*
		 * 조건식이 참이면 실행문을 실행해라
		 * if(조건식) {
		 *   		  실행문;
		 *   }
		 *   ~하면  ...한다
		 *   ~ 조건식, ... 실행문
		 */
		/* num가 0이면 0이라고 출력
		 * 조건식 : num가 0이면 =>  num == 0
		 * 실행문 : 0이라고 출력 
		 */
		int num = 1;
		if (num == 0) {
			System.out.println("num는 0입니다.");
		}
		
		/*  num가 0이 아니면 0이 아니라고 출력
		 *  조건식 : num가 0과 같지 않다
		 *  실행문 : 0이 아니라고 출력
		 *  if (조건문) {
		 *  	실행문;
		 *  }  이부분을 먼저 입력하고, 조건문과 실행문에 해당하는 것을 하나씩 입력.  <- 초보자 설명시 중요할 것 같음.
		 *  
		 *  잘 모르겠다면 조건문, 실행문 부분을 한글로 먼저 써보고 코딩으로 변경하는 것을 추천
		 */
		if (num != 0) {
			System.out.println("num는 0이 아닙니다.");
		}
		
		// num가 양수이면 양수라고 출력(0을 포함하지 않음) 
		// 조건식 : num가 0보다 크다
		// 실행문 : 양수라고 출력
		/*if (조건문) {
		 *  	실행문;
		 *  }  이부분을 먼저 입력하고, 조건문과 실행문에 해당하는 것을 하나씩 입력.  <- 초보자 설명시 중요할 것 같음.
		 *  
		 *  잘 모르겠다면 조건문, 실행문 부분을 한글로 먼저 써보고 코딩으로 변경하는 것을 추천
		 */	
		if(num > 0) {
			System.out.println("양수입니다.");
		}
		
		// num가 음수이면 음수라고 출력(0을 포함하지 않음)
		// 조건식 : num가 0보다 작다
		// 실행문 : 음수라고 출력
		
		if (num < 0) {
			System.out.println("음수입니다.");
		}
		
		
		
 	}

}
