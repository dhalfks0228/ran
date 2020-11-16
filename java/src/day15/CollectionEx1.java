package day15;

import java.util.*; // 모든 클래스 임포트


public class CollectionEx1 {

	public static void main(String[] args) {
		/* 프레임웤 : 표준화된 방식
		 * 컬렉션 프레임웤 : List, Set, Map
		 * - 데이터를 묶어서 관리할 때
		 * - 주로 배열 대신 사용
		 * p. 579
		 * List
		 * - 값을 하나씩 저장
		 * - 순서를 보장
		 * - 중복을 허용
		 * - 일반적으로 가장 많이 사용
		 * Set
		 * - 값을 하나씩 저장
		 * - 순서를 보장 X
		 * - 중복 불가
		 * Map
		 * - 값을 두개 저장, key값과 value의 값으로 저장
		 * - key값은 중복 불가, value값은 중복 허용
		 * - 중복된 key값을 저장하려하면 덮어쓰기 됨.
		 * - 예를들면 아이디/비밀번호 같은 상황에서 이용.
		 * 
		 * List : 인터페이스(p.581)
		 * - Vector, ArrayList, LinkedList, Stack 등 구현 클래스로 구현.
		 * 
		 * */
		/* 컬렉션 프레임워크는 어떤 데이터를 관리할지 클래스로 지정을 해야한다.
		 * 클래스를 지정하지 않으면 Object가 자동으로 들어간다.
		 * list1, list2는 저장할 클래스 종류를 선택하지 않았기 때문에 Object가 자동으로 들어가고,
		 * 따라서 모든 클래서의 객체를 저장할 수 있다.
		 * list3은 String으로 저장할 클래스를 지정했기 때문에 정수를 저장할 수 없다.
		 * list3의 방식으로 주로 사용된다.
		 * */ 
		//List 사용방법
		//List list = new List(); //불가능  
		List list1 = new ArrayList();// 오브젝트 클래스들.. 모든 아이들 저장가능
		ArrayList list2 = new ArrayList();// 오브젝트 클래스들.. 모든 아이들 저장가능
		ArrayList<String> list3 = new ArrayList<String>();// 문자열들만 관리
		//ArrayList<int> list4 = new ArrayList<int>();// 안됨. <클래스가 와야함.> 
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list2.add(1);
		//list3.add(1);
		for(int i=0; i<10;i++) { // 번지가 아닌 개수를 의미
			list4.add(i+1); // list4에 값을 추가
		}
		for(int i=0; i<10;i++) { // 개수를 의미
			list4.add(i+1); // list4에 값을 추가
		}
		//실행결과 : 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10
		
		list4.remove(0); // 0번지의 값을 삭제
		//실행결과 : 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10
		
		Integer integer = 10; 
		// 10의 값과 일치하는 첫번째 요소를 삭제
		list4.remove(integer);
		//실행결과 : 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 10
		
		list4.set(0, 1);
		//실행결과 : 1 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 10
		
		/* sort(객체)
		 * - 객체 : Comparator 인터페이스를 구현한 객체를 넣어야 함.
		 * - 비교(compare) 메소드를 가진 객체를 이용하여 정렬
		 * - compare 메소드의 구현에 따라 오름차순, 내림차순으로 정렬 가능
		 * */
		list4.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2; //오름차순  o2 - o1 : 내림차순
			}
		});
		//실행결과 : 1 1 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9 10
		for (Integer tmp : list4) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		for(int i=0; i<list4.size();i++) {
			if(i%2==0) {
				System.out.print(list4.get(i)+" ");
			}
		}
		System.out.println();
		/* Iterator를 이용한 List의 값 확인 (번지가 아닌 값을 이용하여 출력)
		 * 리스트는 순서를 보장하기 때문에 get을 이용해서 원하는 번지의 값을 확인할 수 있다.
		 * set은 순서를 보장하지 않기 때문에 for문을 이용하여 접근할 수 없다. 
		 * 그래서 set은 Iterator를 이용하여 출력.
		 * hasnext() : 현재 정보를 기준으로 다음 정보가 있는지 확인
		 * next() : 현재 정보를 기준으로 다음 정보를 가져옴
		 * list4.iterator() : 리스트에 있는 정보를 가져오는데 시작위치를 첫번째 요소 앞을 가르킨다.
		 * List : for, Iterator 둘다 사용 가능.
		 * Set : Iterator만 사용 가능.
		 * */
		Iterator<Integer> it = list4.iterator();
		while(it.hasNext()) { // hasnext() 다음 요소가 있다면, 
			Integer tmp = it.next(); // 다음 요소 가져오기.
			System.out.print(tmp + " ");
		}
		System.out.println();
		//실행결과 : 1 1 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9 10
		
		//이때 indexOf를 이용하여 같은 객체인지 아닌지 판단은 equals()를 이용한다.
		//따라서 사용자가 정의한 클래스를 이용할 때는 equals()를 반드시 오버라이딩 해야한다.
		System.out.println(list4.indexOf(11)); //indexOf : 일치하는 값을 찾아 시작번지를 돌려줌
	}

}
