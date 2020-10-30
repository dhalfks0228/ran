package day10;

public class 클래스6 {
	
	public static void main(String[] args) {
		GreenComputerStudent [] std = new GreenComputerStudent[10];
		std[0] = new GreenComputerStudent("홍길동", "2002-05-01", 19, "010-1234-4567", "청주");
		std[0].printInfo();
		std[0].printCompany();
		std[0].insertCourse("디지털컨버전스 JAVA 양성과정", "2020-10-19 ~ 202104-01");
		std[0].printCourse();
		std[1] = new GreenComputerStudent("임꺽정", "의정부");
		std[2] = new GreenComputerStudent("유관순", "청주");
		std[3] = new GreenComputerStudent("이순신", "의정부");
		// 학생 이름 검색
		String searchName = "이순신";  // 이순신 검색
		for(GreenComputerStudent tmp : std) {	// std에 입력된 값 하나를 tmp에 넣어 비교
			if(tmp != null && tmp.getName().equals(searchName)) { // 문자열은 ==로 비교할 수 없음(참조변수여서). equals로 비교
				System.out.println("-------------------------");  // 참조 변수를 ==로 비교하면 주소가 일치하면 참, 아니면 거짓으로 판별
				tmp.printInfo();								  // 안에 있는 값이 같더라도 주소가 다르면 거짓으로 판별. 
				System.out.println("-------------------------");  // 하나의 객체를 두개의 참조변수가 공유할 때만 참.
			}
		}
		String searchBranch = "청주";  // 청주지점 검색
		for(GreenComputerStudent tmp : std) {   //std에 입력된 값 하나를 tmp에 넣어 비교
			if(tmp != null && tmp.getBranch().equals(searchBranch)) { // 문자열은 ==로 비교할 수 없음(참조변수여서). equals로 비교
				System.out.println("-------------------------");  // 참조 변수를 ==로 비교하면 주소가 일치하면 참, 아니면 거짓으로 판별
				tmp.printInfo();								  // 안에 있는 값이 같더라도 주소가 다르면 거짓으로 판별. 
				System.out.println("-------------------------");  // 하나의 객체를 두개의 참조변수가 공유할 때만 참.
			}
		}
	}

}
/* - 학생 기본 정보 : 학생이름, 생년월일, 나이, 전화번호
 * - 학원 정보 : 학원이름, 지점
 * - 학생 수강 정보 : 수강과목, 기간
 * - 기능들
 * - 학생 기본 정보 출력
 * - 학생의 학원 정보 출력 기능
 * - 학생 수강 정보 출력 기능
 * - 학생 수강 정보 추가 기능
 * - 생성자
 * */
class GreenComputerStudent{
	private String name;
	private String birthday;
	private int age;
	private String phoneNumber;
	final static public String company = "그린 컴퓨터 아트 학원";
	private String branch; //지점
	private String []course; //수강과목 : 한명이 여러 개 수강할 수 있음.
	private String []period; //수강기간 : 각 과목마다 기간이 다름.
	private int courseCount;
	
	// 생성자
	public GreenComputerStudent(String name, String birthday, int age, String phoneNumber, String branch) {
		this.name = name;
		this.birthday = birthday;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.branch = branch;
		this.course = new String[10];
		this.period = new String[10];
	}
	public GreenComputerStudent(String name, String branch) { // 이름 정보만 있는 경우 생성자
		this(name, null, 0, null, branch); // this() 생성자를 의미
	}
	
	// 메서드
	public void printInfo() {    	// 학생 기본 정보 출력
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phoneNumber);
		System.out.println("나이 : " + age);
		System.out.println("생일 : " + birthday);
	}
	
	public void printCompany() { 	// 학생의 학원 정보 출력
		System.out.println("학원명 : " + company);
		System.out.println("지점명 : " + branch);
	}
	
	public void printCourse() {		//학생의 수강 정보 출력
		if(course == null || course.length == 0 || courseCount == 0) {
			System.out.println("수강 이력이 없습니다. ");
			return;  // 실행 되면 결과값 리턴. 이후 실행 안됨.
		}
		for(int i = 0; i<courseCount; i++){
			System.out.println("과정 : "+course[i]);
			System.out.println("기간 : "+period[i]);
		}
	}
	
	public void insertCourse(String course, String period) { // 과목/기간 추가
		this.course[courseCount] = course;
		this.period[courseCount] = period;
		courseCount++;
	}
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
	
	
}
