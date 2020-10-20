package day2;

import java.util.Scanner;

public class IF문3 {

	public static void main(String[] args) {
		/* 조건식1이 참이면 실행문1을 실행하고, 
		 * (조건식1이 거짓이고,) 조건식2가 참이면 실행문2를 실행하고,
		 * (조건식1과 조건식2가 거짓이면) 실행문3을 실행하라.
		 * else : else를 기준으로 위에 있는 조건식들이 거짓이면
		 * if(조건식1){
		 * 		실행문1;
		 * }else if(조건식2){
		 * 		실행문2;
		 * }else{
		 * 		실행문3;
		 * }
		 * */
		
		
		/* 정수를 입력받아 정수가 양수이면 양수라고 출력하고
		 * 0이면 0이라고 출력하고
		 * 음수이면 음수라고 출력하세요. 
		 * */
		Scanner scan = new Scanner(System.in);
				
		int num1;
		System.out.print("숫자를 입력하세요. : ");
		num1 = scan.nextInt();
			
		if (num1 > 0) {
			System.out.println("입력한 숫자 " + num1 + "은 : 양수");
		}else if(num1 == 0) {
			System.out.println("입력한 숫자 " + num1 + "은 : 0");
		}else {
			System.out.println("입력한 숫자 " + num1 + "은 : 음수");
		}
		
		/* 초보일 때는 이렇게 시작  
		 * if (num가 양수이다) {
				실행문
		}else if(num가 음수이다) {
				실행문
		}else {
				실행문
		}
		*/
		
		/* 성적(정수)을 입력받아 입력받은 성적에 맞는 학점을 출력하시오.
		 * 90 ~ 100 : A => 점수가 90보다 (크거나 같)(고), 100보다 (작거나 같다)
		 * 					num2 >= 90 && num2 <= 100
		 * 80 ~ 89  : B => 점수가 80보다 (크거나 같)(고), 90보다 (작다)
		 * 					num2 >= 80 && num2 < 90
		 * 70 ~ 79  : C => 점수가 70보다 크거나 같고, 80보다 작다
		 * 60 ~ 69  : D => 점수가 60보다 크거나 같고, 70보다 작다
		 *  0 ~ 59  : F => 점수가  0보다 크거나 같고, 60보다 작다
		 *  0미만, 100초과 : 잘못된 성적 = 0보다 작거나 100보다 크다
		 * */
			
		int num2;
		System.out.print("성적을 입력하세요. : ");
		num2 = scan.nextInt();
		
		if (num2 >= 90 && num2 <= 100) {
			System.out.println("학점 : A");
		}else if(num2 >= 80 && num2 < 90) {
			System.out.println("학점 : B");
		}else if(num2 >= 70 && num2 < 80) {
			System.out.println("학점 : C");
		}else if(num2 >= 60 && num2 < 70) {
			System.out.println("학점 : D");
		}else if(num2 >= 0 && num2 < 60) {
			System.out.println("학점 : F");
		}else {
			System.out.println("잘못된 성적입니다.");
		} 
		
		/* if (num2 >= 90 && num2 <= 100) {
			System.out.println("학점 : A");
		}else if(num2 >= 80 ) {             <= 안되는 경우.
			System.out.println("학점 : B");
		}else if(num2 >= 70 ) {
			System.out.println("학점 : C");
		}else if(num2 >= 60 ) {
			System.out.println("학점 : D");
		}else if(num2 >= 0 ) {
			System.out.println("학점 : F");
		}else {
			System.out.println("잘못된 성적입니다.");
		} */  
		
		
		if (num2 > 100 || num2 < 0) {
			System.out.println("잘못된 성적입니다.");
		}else if(num2 >=90)  {	
			System.out.println("학점 : A");
		}else if(num2 >= 80) {
			System.out.println("학점 : B");
		}else if(num2 >= 70) {
			System.out.println("학점 : C");
		}else if(num2 >= 60) {
			System.out.println("학점 : D");
		}else {
			System.out.println("학점 : F");
		} 
		
		scan.close();

	}

}
