package day2;

import java.util.Scanner;

public class IF문4 {

	public static void main(String[] args) {
		/* 이중 IF문 : if 문 안에 실행문으로 if문이 오는 경우
		 * if(조건식1) {
		 * 		if(조건식2) {
		 * 			실행문1;
		 * 		}else{
		 * 			실행문2;
		 * 		}
		 * 	}
		 * */
		/* 정수를 입력받아 입력받은 정수가 6의 배수인지 출력하시오.
		 * */
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		num = scan.nextInt();
		
		if (num % 2 == 0) {
			// 여기까지 왔다는건 num가 2의 배수인것.
			if(num % 3 == 0 ) {
				System.out.println(num + "는 6의 배수입니다.");
			}else {
				System.out.println(num + "는 6의 배수가 아닙니다.");
			}
			
		}else {
			System.out.println(num + "는 6의 배수가 아닙니다.");
		}
			
		
		scan.close();
		
		
	}

}
