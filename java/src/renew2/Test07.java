package renew2;

import java.util.HashMap;
import java.util.Iterator;

public class Test07 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("2020123","홍길동");
		map.put("2020222", "임꺽정");

		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println("학번 : "+key + ", 이름 : "+value);
		}
	}
/* 사전을 컬렉션프레임워크를 이용하여 생성하려한다. 이때 적당한 컬렉션 프레임워크는?
 * 1. List
 * 2. Set
 * 3. Map
 * 
 * 1. List : 순서를 보장하는 하고, ABC 순서로 정리
 *  - 단어를 순서대로 출력할 수 있어야 하기 때문.
 *  - 단어와 뜻을 멤버 변수로 갖는 클래스를 이용*/
}
