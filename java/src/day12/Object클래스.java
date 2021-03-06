package day12;

public class Object클래스 {

	public static void main(String[] args) {
		/* Object클래스에서 제공하는 메소드
		 * 1. equals()
		 * - 기본적으로 주소를 비교하기 때문에 하나의 객체를 공유할 때만 같다라고 인식함.
		 * - 일반적으로 클래스가 같은지 비교를 자주하는 경우 equals를 오버라이딩한다.
		 * 2. hashCode()
		 * - 해시코드 값을 이용하여 그룹화하여 검색이 쉽도록 한다.
		 * 3. toString()
		 * - system.out.println에 객체를 넣어주면 자동으로 객체.toString()이 호출되어 문자열이 출력됨.
		 * - 이 때 원하는 정보를 출력하기 위해서는 오버라이드된 toString()이 필요함. 
		 * 4. clone
		 * - 객체를 복사하는 메소드
		 * - Cloneable 인터페이스를 구현해야 예외가 발생하지 않는다.
		 * */
		Student std1 = new Student("홍길동",20);
		Student std2 = new Student("홍길동",20);
		System.out.println(std1.equals(std2));
		System.out.println(std1);
		Student std3 = (Student) std1.clone();
		std3.age = 30;
		std3.name = "이순신";
		System.out.println(std1);
		System.out.println(std3);
		Class cObj = std3.getClass(); //클래스 정보를 간단하게 알려주는 기능
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString()); 
		System.out.println(cObj.toString());
	}

}
class Student implements Cloneable{
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 내 참조변수와 비교할 주소가 같다면 (같은 객체를 공유한다면..)
			return true;
		// equals가 동작했다는 것은 this가 null이 아니라는 의미
		if (obj == null) // 비교할 참조변수의 주소가 널이면 비교할 필요가 없기 때문에 false로 판별
			return false;
		// 두 객체가 서로 다른 클래스의 객체이면 false로 판별
		if (getClass() != obj.getClass()) 
			return false;
		// 비교대상(obj)는 Student 클래스의 객체이다는 것을 의미
		// obj를 Student 클래소로 형변환 할 수 있다. (부모를 자식으로 형변환하는 경우 명시적으로 형변환해야 한다.)
		Student other = (Student) obj;
		// 나이가 다르면 false로 판별
		if (age != other.age)
			return false;
		// 내 이름이 null이고, 비교 이름이 null이 아니면 false로 판별
		if (name == null) {
			if (other.name != null)
				return false;
		// 내 이름이 있으면 대상이름과 equals를 이용하여 같으면 같고, 다르면 다르다고 판별 
		} else if (!name.equals(other.name)) // 여기서 equals는 String클래스의 equals이다.
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {
		}
		
		return obj;
	}
	
}