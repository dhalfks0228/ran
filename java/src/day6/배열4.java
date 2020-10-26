package day6;

import java.util.Scanner;

public class 배열4 {

	public static void main(String[] args) {
		/* 짝수 10개를 배열에 저장하고 저장된 배열의 값을 출력하는 예제
		 * */
		int size = 10;
		int arr[]= new int[size];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = (i + 1) * 2 ;
			System.out.println("arr[" + i + "] = " + arr[i]);  //배열 안에 입력된 값 출력. 
		
			
		}
		
	}

}
