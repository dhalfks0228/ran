package renew3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordMain2 {
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
				sortWord(list);
				//단어장에 있는 모든 단어를 출력
				printWord(list);
				break;
			case 5: 
				System.out.println("단어장 종료.");
				break;
			default:
				System.out.println("잘못된 메뉴");
				break;
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
		//Word객체 생성
		Word tmp = new Word(null, null);
		System.out.println("---단어 등록---");
		System.out.print("단어 : ");
		tmp.setWord(scan.next());
		System.out.print("의미 : ");
		tmp.setMean(scan.next());
		list.add(tmp);
	}
	/* 기능 : 검색/수정할 단어를 입력받는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 단어 => Word
	 * 메소드명 : inputFullWord*/
	private static Word inputWord() {
		System.out.println("---단어 입력---");
		Word tmp = new Word(null, null);
		System.out.print("단어 : ");
		tmp.setWord(scan.next());
		return tmp;
	}
	/* 기능 : 단어장에 단어를 검색하여 콘솔에 출력하는 메소드
	 * 매개변수 : 단어장, 단어 => ArrayList<Word> list, Word word
	 * 리턴타입 : void
	 * 메소드명 : searchWord*/
	private static void searchWord(ArrayList<Word> list, Word word) {
		/*
		for(int i = 0; i<list.size(); i++) {
			Word tmp = list.get(i);
			if(tmp.equals(word.getWord())) {
				System.out.println("---검색결과---");
				System.out.println(tmp);
				return;
			}
		}
		*/
		for(Word tmp : list) {
			if(tmp.equals(word.getWord())) {
				System.out.println("---검색결과---");
				System.out.println(tmp);
				return;
			}
		}
		System.out.println("해당 단어가 없습니다.");
	}
	/* 기능 : 단어 뜻을 입력받아 해당 단어를 단어장에서 수정하는 메소드
	 * 매개변수 : 단어장, 단어 => ArrayList<Word> list, Word word
	 * 리턴타입 : 수정 여부 => boolean
	 * 메소드명 : modifyWord*/
	private static boolean modifyWord(ArrayList<Word> list, Word word) {
		//검색해서 있으면 삭제, 없으면 없다고 출력 후 종료
		int size = list.size();
		for(int i = 0; i<list.size(); i++) {
			//위의 주석 처리한 for문의 내용과 같은 내용을 줄임.
			if(list.get(i).equals(word.getWord())) {
				list.remove(i);
				break;
			}
		}
		//단어가 없으면 없음을 알리고 종료.
		if(size == list.size()) {
			System.out.println("해당 단어가 없습니다.");
			return false; 
		}
		//뜻을 입력
		System.out.print("의미 : ");
		word.setMean(scan.next());
		//수정된 단어 word를 list에 추가
		list.add(word);
		return true;
		
	}
	/* 기능 : 단어장에 있는 단어들을 정렬하는 메소드
	 * 매개변수 : 단어장 => ArrayList<Word> list
	 * 리턴타입 : void
	 * 메소드명 : sortWord*/
	private static void sortWord(ArrayList<Word> list) {
		Collections.sort(list);
	}
	/* 기능 : 단어장에 있는 단어들을 출력 메소드
	 * 매개변수 : 단어장 => ArrayList<Word> list
	 * 리턴타입 : void
	 * 메소드명 : printWord*/
	private static void printWord(ArrayList<Word> list) {
		System.out.println("---출력---");
		for(Word tmp : list) {
			System.out.println(tmp);
		}
	}
}
