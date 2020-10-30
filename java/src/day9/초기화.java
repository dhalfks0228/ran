package day9;

public class 초기화 {

	public static void main(String[] args) {
		//초기화 : 변수에 값을 처음으로 저장하는 것.
		//위치는 상관 없음.
		//지역 변수는 자동으로 초기화 되지 않음.
		int num=0;
		Test t = new Test();
		num = t.num1 + t.num2 + t.num3 + t.num4;
		System.out.println(t.num1);
		System.out.println(t.num2);
		System.out.println(t.num3);
		System.out.println(t.num4);
		System.out.println(num);
		
	}

}
class Test{
	//p.304 초기화 순서 : 기본값 -> 명시적 -> 초기화블럭 -> 생성자
	//1. 명시적 초기화 : 멤버변수가 선언과 동시에 초기화 하는 방법
	int num1 = 10; 
	int num2 = 10;
	int num3 = 10;
	int num4;
	{
		//3. 초기화 블럭 : 초기화 블럭에서 멤버 변수를 초기화
		num3 = 30;
		num2 = 30;
	}
	
	//2. 생성자 : 생성자를 이용하여 멤버 변수를 초기화
	public Test() {
		num2 = 20;
	}
}