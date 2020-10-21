package day3;

import java.util.Scanner;

public class Switch문1 {

	public static void main(String[] args) {
		/* 모든 조건문은 if 문으로 처리가능
		 * 그 중 일부는 switch문을 이용하면 깔끔하게 처리할 수 있다.
		 * switch(식/변수) {   //조건식이 아니라 식 또는 변수 등이 들어올 수 있음.
		 * 	case 값1:         //마지막에 : 콜론임. 
		 * 		실행문1;
		 * 		break;		// case를 빠져나오는 역할
		 * 	case 값2:
		 * 		실행문2;
		 * 		break;
		 * 	default:		// 나머지에 해당. default, case 는 예약어.
		 * 		실행문3;		// 마지막은 break를 써도되고, 안써도 됨.  break 를 만날 때까지 실행문을 실행해버림.
		 * }
		 * 
		 * if (식/변수 == 값1){
		 * 		실행문1;
		 * }else if(식/변수 == 값2){
		 * 		실행문2;
		 * }else{
		 * 		실행문3;
		 * }
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요.");
		int num = scan.nextInt();  // 변수 선언과 동시에 초기화, 계산, 스캔입력 모두 가능.
		if(num % 2 == 0) {
			System.out.println(num + "는 짝수");
		}else {
			System.out.println(num + "는 홀수");
		}
		
		switch (num % 2) {
			case 0:		// 식에서 나타날 수 있는 경우의 수 또는 변수일 경우 표현할 수 있는 경우의 수. 값으로 올수 있는 값 : 숫자, 문자, 문자열
				System.out.println(num + "는 짝수");
				break;
			case 1:
				System.out.println(num + "는 홀수");
				break;	//default 는 없어도 됨.  마지막 값은 default 처리해도 됨.
		}
		
		
		scan.close();
		

	}

}
