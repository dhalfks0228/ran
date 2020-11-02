package day11;

public class 예외처리7 {
	public static void main(String[] args) {
		method1();
		method2();
	}
	public static void method1() {
		try {
			System.out.println("method1이 실행중입니다.");
			return;
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("method1 종료");
	}
	public static void method2() {
		try {
			System.out.println("method2가 실행중입니다.");
			return;
		}catch(Exception e){
			e.printStackTrace();
		}finally {  //예외 발생 여부와 상관없이 무조건 실행되어야 하는 코드를 실행시킬 목적
			System.out.println("method2 종료"); 
			
		}
	}
}
