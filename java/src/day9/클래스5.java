package day9;

import day8.Card;

public class 클래스5 {
	//final int STUDENT_COUNT=10;
	public static void main(String[] args) {
		/* final은 클래스, 변수, 멤버 메소드에 붙일 수 있다.
		 * final : 수정할 수 없다. (어떤 수에 이름을 붙이고 싶을 때 사용)
		 * final 멤버 변수 : 상수
		 * final 멤버 메소드 : 메소드 오버라이딩을 할 수 없다.
		 * final 클래스 : 상속할 수 없다. 부모 클래스가 될수 없다.
		 * */
		//클래스5 a = new 클래스5();
		//STDUENT_COUNT는 static이 없으면 객체 멤버변수이므로 클래스 멤버 메소드인 main에서 사용할 수 없다. 
		//System.out.println(a.STUDENT_COUNT); //static 변수가 아니라서. 
		//final int STUDENT_COUNT = 10;  // 지역변수
		// STUDENT_COUNT = 20; // 수정할 수 없음.
		//Card c1 = new Card();
		//final Card c2 = c1;
		// c2=null; // 오류
		//System.out.println(Math.PI);
		
		GreenComputerStudent std = new GreenComputerStudent();
		std.printone("청주 ", "홍길동", "JAVA", "010-2256-7894");
		//for (int i = 0; i<std.length; i++) {
			
		//}
		
	}

}
/* GreenComputerStrudent 클래스
 * 멤버변수 : 지점(string), 이름(string), 반(string), 전화번호(string)
 * 메소드 : 
 * */
class GreenComputerStudent{
	
	
	private String gigum;
	private String name;
	private String group;
	private String phone;
	public String getGigum() {
		return gigum;
	}
	public void setGigum(String gigum) {
		this.gigum = gigum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void printone(String gigum, String name, String group, String phone) {
		System.out.println("지점 : " + gigum);
		System.out.println("이름 : " + name);
		System.out.println("반 : " + group);
		System.out.println("전화번호 : " + phone);
	}
	
	
	
	
	
//	public void city(String a[]) {
//		for(int i=0; i<=a.length;i++) {
//			a[i] = gigum;
//		}
//	}
//	public void name(String b[]) {
//		for(int i=0; i<=b.length;i++) {
//			b[i] = name;
//		}
//	}
	
}