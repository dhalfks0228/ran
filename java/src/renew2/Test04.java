package renew2;

public class Test04 {

	public static void main(String[] args) {
		Point3D pt1 = new Point3D(0,0,0);
		
		pt1.print();
		pt1.move(3, 3);
		pt1.print();

	}

}
/* 상속
 * - 부모클래스의 멤버 메소드와 변수를 물려받는 것
 * - 재사용
 * - 라이브러리에서 제공하는 클래스들을 물려받아 해당 메소드와 멤버 변수들을 편하게 사용하기 위해서
 * - 클래스상속에서 부모클래스는 1개만 가능
 * 	- A클래스에 a라는 기능, B클래스에 a라는 기능이 있을 때
 * 	  클래스 C가 A, B 클래스 모두 상속 가능하다면 a기능 호출 시 충돌.
 * - 인터페이스 상속에서 부모 인터페이스는 여러개 가능
 * 
 * 오버라이딩
 * - 부모 클래스에 있는 메소드를 재정의하는 것.
 * - 부모 클래스에 있는 메소드 형태가 같아야 한다.(리턴타입, 메소드명, 매개변수)
 * - 접근 제한자는 범위가 좁아지면 안된다.(부모 접근제한자 <= 자식 접근 제한자)*/
class Point3D extends Point{
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	//부모 클래스의 move와 매개변수 개수가 달라 오버로딩 가능.
	public void move(int x, int y, int z) {
		move(x,y); 
		this.z = z;
		
	}
	public void move(Point3D pt) {
		// x와 y는 부모의 private 변수이기 때문에 get으로 접근
		move(pt.getX(), pt.getY(), pt.z);
	}
	@Override
	public void print() {
		System.out.println("(" + getX() + "," + getY() + "," + z +")");
	}
	
	public Point3D() {}
	public Point3D(int x, int y, int z) {
		// 부모 클래스의 생성자 가져옴.
		super(x,y);
		this.z = z;
	}
	public Point3D(Point3D pt) {
		this(pt.getX(), pt.getY(), pt.z);
	}
}