package day5;

import java.util.Scanner;

public class While문1 {

	public static void main(String[] args) {
		/* while(조건식){
		 * 	실행문;  		// 증감식을 포함한 문.
		 * }
		 * 
		 * 초기화;
		 * while(조건식){  // for문의 배열식대로 배열.
		 * 	실행문;
		 * 	증감식;
		 * }
		 * */
		for(int i = 1; i<=5; i++) {   // for문은 초기화, 조건식, 증감연산식 생략가능
			System.out.println(i);
		}
		
		int i=1;
		while(i<=5) {					// while문은 조건식 생략 불가
			System.out.println(i);
			i++;
		}
		
		int j=1;
		while(j<=5) {
			if(j % 2 == 1) {
				j++;
				continue;		// continue 에서 증감연산이 있어야 
			}					// 다음 조건식에서 무한루프에 빠지지 않음.
			System.out.println(j);
			j++;
		}
		/* for문은 차례대로 증가하는 경우 => 증감연산식이 꼭 필요한 경우
		 * while문은 입력받은 값을 이용하여 반복문을 유지하는 경우
		 * */
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		while(menu != 4) {
			System.out.println("-----메뉴----");
			System.out.println("1.불러오기");
			System.out.println("2.저장하기");
			System.out.println("3.실행하기");
			System.out.println("4.종료하기");
			System.out.println("------------");
			System.out.print("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
			// 실제 기능이 있다면 if나 switch 문으로 구현
		}
		System.out.println("프로그램 종료!!");
		
		scan.close();
	}

}
