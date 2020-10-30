package day9;

public class 메소드8 {

	public static void main(String[] args) {
		System.out.println(sum(1));
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));

	}
	// 가변인자를 이용한 메소드 구현. 
	//(매개변수의 개수가 고정되어 있지않은 경우)
	// 숫자마다 의미가 다르면 안됨. 
	public static int sum(int... num) {
		int res = 0;
		for(int tmp : num) { // num가 배열처럼 사용됨.
			res += tmp;
		}
		return res;
	}
}
