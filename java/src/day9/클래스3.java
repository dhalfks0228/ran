package day9;

import day8.Card;  // day8 패키지에서 카드 클래스를 가져와라. 

public class 클래스3 {

	public static void main(String[] args) {
		Card c = new Card();
		c.print();
		// CardPack클래스는 클래스2.java에서 접근제한자가 default라서 다른 패키지에서 사용불가. 
		//CardPack cp = new CardPack();  
		
		// c2는 새로운 객체를 생성하여 연결하고, c3는 c2와 연결된 객체를 공유한다.
//		Card2 c2 = new Card2();
//		Card2 c3 = c2;
		
		//복사생성자
		Card2 c2 = new Card2('♠', 3);
		c2.setNum(10);
		Card2 c3 = new Card2(c2); //복사 생성자로 초기화하여 새로운 객체를 생성
		System.out.println(c2.getNum()+","+c3.getNum());
		c2.setNum(11);
		System.out.println(c2.getNum()+","+c3.getNum());
		Card2 c4 = new Card2();
		
	}

}
/* 클래스
 * - 멤버변수
 * - 멤버 메서드 
 * - 생성자 : 멤버 변수의 초기화 
 * 다음과 같은 항목들이 있을 때 멤버 변수와 멤버 메소드를 구분하세요.
 * 자동차 클래스
 * - 바퀴의 수, 전원, 시동켜기, 시동끄기, 전진, 후진, 기어, 와이퍼, 와이퍼켜기, 와이퍼끄기
 *   속도, 엑셀밟기, 브레이크 밟기
 * - 멤버 변수 : 바퀴의 수, 전원(상태), 기어, 와이퍼, 속도 (속성, 정보)
 * - 멤버 메서드 : 시동켜기/끄기, 전진/후진, 와이퍼켜기/끄기, 엑셀밟기, 브레이크 밟기
 * */
 class Card2{
	 private int num;
	 private char shape;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		// this를 꼭 사용해야 하는 경우
		// 매개변수의 이름과 멤버변수의 이름이 같은 경우. 
		this.num = num; //
	}
	public char getShape() {
		return shape;
	}
	public void setShape(char shape) {
		this.shape = shape;
	}
	/* 클래스의 멤버 메소드는 내가 호출하고 싶을 때 호출할 수 있다.
	 * 클래스의 생성자는 new 연산자를 통해 객체를 만들때만 자동으로 호출된다. 
	 * */
	//기본생성자
	public Card2() {
		
		num = 1;
	}
	//생성자 오버로딩
	public Card2(char shape, int num) {
		this.shape= shape ;
		this.num = num;
	}
		
	//복사 생성자(생성자 오버로딩)
	//public 클래스명A(클래스명A 객체명) {
	public Card2(Card2 card) {
		this.shape = card.shape;
		this.num = card.num;
	}
	//생성자가 하나라도 없으면 기본 생성자가 만들어 진다. 
	public Card2(int num, char shape) {
		super();
		this.num = num;
		this.shape = shape;
	}
 }