package day13;

/* 과목 클래스를 생성하세요. 단, 클래스는 새로 만들기를 이용하여 만드세요.
 * - 과목 클래스의 필요한 멤버 변수 / 메소드를 생성하세요. 
 * - 과목 클래스 : 한 과목의 정보를 나타내는 클래스
 * - 멤버 변수   : 과목코드, 과목명, 학점, 시수, 교수명, 수강년도, 학기, 분류, 수업시간
 * - 멤버 메소드 : getter/setter, toString()
 * - 생성자
 * */	

public class Subject {
	private String subCode; //과목코드
	private String subName; //과목명
	private double credit; //이수학점
	private int time; //이수시간
	private String professor; //담당교수
	private int subYear;//해당년도
	private String semester;//학기
	private String subCategory;//분류
	private String subScheduler; //수업시간
	
	
	
	
	// 과목 클래스 출력
	public void subjectPrint() { 
		System.out.println("과목코드 : " + subCode);
		System.out.println("과   목 : " + subName);
		System.out.println("이수학점 : " + credit + "점");
		System.out.println("이수시간 : " + time + "시간");
		System.out.println("담당교수 : " + professor + "교수");
		System.out.println("수강년도 : " + subYear);
		System.out.println("수강학기 : " + semester);
		System.out.println("수강분류 : " + subCategory);
		System.out.println("수업시간 : " + subScheduler);
		System.out.println("----------------------------------");
		
	}
	
	
	// 과목 클래스 출력 toString() 오버라이딩
	@Override
	public String toString() {
		return "Subject [과목코드=" + subCode + ", 과목명=" + subName + ", 이수학점=" + credit + ", 이수시간=" + time
				+ ", 담당교수=" + professor + ", 수강년도=" + subYear + ", 수강학기=" + semester + ", 수강분류="
				+ subCategory + ", 수업시간=" + subScheduler + "]";
	}



	//생성자
	public Subject(String subCode, String subName, double credit, int time, String professor, int subYear,
			String semester, String subcategory, String subScheduler) {
		
		this.subCode = subCode;
		this.subName = subName;
		this.credit = credit;
		this.time = time;
		this.professor = professor;
		this.subYear = subYear;
		this.semester = semester;
		this.subCategory = subcategory;
		this.subScheduler = subScheduler;
	}

	public Subject(String sTitle) {
		subName = sTitle;
		
	}


	//getter/setter
	public String getSubCode() {
		return subCode;
	}


	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}


	public String getSubName() {
		return subName;
	}


	public void setSubName(String subName) {
		this.subName = subName;
	}


	public double getCredit() {
		return credit;
	}


	public void setCredit(double credit) {
		this.credit = credit;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public String getProfessor() {
		return professor;
	}


	public void setProfessor(String professor) {
		this.professor = professor;
	}


	public int getSubYear() {
		return subYear;
	}


	public void setSubYear(int subYear) {
		this.subYear = subYear;
	}


	public String getSemester() {
		return semester;
	}


	public void setSemester(String semester) {
		this.semester = semester;
	}


	public String getSubCategory() {
		return subCategory;
	}


	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}


	public String getSubScheduler() {
		return subScheduler;
	}


	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}
	
	
}
