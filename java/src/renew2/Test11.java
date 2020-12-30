package renew2;

import java.util.*;

public class Test11 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* 단어장 프로그램을 작성
		 * 1. 단어 등록
		 * 2. 단어 검색
		 * 3. 단어 수정
		 * 4. 단어 출력
		 * 5. 종료
		 * */
		printMenu();
				
		int menu = scan.nextInt();
		
		do {
			switch(menu) {
			case 1: ; break;
			case 2: ; break;
			case 3: ; break;
			case 4: ; break;
			case 5: 
				System.out.println("프로그램을 종료합니다.");
				break;
			
			}
			
		}while(menu < 5);
		
		scan.close();
	}
	private static void printMenu() {
		System.out.println("--단어장 프로그램--");
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 검색");
		System.out.println("3. 단어 수정");
		System.out.println("4. 단어 출력");
		System.out.println("5. 종료");
		System.out.println("--메뉴를 선택하세요--");
	}

}
