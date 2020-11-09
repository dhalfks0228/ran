package day16;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx1 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("유관순");
		set.add("임꺽정");
		set.add("이순신");
		set.add("홍길동"); // 중복X 추가해도 홍길동이 1명. 
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp); // 순서가 같지 않음.
		}
	}

}