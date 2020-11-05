package day13;
/* 학생 클래스를 생성하세요. 단, 클래스는 새로 만들기를 이용하여 만드세요.
 * - 과목 클래스의 필요한 멤버 변수 / 메소드를 생성하세요. 
 * - 과목 클래스 : 한 학생의 정보를 나타내는 클래스
 * - 멤버 변수   : 학번, 이름, 주민번호, 학부, 학과, 수강과목s, 현재 수강학기
 * - 멤버 메소드 
 * getter/setter 
 * stdPrint() 
 * 수강과목 추가
 * 수강과목 삭제
 * 수강과목 복사(private) : 수강과목 추가시 배열이 다 차있으면 배열의 크기를 늘림.
 * equals():오버라이딩.
 * - 생성자
 * */	
public class Student {
	private String name; //이름
	private String residentNum; //주민번호
	private String studentNum; // 학번
	private String faculty; //학부
	private String majer; //학과
	private Subject[] subjectList; // 과목배열의 List  
	private int term; //학기
	private int subNameCount;
	
	
	//stdPrint() 학생기본정보 출력
	public void stdPrint() {
		System.out.println("학생명 : " + name);
		System.out.println("주민번호 : " + residentNum);
		System.out.println("학번 : " + studentNum);
		System.out.println("학부(학과) : " + faculty + "(" + majer +")");
		System.out.println("학기 : " + term);
	}
	
	
	
	@Override
	public String toString() {
		return "Student [이름 : " + name + "\n 주민번호 : " + residentNum + "\n 학번 : " + studentNum + "\n 학부 : "
				+ faculty + "\n 학과 : " + majer + "\n 학기 : " + term + "\n 수강과목수 : " + subNameCount + "]";
	}



	// 수강과목 추가
	public void insertSubject(Subject subName) { // 매개변수 => Subject의 과목명
		// 현재 수강한 과목의 개수를 모를때
		/*for(int i = 0; i<subjectList.length;i++) { 
			if(subjectList[i]==null) { // 배열이 비어있다면 
				subjectList[i] = subName; // 과목을 추가
				break;  // 과목 추가하고 빠져 나가기.
			}
		}*/
		//과목을 추가할 때, 과목의 개수를 subNameCount변수로 카운팅하면 작업이 편리해짐.
		//배열이 꽉찬경우.
		
		if(subNameCount == subjectList.length) {
			//학생 배열이 차면 배열을 늘려주고, 복사하는 작업.
			Subject [] tmp = new Subject[subNameCount+10];
			System.arraycopy(subjectList,0 , tmp, 0, subjectList.length);
			subjectList = tmp;
		}
		 //초기 subNameCount = 0 0번지에 과목명 삽입. 카운드 증가.
		subjectList[subNameCount] = subName;
		subNameCount++;
	}
	
	
	//수강과목 삭제
	public void deleteSubject(String subName) {
		int index = -1; // 찾는 과목의 위치
		if(subName == null) { //과목이 비었으면(추가된 과목이 없다면) 리턴
			return;
		}
		for(int i=0; i<subNameCount; i++) {
			if(subName.equals(subjectList[i].getSubName())) {
				index = i; //일치하는 과목명의 위치를 index로 반환
				break;
			}
		}
		if(index==-1)// 찾고자 하는 과목이 없다면, 리턴
			return;
		for(int i = index; i<=subNameCount-2;i++) { //입력한 과목의 개수-1 (번지) -2(삭제되는 과목번지)
			subjectList[i] = subjectList[i+1]; // 뒤의 과목명을 앞의 과목명 자리로 덮어씀.
		}
		subjectList[subNameCount-1] = null; // 복사후 남은 자리 null로 반환
		subNameCount--;
	}
	
	public void print() {
		if(subNameCount==0)
			System.out.println("--추가한 과목이 없습니다.--");
		for(int i =0; i<subNameCount;i++) {
			System.out.println(subjectList[i]); //toString으로 출력
//			subjectList[i].subjectPrint(); // subjectList의 값을 subjectPrint메소드로 출력.
		}
	}
	
	
	
	
	//생성자
	public Student(String name, String residentNum, String studentNum, String faculty, String majer, int term) {
		super();
		this.name = name;
		this.residentNum = residentNum;
		this.studentNum = studentNum;
		this.faculty = faculty;
		this.majer = majer;
		this.term = term;
		subjectList = new Subject[4];
	}

	//getter/setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getResidentNum() {
		return residentNum;
	}


	public void setResidentNum(String residentNum) {
		this.residentNum = residentNum;
	}


	public String getStudentNum() {
		return studentNum;
	}


	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}


	public String getFaculty() {
		return faculty;
	}


	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	public String getMajer() {
		return majer;
	}


	public void setMajer(String majer) {
		this.majer = majer;
	}


	public Subject[] getSubjectList() {
		return subjectList;
	}


	public void setSubjectList(Subject[] subjectList) {
		this.subjectList = subjectList;
	}


	public int getTerm() {
		return term;
	}


	public void setTerm(int term) {
		this.term = term;
	}


	public int getSubNameCount() {
		return subNameCount;
	}


	public void setSubNameCount(int subNameCount) {
		this.subNameCount = subNameCount;
	}
	
	
}
