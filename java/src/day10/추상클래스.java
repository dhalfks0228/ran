package day10;

public class 추상클래스 {

	public static void main(String[] args) {
		// 추상 클래스를 이용하여 객체를 생성할 수 없다.
		//Animal2 a = new Animal2();  // 생성할 클래스가 추상 클래스 X
		Animal2 b = new Dog2();  
		b.howl();
	}

}
// 추상메소드를 포함하는 클래스를 추상클래스라 한다.
abstract class Animal2{  // 추상 클래스
	public String name;
	public String category;
	public void info() {
		System.out.println("---------------------");
		System.out.println("이름 : " + name);
		System.out.println("분류 : " + category);
		System.out.println("---------------------");
	}
	// 구현부가 없는 메소드를 추상 메소드라 한다.
	public abstract void howl(); // 추상메소드는 ;으로 끝난다.
}
// 추상 클래스를 상속받은 클래스가 추상 클래스가 아니면
// 부모의 추상 메소드를 반드시 구현해야 한다.(오버라이딩)
class Dog2 extends Animal2{

	@Override
	public void howl() {
		System.out.println("멍멍");
		
		
	}
	
}