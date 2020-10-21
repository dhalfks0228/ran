package day3;

import java.util.Scanner;

public class 복습문제 {

	public static void main(String[] args) {
		/* 정보처리기사는 sw1(소프트웨어 설계), sw2(소프트웨어 개발)
		 * db(데이터베이스 구축), program(프로그래밍 언어 활용)
		 * info(정보시스템 구축관리)로 구성되어 있다.
		 * 1. 각 과목의 성적을 입력받고 입력받은 성적을 출력하는 코드를 작성하세요.
		 * - 성적은 정수
		 * 2. 과목 중 한 과목이라도 40점 미만이 있으면 과락이라고 출력
		 * 3. 과목의 평균을 구하여 평균이 60점 미만이면 탈락이라고 출력 
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		int sw1, sw2, db, pro, info;
		// 입력 받기 전 안내문 출력
		System.out.print("각 과목의 점수를 입력하세요. (sw1, sw2, db, pro, info) : ");
		sw1 = scan.nextInt();
		sw2 = scan.nextInt();
		db = scan.nextInt();
		pro = scan.nextInt();
		info = scan.nextInt();
		//System.out.println("각 과목의 점수는 : sw1(" + sw1 + "), sw2(" + sw2+ "), db(" + db+ "), pro(" + pro+ "), info(" + info + ")");
		
		int sum;
		double avg;
		sum = sw1 + sw2 + db + pro + info;
		avg = sum/5.0;
		System.out.println("합계 :"+sum + ", 평균 :" + avg);	
		
		if(sw1<40 || sw2<40 || db<40 || pro<40 || info<40) {
			System.out.println("과락입니다.");
		}else if(avg < 60) {
			System.out.println("탈락입니다.");
		}else {
			System.out.println("합격입니다.");
		}
		
		/*if(sw1<40) {
			System.out.println("과락입니다.");
		}else if(sw2<40) {
			System.out.println("과락입니다.");
		}else if(db<40) {
			System.out.println("과락입니다.");
		}else if(pro<40) {
			System.out.println("과락입니다.");
		}else if(info<40) {
			System.out.println("과락입니다.");
		} */
		
				
		scan.close();
		
	}

}
