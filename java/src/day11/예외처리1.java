package day11;

public class 예외처리1 {

	public static void main(String[] args) {
		
		try {
		System.out.println(calc(4,'+',0));
		//System.out.println(calc(4,'?',7));
		System.out.println(calc(4,'-',7));
		System.out.println(calc(4,'*',7));
		System.out.println(calc(4,'/',0));
		System.out.println(calc(4,'%',0));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("수고하셨어요. ^^");
		}
	}
	
	/* 기능 : 두 정수와 산술 연산자가 주어지면 주어진 산술연산 결과를 알려주는 메소드
	 * 매개변수 : 두 정수와 연산자=> int num1, int num2, char op
	 * 리턴타입 : double res
	 * 메소드명 : calc
	 * calc 메소드에 static을 붙이는 이유
	 * - 안 붙이면 객체 멤버 메소드가 되는데, 객체 멤버 메소드는 클래스 멤버 메소드인
	 *   main에서 호출할 수 없기 때문에 static을 붙여서 클래스 멤버 메소드로 만들어야 한다.
	 * */
	/* 메소드에서 throw를 하면 메소드 선언부에 throws를 이용하여 발생할 수 있는 예외를 적어주어야 한다.
	 * 단, RuntimeException을 상속받은 클래스는 제외.
	 * */
	
	public static double calc(int num1, char op, int num2) { //RuntimeException은 throws 생략가능
		double res;
		if((op == '/' || op=='%')&& num2 ==0){ //예외처리를 미리 앞에서 해주는게 깔끔하다.
			throw new RuntimeException("Num2는 0이 될 수 없습니다.");
		}
		switch(op) {
		case '+' : 
			res = num1 + num2; break;
		case '-' :
			res = num1 - num2; break;
		case '*' :
			res = num1 * num2; break;
		case '/' :
			res = (double)num1 / num2; break;
		case '%' :
			res = num1 % num2; break;	
		default : throw new RuntimeException(op+"는 산술연산자가 아닙니다.");
		}
		return res;
	}
}
