package day1;

public class 변수 {

	public static void main(String[] args) {
		// 주석 : 코드에 영향을 미치지 않는 문구, 설명을 위해 사용 
		//는 한줄 주석 //가 나온 지점부터 주석
		/*여러줄 
		 * 주석입니다.*/
		//변수선언 방법
		//변수타입 변수명;
		char ch;//문자형 변수 ch를 선언,  자바에서는 대부분 줄 끝에 ; 처리를 한다. 문장의 끝 의미.
		int num1;
		long num2;
		float num3;// 용량을 아껴야 할 경우.
		double num4; //일반적으로 더블을 씀 더 정확하고, 범위가 넓음. 
		boolean boo1; //논리형
		//노란 밑줄 : 경고, 한번도 사용하지 않은 변수
		//빨간 밑줄 : 오류
		int appleCount;//변수명은 의미 있게
		int applecount;//대소문자 구별한다.
		// int ch; // 중복선언 불가능
		//변수 선언 및 초기화 방법
		//변수타입 변수명 = 값;
		//문자는 한 글자를 의미, 문자는 앞뒤로 ''를 붙인다.
		char cha = 'A';
		char cha2 ='1';
		char cha3 = '한';
		char cha4 = '\''; // '를 표시.  \' 의미 있는 문자를 쓸 경우 역슬레시 하고 표시
		
		int numb1 = 10; //일반적으로 사용  10진수 10을 저장
		int numb2 = 010; // 8진수 10을 저장 => 10진수 8
		int numb3 = 0x10; // 16진수 10을 저장 => 10진수 16
		// int numb4 = 123456789012; //숫자의 범위가 넘어가면 빨간밑줄.
		
		//기본 정수값은 int형으로 인식. 
		//long은 접미사 L을 쓸 수 있는데, 큰 수를 다룰 때에는 꼭 써야함. 
		//long numb5 = 123456789012; //숫자이지만 int로 인식해서 빨간밑줄, 
		long numb5 = 123456789012L; // 마지막에 L을 적어야 long형으로 인식
		
		//기본 실수값은 double형으로 인식됨.
		//float형의 실수값은 접미사 F를 꼭 붙인다. 대/소문자 상관X
		float numb6 = 1.234f;
		
		double numb7 = 1.23456;
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		
		//변수 선언후 초기화 2
		//변수타입 변수명 = 변수명;
		int kor1 = 100;
		int kor2 = kor1;
		
		// 여러 변수를 한번에 선언하는 방법
		// 단, 같은 변수타입만 가능
		//정수형 변수 a는 10을, b는 20, c는 30을 저장하도록 선언
		int a = 10, b = 20, c = 30;
		int d, e = 20;
			
		
				
		
		
		
		
	}

}
