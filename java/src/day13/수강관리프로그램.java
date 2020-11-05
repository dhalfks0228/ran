package day13;

import java.util.Scanner;

public class 수강관리프로그램 {

	public static void main(String[] args) {

//		Subject[] sub = new Subject[10];
//		sub[0] = new Subject("AB001","JAVA 프로그래밍",4.5,32,"홍길동",2020,"1학년2학기","전공필수","월1A,월1B,수1A,수1B");
//		sub[1] = new Subject("AB002","DB의 기초", 4.5,32,"임꺽정",2020,"1학년2학기","전공필수","화1A,화1B,수1A,수1B");
//		sub[2] = new Subject("AB003","Mysql", 4.5,28,"강감찬",2020,"2학년2학기","전공필수","월2A,월2B,목2A,목2B");
//		sub[3] = new Subject("AB004","HTML/CSS/JSP", 4.5,40,"신사임",2020,"2학년2학기","전공필수","화2A,화2B,수2A,수2B");
//		
////		for(int i = 0; i<sub.length;i++) {
////			if(sub[i]!=null) {
////			sub[i].subjectPrint();
////			System.out.println("------------");
////			}
////		}
//		
//		Student std2 = new Student("김영이","990101-1234567","20010101","컴퓨터공학부","컴퓨터공학과",2);
//		std2.stdPrint();
//		std2.insertSubject(sub[0]);
////		std2.print();
////		System.out.println("----------------------");
//		std2.insertSubject(sub[1]);
////		std2.print();
////		System.out.println("----------------------");
//		std2.insertSubject(sub[2]);
//		std2.print();
//		System.out.println("----------------------");
//		std2.deleteSubject("DB의 기초");
//		std2.print();
//		System.out.println("----------------------");
//		
////		System.out.println(sub);
//			
////		Subject s = new Subject("AB001","JAVA 프로그래밍",4.5,32,"홍길동",2020,"1학년2학기","전공필수","월1A,월1B,수1A,수1B");
////		
////		Student std = new Student("김영이","990101-1234567","20010101","컴퓨터공학부","컴퓨터공학과",2);
////		std.stdPrint();
////		std.insertSubject(s);
////		std.print();
////		System.out.println("----------------------");
////		std.insertSubject(new Subject("AB002","DB의 기초", 4.5,32,"임꺽정",2020,"1학년2학기","전공필수","화1A,화1B,수1A,수1B"));
////		std.print();
////		System.out.println("----------------------");
////		std.deleteSubject("DB의 기초");
////		std.print();
////		System.out.println("----------------------"); 
		
		StudentManager sm = new StudentManager();
		char menu = '0';
		Scanner scan = new Scanner(System.in);
		do {
			sm.printMenu();
			menu = scan.next().charAt(0);
			switch(menu) {
			case '1': sm.insertStudent(scan); break;
			case '2': sm.printStudent(); break;
			case '3': sm.searchStudent(scan); break;
			case '4': sm.registerSubject(scan); break;
			case '5': sm.deleteSubject(scan); break;
			case '6' : break;
			default :
				sm.printAlert();
			}
		}while(menu != '6');
		sm.printExit();
		scan.close();
		
	}
	
}
