package day13;

import java.util.Scanner;

public class StudentManager implements Program { 
	private Student[] std = new Student[10];
	private int studentCount; // 현재 등록한 학생 카운트	
	
	
	@Override
	public void printStudent() { 
		for(int i =0; i<studentCount;i++) {
			printStudentOne(std[i]); // 아래 구현한 메소드 호출
		}

	}

	@Override
	public void insertStudent(Scanner scan) {
		//1. 스케너로 학생 1명의 정보 입력받아 객체에 저장
		//학번, 이름, 주민번호, 학부, 학과, 수강과목s, 현재 수강학기
		
		System.out.println("-----------------");
		System.out.println("학생정보를 입력하세요.");
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("주민번호 : ");
		String rNum = scan.next();
		System.out.print("학번 : ");
		String sNum = scan.next();
		System.out.print("학부 : ");
		String faculty = scan.next();
		System.out.print("학과 : ");
		String major = scan.next();
		System.out.print("학기 : ");
		int term = scan.nextInt();
		System.out.println("-----------------");
		Student s = new Student(name, rNum, sNum, faculty, major, term); // 한명의 객체 생성
		
		//2. 배열에 추가하기
		if(std.length == studentCount) { // 배열이 다 찼다면...
			Student [] tmp = new Student[studentCount+10]; //전체 배열 개수 + 10개인 새배열 추가
			System.arraycopy(std, 0, tmp, 0, std.length);
			std = tmp;
		}
		
		std[studentCount] = s;
		studentCount++;
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 검색할 이름을 입력받아 
		System.out.println("---------------------");
		System.out.print("검색할 이름 입력 : ");
		String tmpName = scan.next(); //띄어쓰기 허용 X 
				
		//std 배열에서 equals로 검색 후 학생정보(std) 출력
		
		for(int i=0; i<studentCount;i++) {
			if(tmpName.equals(std[i].getName())) {
				printStudentOne(std[i]);
			}
		}
				
	}
	//홍길동 학생이 대학수학을 수강신청 했을 때 동작해야하는 메소드
	@Override
	public void registerSubject(Scanner scan) {
		//Subject sub[] = new Subject[10];
		int index=-1; // 학생이 있는지 없는지 학생의 위치
		// 수강신청자의 학생정보(학번)을 입력 받고

		System.out.println("-----------------");
		System.out.print("수강신청자 학번을 입력 : ");
		String sNum = scan.next();
		
		//학생 정보를 검색하여 학생이 있는지 확인
		for(int i=0; i<studentCount;i++) {
			// std[i].getStudentNum().equals(sNum) 같은 의미
			if(sNum.equals(std[i].getStudentNum())) {  
				index = i;
			 break;
			}
		}
		if(index==-1) {
			System.out.println("존재하지 않는 학생입니다.");
			return;
		}
		//수강할 과목을 입력받아
		System.out.print("과목명 : ");
		String sTitle = scan.next();
//		이후의 과목코드, 담당교수등과 같은 나머지 정보도 Scanner를 이용하여 입력받아야 하나, 
//		테스트시 번거로움이 있어서 과목명만 입력받아 추가하도록 작업.
//		System.out.print("과목코드 : ");
//		String subCode = scan.next();
//		System.out.print("과목명 : ");
//		String subName = scan.next();
//		System.out.print("이수학점 : ");
//		String credit = scan.next();
//		System.out.print("이수시간 : ");
//		String time = scan.next();
//		System.out.print("담당교수 : ");
//		String professor = scan.next();
//		System.out.print("수강년도 : ");
//		String ssubYear = scan.next();
//		System.out.print("수강학기 : ");
//		String semester = scan.next();
//		System.out.print("수강분류 : ");
//		String subCategory = scan.next();
//		System.out.print("수업시간 : ");
//		String subScheduler = scan.next();
//		Subject subject = new Subject(subCode, sTitle, credit, time, professor, subYear, semester, subcategory, subScheduler);
		
		// 새로 subject의 생성자를 추가 후 insertSubject메소드 호출
		Subject subject = new Subject(sTitle);
		std[index].insertSubject(subject);

	}
	

	@Override
	public void deleteSubject(Scanner scan) {
		int index=-1; // 학생이 있는지 없는지 학생의 위치
		// 수강철회자의 학생정보(학번)을 입력 받고

		System.out.println("-----------------");
		System.out.print("수강철회자 학번을 입력 : ");
		String sNum = scan.next();
				
		//학생 정보를 검색하여 학생이 있는지 확인
		for(int i=0; i<studentCount;i++) {
			if(sNum.equals(std[i].getStudentNum())) {  // std[i].getStudentNum().equals(sNum) 같은 의미
				index = i;
			 break;
			}
		}
		if(index==-1) {//학생이 없다면..
			System.out.println("존재하지 않는 학생입니다.");
			return;
		}
		
		//수강철회할 과목을 입력받아 deleteSubject메소드 호출
		System.out.print("철회 과목명 : ");
		String sTitle = scan.next();
		std[index].deleteSubject(sTitle);

	}
	public void printMenu() {
		System.out.println("------메뉴-----");
		System.out.println("1.학생등록");
		System.out.println("2.학생확인");
		System.out.println("3.학생검색");
		System.out.println("4.수강신청");
		System.out.println("5.수강철회");
		System.out.println("6.종료");
		System.out.println("--------------");
		System.out.print("메뉴선택 : ");
	}
	public void printAlert() {
		System.out.println("--------------");
		System.out.println("잘못된 메뉴입니다.");
		System.out.println("--------------");
	}
	public void printExit() {
		System.out.println("--------------");
		System.out.println("프로그램 종료");
		System.out.println("--------------");
	}
	// 내부적으로 처리할 때 private으로 메소드를 구현
	private void printStudentOne(Student s) {
		System.out.println("-----학생정보-----");
		System.out.println(s);
		System.out.println("----------------");
		System.out.println("-----수강정보-----");
		s.print();
		System.out.println("----------------");
	}
	
	
}
