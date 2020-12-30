package renew2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크(제네릭 클래스)
		 * - List : 순서 보장, 중복 가능, 1가지 데이터
		 * - Set : 순서 보장 X, 중복 불가능, 1가지 데이터
		 * - Map : 2가지 데이터, 순서 보장 X
		 * 	- Key : 중복 불가능
		 * 	- Value : 중복 가능
		 * 
		 * 제네릭 클래스 <타입>
		 * - 멤버 메소드나 변수의 타입이 고정이 아니라 밖에서 알려준 타입으로 지정되는 클래스
		 * */
		ArrayList<String> list = new ArrayList<String>();
		list.add("안녕하세요1");
		list.add("안녕하세요2");
		list.add("안녕하세요3");
		list.add("안녕하세요");
		list.remove(0);
		list.remove("안녕하세요");//equals()를 이용하여 비교한 후 같으면 제거
		for(String tmp : list) {
			System.out.println(tmp);
		}
		/* 정수를 입력받아 입력받은 정수만큼 오늘의 할일을 입력하여
		 * 저장하고, 저장된 리스트를 출력해보세요.*/
		
		System.out.print("정수를 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		list.clear(); // 기존 list의 내용 비움.
		//내코딩
//		for(int i =0; i<num; i++) {
//			System.out.print("할일을 입력하세요 : ");
//			String str = scan.next();
//			list.add(str);
//		}
//		for(String tmp : list) {
//			System.out.println(tmp);
//		}
		
		//선생님코딩
		while(list.size() < num) {
			System.out.print("할일을 입력하세요 : ");
			String str = scan.next();
			list.add(str);
		}
		for(String tmp : list) {
			System.out.println(tmp);
		}
	}

}
