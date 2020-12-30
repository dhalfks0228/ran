package renew3;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* 1. 게시글 등록
		 * 2. 게시글 조회(특정 하나의 게시글)
		 * 3. 게시글 수정
		 * 4. 게시글 삭제
		 * 5. 게시글 목록
		 * 6. 종료
		 * ex) 번호 제목 작성자 작성일
		 * 게시글
		 * - 번호, 제목, 내용, 작성자, 작성일
		 * */
		int menu;
		ArrayList<Post> list = new ArrayList<Post>();
		
		do {
			printMenu();
			menu = scan.nextInt();
			Post tmpNum;
			switch(menu) {
			case 1:
				
				insertPost(list);
				break;
			case 2:
				System.out.println("--게시글 조회--");
				tmpNum = inputNum();
				searchPost(list, tmpNum);
				break;
			case 3:
				System.out.println("--게시글 수정--");
				break;
			case 4:
				System.out.println("--게시글 삭제--");
				tmpNum = inputNum();
				break;
			case 5:
				System.out.println("--게시글 목록--");
				printPost(list);
				break;
			case 6:
				System.out.println("게시판 종료");
				break;
			default:
				System.out.println("프로그램 종료");
				break;
			}
		}while(menu != 6);
		
	}
	private static void printMenu() {
		System.out.println("--게시판 프로그램--");
		System.out.println("1. 게시글 등록");
		System.out.println("2. 게시글 조회");
		System.out.println("3. 게시글 수정");
		System.out.println("4. 게시글 삭제");
		System.out.println("5. 게시글 목록");
		System.out.println("6. 종료");
		System.out.println("--메뉴를 선택하세요--");
	}
	/* 기능 : 게시판에 게시글을를 등록하는 메소드
	 * 매개변수 : 게시판 => ArrayList<Post> list
	 * 리턴타입 : void
	 * 메소드명 : insertPost*/
	private static void insertPost(ArrayList<Post> list) {
		//Post객체 생성
		Post tmp = new Post(null, null, null, null, null);
		System.out.println("---게시글 등록---");
		
		// - 번호, 제목, 내용, 작성자, 작성일
		//String num, String title, String data, String writer, String date
		System.out.print("번호 : ");
		tmp.setNum(scan.next());
		System.out.print("제목 : ");
		tmp.setTitle(scan.next());
		System.out.print("내용 : ");
		tmp.setData(scan.next());
		System.out.print("작성자 : ");
		tmp.setWriter(scan.next());
		System.out.print("작성일 : ");
		tmp.setDate(scan.next());
		list.add(tmp);
	}
	/* 기능 : 검색할 게시글 번호를 입력받는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 번호 => Num
	 * 메소드명 : inputNum*/
	private static Post inputNum() {
		System.out.println("--게시번호 입력--");
		Post tmp = new Post(null, null, null, null, null);
		System.out.print("게시번호 : ");
		tmp.setNum(scan.next());
		return tmp;
	}
	/* 기능 : 게시판에 게시글을 검색하여 콘솔에 출력하는 메소드
	 * 매개변수 : 게시판, 번호 => ArrayList<Post> list, Post num
	 * 리턴타입 : void
	 * 메소드명 : searchPost*/
	private static void searchPost(ArrayList<Post> list, Post num) {
		
		for(Post tmp : list) {
			if(tmp.equals(num.getNum())) {
				System.out.println("---검색결과---");
				System.out.println(tmp);
				return;
			}
		}
		System.out.println("해당 게시글이 없습니다.");
	}
	/* 기능 : 게시글 출력 메소드
	 * 매개변수 : 게시판 => ArrayList<Post> list
	 * 리턴타입 : void
	 * 메소드명 : printPost*/
	private static void printPost(ArrayList<Post> list) {
		System.out.println("---출력---");
		for(Post tmp : list) {
			System.out.println(tmp);
		}
	}
	
}
