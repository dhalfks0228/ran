package renew3;

import java.util.ArrayList;
import java.util.Scanner;

public class WordMain {
	//전역변수처럼 쓰임. 
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* 단어장 프로그램을 작성
		 * 1. 단어 등록
		 * 2. 단어 검색
		 * 3. 단어 수정
		 * 4. 단어 출력
		 * 5. 종료
		 * */
		int menu;
		ArrayList<Word> list = new ArrayList<Word>();
		
		do {
			printMenu();
			menu = scan.nextInt();
			Word tmpWord;
			switch(menu) {
			case 1: 
				System.out.println("단어 등록");
				insertWord(list);
				break;
			case 2: 
				System.out.println("단어 검색");
				tmpWord = inputWord();
				searchWord(list, tmpWord);
				break;
			case 3: 
				System.out.println("단어 수정");
				//수정할 단어를 입력
				tmpWord = inputWord();
				//단어가 있으면 의미를 입력, 없으면 없다고 출력
				//단어장에서 해당 단어를 수정
				modifyWord(list, tmpWord);
				break;
			case 4: 
				System.out.println("단어 출력");
				//단어장 정렬
				//단어장에 있는 모든 단어를 출력
				break;
			case 5: 
				System.out.println("단어장 종료.");
				break;
			default:
				System.out.println("잘못된 메뉴");
			}
		}while(menu != 5);
		System.out.println("프로그램 종료");
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
	/* 기능 : 단어장에 단어를 등록하는 메소드
	 * 매개변수 : 단어장 => ArrayList<Word> list
	 * 리턴타입 : void
	 * 메소드명 : insertWord*/
	private static void insertWord(ArrayList<Word> list) {
		
	}
	/* 기능 : 검색/수정할 단어를 입력받는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 단어 => Word
	 * 메소드명 : inputFullWord*/
	private static Word inputWord() {
		return null;
	}
	/* 기능 : 단어장에 단어를 검색하여 콘솔에 출력하는 메소드
	 * 매개변수 : 단어장, 단어 => ArrayList<Word> list, Word word
	 * 리턴타입 : void
	 * 메소드명 : searchWord*/
	private static void searchWord(ArrayList<Word> list, Word word) {
		
	}
	/* 기능 : 단어 뜻을 입력받아 해당 단어를 단어장에서 수정하는 메소드
	 * 매개변수 : 단어장, 단어 => ArrayList<Word> list, Word word
	 * 리턴타입 : 수정 여부 => boolean
	 * 메소드명 : modifyWord*/
	private static boolean modifyWord(ArrayList<Word> list, Word word) {
		return false; 
	}
	/* 기능 : 단어장에 있는 단어들을 정렬하는 메소드
	 * 매개변수 : 단어장 => ArrayList<Word> list
	 * 리턴타입 : void
	 * 메소드명 : sortWord*/
	private static void sortWord(ArrayList<Word> list) {
		
	}
	/* 기능 : 단어장에 있는 단어들을 출력 메소드
	 * 매개변수 : 단어장 => ArrayList<Word> list
	 * 리턴타입 : void
	 * 메소드명 : printWord*/
	private static void printWord(ArrayList<Word> list) {
		
	}
}
