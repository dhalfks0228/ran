package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		/* A와 B자리에 클래스명이 각각 동일해야 함. 
		 * HashMap<A, B> map = new HashMap<A, B>();
		
		Set<Map.Entry<A, B>> set = map.entrySet(); 
		Iterator<Map.Entry<A, B>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<A, B> tmp = it.next();
		}
	}*/
	HashMap<String, String> map = new HashMap<String, String>();
	//key는 중복X value는 중복 O
	map.put("abc123", "abcdefg1234567");
	map.put("abc123", "abc12345"); //key 값 중복
	map.put("qwe123", "abc12345");//value값 중복
	map.put("asd123", "qwe123"); 
	//Map 은 자체로 Iterator를 사용할 수 없다. 그래서 Set으로 변경 후 사용.
	Set<Map.Entry<String, String>> set = map.entrySet(); 
	Iterator<Map.Entry<String, String>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> tmp = it.next();
			System.out.println("ID : " + tmp.getKey() + ",  PassWord : " + tmp.getValue());
		}
	}
}
