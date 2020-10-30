package day10;

public class 상속2 {
	
	/* 오버라이딩 : 부모 클래스에게 불려받은 메소드를 재정의하는 것.
	 * - 부모 클래스의 메소드와 일치해야 한다.
	 * - 접근제한자는 같거나 넓은 접근제한자를 써야한다. 
	 * 	=> 범위를 축소할 수 없다. 
	 * */

	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.infor();
		t1.howl();
		Dog d1 = new Dog();
		d1.infor();
		d1.howl();

	}

}
class Animal {
	private String name;
	private String category;
	public void infor() {
		System.out.println("----------------------");
		System.out.println("이름 : "+name);
		System.out.println("분류 : "+category);
		System.out.println("----------------------");
	}
	public void howl() {
		System.out.println("울음소리");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Animal(String name, String category) { 
		super();
		this.name = name;
		this.category = category;
	}
	public Animal() { } // 기본생성자
	
}
class Tiger extends Animal{
	public Tiger() {
		/* super는 부모를 가르키는 참조변수, super()는 부모 클래스의 생성자*/
		super("호랑이","고양이과");  
//		setCategory("고양이과");  // 접근 가능한 setter로 접근.
//		setName("호랑이");
//		category = "고양이과";    //private이라 접근 불가
//		name = "호랑이";
	}
	@Override   
	public void howl() {
		System.out.println("울음소리 : 어흥");
	}
	
	
}
class Dog extends Animal{
	public Dog() {
		super("개","개과");
	}
	@Override
	public void howl() {
		super.howl();  // 부모 클래스의 값을 먼저 호출.
		System.out.println("울음소리 : 멍멍"); // 변경.
	}
}