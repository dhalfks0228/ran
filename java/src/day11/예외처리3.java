package day11;

public class 예외처리3 {

	public static void main(String[] args) {
		/* 예외가 발생하면 발생한 시점부터 메소드 종료.
		 * p.417 try~catch문 : 예외가 발생했을 때, 프로그램이 중단되지 않고
		 * 						이어서 처리할 수 있게 하는 방법
		 * try문에서 예외가 발생했을 때 발생한 예외에 맞는 클래스와 일치하는
		 * catch문을 찾아간다.
		 * try{
		 * 예외가 발생할 수 있는 실행문;
		 * } catch(예외클래스명1 객체){
		 * 		처리문;
		 * }
		 * */
		double res = 0;
		try {
			
			//res = 1/0;
			int []arr = new int[5];
			arr[5] = 10;
		}catch(ArithmeticException | NullPointerException e) {  // 멀티 catch블럭
			System.out.println("ArithmeticException 또는 NullPointerException");
		}catch(ClassCastException e) {
			System.out.println("ClassCastException");
		}
//		catch(NullPointerException e) {
//			System.out.println("NullPointerException");
//		}
		catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(Exception e) { // 모든 예외처리의 부모이기 때문에 처음에 Exception이 오면 에러가 남.
			System.out.println("Exception");
		}
		System.out.println("hello");

	}

}
