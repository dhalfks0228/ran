package day10;

public class 인터페이스 {
//p.381 인터페이스
	public static void main(String[] args) {
		Tv t = new Tv();
		t.turnOn();
		t.channlUp();
		//Power p = new Power(); // 인터페이스를 이용하여 객체를 선언X
		Power p = new Tv(); // 이건 가능.
		p.turnOn();
		//System.out.println(p.power); // 접근 불가능.
	}

}
/* 인터페이스 : 추상메소드 + 상수(final)로만 이루어진 것.  => 중요
 * 추상클래스 : 추상메소드 + 일반 메소드 + 변수 + 상수(final)로 이루어진 것.
 * 인터페이스는 다중 상속 가능 (실행할 코드가 없어서 상관이 없음.), 다중 구현 가능.
 * */
interface Power{
	public abstract void turnOn();
	public abstract void turnOff();
}
interface Remotecon{
	void channlUp();
	void channlDown();
}
class Tv implements Power, Remotecon{  // 구현 클래스
	boolean power;
	@Override
	public void turnOn() {
		power = true;
		System.out.println("전원이 켜졌습니다.");
		
	}

	@Override
	public void turnOff() {
		power = false;
		System.out.println("전원이 꺼졌습니다.");
		
	}

	@Override
	public void channlUp() {
		System.out.println("channl up");
		
	}

	@Override
	public void channlDown() {
		System.out.println("channl down");
		
	}
	
}