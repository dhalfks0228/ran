package renew4;

import java.util.*;

import renew3.Post;

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
		ArrayList<Board> list = new ArrayList<Board>();
		int menu = 6;
		do {
			//메뉴출력
			printMenu();
			//메뉴 선택(입력)
			menu = scan.nextInt();
			System.out.println("");
			String title, contents, writer;
			Board tmpBoard;
			int num;
			int index = -1;
			//선택된 메뉴에 따라 기능을 동작 => 조건문
			switch(menu) {
			case 1:
				//게시글 등록 기능 수행
				addBoard(list);
				break;
			case 2:
				//게시글 조회 기능 수행
				//확인하고자 하는 게시글의 번호를 입력
				System.out.print("--조회하려는 게시글 번호를 입력 : ");
				num = scan.nextInt();
				//입력한 번호에 맞는 게시글이 있는지 리스트에서 확인
				printBordByNum(list, num);
				break;
			case 3:
				//게시글 수정 기능 수행
				//수정하고자 하는 게시글의 번호를 입력
				System.out.print("--수정하려는 게시글 번호를 입력 : ");
				num = scan.nextInt();
				// 입력한 번호에 게시글이 리스트에 있는지 확인 후 수정
				modifyBoardByNum(list, num);
				break;
			case 4:
				//게시글 삭제 기능 수행
				//삭제할 게시글 번호를 입력
				System.out.print("--삭제하려는 게시글 번호를 입력 : ");
				num = scan.nextInt();
				//주어진 번호와 일치하는 게시글 삭제
				deleteBoardByNum(list, num);
				break;
			case 5:
				System.out.println("--게시글 목록--");
				//게시글 목록 전체 조회
				for(Board tmp : list) {
					System.out.println(tmp);
				}
				if(list.size()==0) {
					System.out.println("등록된 게시물이 없습니다.");
				}
				break;
			case 6:
				System.out.println("게시판 종료");
				break;
			default:
				System.out.println("잘못된 메뉴");
				break;
			}
		}while(menu != 6);
		
		scan.close();
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
	/* 기존 리스트에 새 게시글을 등록
	 * 매개변수 : 기존의 리스트 => ArrayList<Board> list
	 * 리턴타입 : 없음 => void
	 * 메소드명 : addBoard()
	 * */
	public static void addBoard(ArrayList<Board> list){
		if(list == null) {
			throw new NullPointerException("게시글 리스트가 생성되지 않았습니다.");
		}
		System.out.println("--게시글 등록--");
		//제목을 입력받아 String 객체에 저장
		System.out.print("제목 : ");
		scan.nextLine();
		String title = scan.nextLine();
		//내용을 입력받아 String 객체에 저장
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		//작성자를 입력받아 String 객체에 저장
		System.out.print("작성자 : ");
		String writer = scan.next();
		//Board클래스의 객체를 제목, 내용, 작성자를 이용하여 생성
		Board tmpBoard = new Board(title, contents, writer);
		
		//list에 추가
		list.add(tmpBoard);
	}
	/* 기능 : 주어진 번호와 일치하는 게시글을 출력하는 기능
	 * 매개변수 : 게시글 리스트, 확인할 게시글 번호 => list, num
	 * 리턴타입 : void
	 * 메소드명 : printBoard()
	 * */
	public static void printBordByNum(ArrayList<Board> list, int num) {
		//objects.equals를 이용하여 리스트에 있는 값과 매개변수의 값을
		//비교한 후, 클래스가 같으면 Board.equals()를 호출
		int index = list.indexOf(new Board(num));
		if(index != -1) {	
			//있으면 해당 게시글 출력
			Board tmpBoard = list.get(index);
			tmpBoard.print();
			
		}else {
			System.out.println("일치하는 게시글이 없습니다.");
		}
	}
	/* 기능 : 주어진 번호와 일치하는 게시글을 삭제하는 메소드
	 * 매개변수 :게시글 리스트, 번호 => list,num
	 * 리턴타입 : void
	 * 메소드명 : deleteBoardByNum
	 * */
	public static void deleteBoardByNum(ArrayList<Board> list, int num) {
		//번호와 일치하는 게시글을 찾아서 list에서 삭제하고 삭제성공을 출력
		int index = list.indexOf(new Board(num));
		if(index != -1) {
			list.remove(index);
			System.out.println("게시글이 삭제되었습니다.");
		//없으면 게시물이 없다고 출력
		}else {
			System.out.println("일치하는 게시글이 없습니다.");
		}
	}
	/* 기능 : 주어진 번호와 일치하는 게시글을 수정하는 메소드
	 * 매개변수 :게시글 리스트, 번호 => list,num
	 * 리턴타입 : void
	 * 메소드명 : modifyBoardByNum
	 * */
	public static void modifyBoardByNum(ArrayList<Board> list, int num) {
		int index = list.indexOf(new Board(num));
		if(index != -1) {
			//수정할 내용을 입력
			//수정할 제목입력
			scan.nextLine(); //앞에서의 enter처리
			System.out.print("제목 : ");
			String title = scan.nextLine();
			//수정 내용을 입력
			System.out.print("내용 : ");
			String contents = scan.nextLine();
			//게시글을 수정
			Board tmpBoard = list.get(index);
			tmpBoard.setTitle(title);
			tmpBoard.setContents(contents);
			System.out.println("--수정완료");
		}else {
			//없으면 게시글이 없다고 출력
			System.out.println("게시글이 없습니다.");
		}
		
	}
}
