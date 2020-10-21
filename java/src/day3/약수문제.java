package day3;

import java.util.Scanner;

public class 약수문제 {

	public static void main(String[] args) {
		/* num를 입력받아 입력받은 num의 약수를 출력하는 예제
		 * 약수란 : 나누어 떨어지는 수
		 * 12의 약수 : 1, 2, 3, 4, 6, 12
		 * 수    : 1 2 3 4 5 6 7 8 9 10 11 12
		 * 나머지 : 0 0 0 0 2 0 5 4 3 2  1   0
		 * 반복횟수 : i는 1부터 num까지 1씩증가
		 * - 초기화 : i = 1부터
		 * - 조건식 : i는 num까지
		 * - 증감연산식 : i는 1씩 증가
		 * 규칙성 : i가 num의 약수이면 i를 출력 
		 * 		=> num를 i로 나누었을 때 나머지가 0과 같다면 i를 출력
		 * 반복문 종료 후 : 없음.
		 * */
		Scanner scan = new Scanner(System.in); // 입력받은 num의 값의 for문 처리의 종료를 알 수 없어서...
		
		System.out.println("수를 입력하세요.");
		int num=scan.nextInt();
		int i;
		System.out.println(num + "의 약수는 ? ");
		for ( i=1 ; i<=num ; i++ ) {
			if(num % i == 0 ) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		scan.close();

	}

}
