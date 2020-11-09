package day16;

public class GenericsEx1 {

	public static void main(String[] args) {
		/* 지네릭스(Generics)는 다양한 타입의 객체들을 다루는 메서드나 
		 * 컬렉션 클래스에 컴파일 시의 타입체크를 해주는 기능. 
		 * 객체의 타입을 컴파일 시에 체크 하기 때문에 생성자에서 정의X*/
		Array<Integer> arr = new Array<Integer>(new Integer[10]);
		arr.set(0, 10);
		System.out.println(arr.get(0));
		Array<Character> arr2 = new Array<Character>(new Character[10]);
		arr2.set(0, 'a');
		System.out.println(arr2.get(0));
	}

}
class Array<T>{
	T arr[];
	public Array(T[] arr) {
		this.arr = arr;
	}
	public Array() {}
	public T get(int i) {
		if (arr.length>i) {
			return arr[i];
		}else {
			return null;
		}
	}
	public void set(int index, T value) {
		if(arr.length > index)
			arr[index] = value;
	}
}