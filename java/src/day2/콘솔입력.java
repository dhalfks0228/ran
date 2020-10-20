package day2;

import java.util.Scanner;

public class 콘솔입력 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner는 클래스 그래서 첫글자 대문자 입력. 
		//System.in : 콘솔에서 입력받는 값
		int num;
		System.out.print("정수를 입력하세요.");
		//println : 출력하고 Enter
		//print  : 출력
		num = scan.nextInt();
		System.out.println("입력받은 값 : " + num);
		
		double num2;
		
		System.out.print("실수를 입력하세요 : ");
		num2 = scan.nextDouble();
		System.out.println("입력받은 값 : "  + num2);
		
		String str1;
		System.out.println("문자열을 입력하세요 : ");
		str1 = scan.next();
		//next는 문자열의 양쪽 끝에 있는 공백을 제외한 문자열을 가져옴
		System.out.println("입력받은 값 : " + str1);
		
		String str2;
		System.out.println("문자열을 입력하세요 : ");
		str2 = scan.nextLine();
		//nextLine 공백이 포함. 그래서 enter를 입력받아 그대로 출력됨.
		System.out.println("입력받은 값 : " + str2);
		
		char ch;
		System.out.println("문자를 입력하세요 : ");
		ch = scan.next().charAt(0);  //문자 하나를 가져오는 코드 문자열을 입력받아 첫번째 글자만 입력.
		System.out.println("입력받은 값 : " + ch);
		
		
		scan.close();
		

	}

}
