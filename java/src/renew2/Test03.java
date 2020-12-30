package renew2;

public class Test03 {

	public static void main(String[] args) {
		/* 접근제한자
		 * private : 나
		 * default : 나 + 같은 패키지
		 * protected : 나 + 같은 패키지 + 자식
		 * public : 모두
		 * 
		 * - private : 주로 멤버 변수, 해당 클래스 내부에서만 사용하는 메소드
		 * - protected : 외부에서는 호출할 수 없으나 자식들은 호출할 수 있게 하는 경우
		 * - public : 주로 멤버 메소드, 클래스에 public을 붙이려면 클래스명과 클래스가 있는 파일명이 같은 경우.
		 * - */
		// 클래스명 객체명 = new 생성자();
		Point pt1 = new Point();
		//다른 클래스에서 정의된 메소드 사용 
		//객체명.메소드
		pt1.move(1, 1);
		pt1.print();
		
		move(pt1, 2, 2);
		pt1.print();
		
		
		
	}
	/* 현재 좌표에서 새로운 좌표 x,y로 이동시키는 메소드*/
	public static void move(Point pt, int x, int y) {
		if(pt == null) {
			return;
		}
		pt.move(x, y);
	}

}
class Point{
	//맴버변수 : 정보
	private int x,y;
	
	//맴버메소드 : 기능
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point(Point pt) {
		x = pt.x;
		y = pt.y;
	}
	/* 현재 좌표에서 새로운 좌표 x,y로 이동시키는 메소드*/
	// 위 생성자와 같은 코드 이지만 생성자는 마음대로 호출할 수 없어서 따로 메소드를 만들어야 함.
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/* 오버로딩 
	 * - 동일한 이름을 가진 메소드가 2개 이상인 경우
	 * - 다음 중 한가지 조건을 만족해야 한다.
	 * - 매개변수의 갯수가 다른 경우
	 * - 매개변수의 타입이 다른 경우
	 * 현재 좌표에서 새로운 좌표 pt(Point class의 객체)로 이동시키는 메소드*/
	// 메소드 오버로딩
	public void move(Point pt) {
		move(pt.x, pt.y);
//		x = pt.x; 이것도 가능.
//		y = pt.y;
	}
	
	public void print() {
		System.out.println("(" + x + "," + y + ")");
	}
}