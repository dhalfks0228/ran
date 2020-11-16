package day14;

public class Lottocontrol {

		// menu등 기본 컨트롤 부분

	public void printMenu() {
		System.out.println("-------------메뉴------------");
		System.out.println("1.로또 자동 번호 발생");
		System.out.println("2.로또 수동 번호 발생");
		System.out.println("3.역대 당첨 번호 확인");
		System.out.println("4.당첨확인");
		System.out.println("5.종료");
		System.out.println("----------------------------");
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
}
