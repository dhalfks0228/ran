package day6;

import java.util.Scanner;

public class 배열5 {

	public static void main(String[] args) {
		/* 세명의 국어점수를 입력받아 배열에 저장하고, 
		 * 3명의 국어 점수의 총점과 평균을 구하는 예제
		 * */
		Scanner scan = new Scanner(System.in);
		int size = 3;
		int arr[] = new int[size];
		int sum = 0;
		double avg = 0;
		System.out.println("3명의 국어점수를 입력하세요.");
		for (int i=0; i<arr.length; i++) {
			arr[i]= scan.nextInt();
			sum += arr[i];
		}
		avg = (double)sum / arr.length;
		System.out.println("국어점수의 총점은 : " + sum);
		System.out.println("국어점수의 평균은 : " + avg);
		
		
		scan.close();

	}

}
