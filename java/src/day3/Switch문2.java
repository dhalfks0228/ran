package day3;

import java.util.Scanner;

public class Switch문2 {

	public static void main(String[] args) {
		/* 달을 입력받아 해당하는 달이 어떤 계절인지 출력하는 코드를 
		 * switch문으로 작성하세요.
		 * 12~2 : 겨울
		 * 3~5 : 봄
		 * 6~8 : 여름
		 * 9~11 : 가을
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1 ~ 12월 중 입력하세요.");
		int month = scan.nextInt();
		
		switch (month) {
		case 1: case 2: case 12:
			System.out.println(month + "월은 겨울");
			break;
		case 3:	case 4:	case 5:
			System.out.println(month + "월은 봄");
			break;
		case 6: case 7: case 8:
			System.out.println(month + "월은 여름");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "월은 가을");
			break;
		default:
			System.out.println(month + "월은 오류");
		}
		
		if (month <=2 ) {
			System.out.println(month + "월은 겨울");
		}else if(month <= 5) {
			System.out.println(month + "월은 봄");
		}else if(month <= 8) {
			System.out.println(month + "월은 여름");
		}else if(month <= 11) {
			System.out.println(month + "월은 가을");
		}else if(month == 12) {
			System.out.println(month + "월은 겨울");
		}else {
			System.out.println(month + "월은 오류");
		}
		
		scan.close();

	}

}
