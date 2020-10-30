package day8;

import day7.메소드4;

public class 클래스2 {

	public static void main(String[] args) {
//		Card c = new Card();
//		c.print();
//		//카드 모양과 숫자 설정
//		c.setShape('♠');
//		c.setNum(7);
//		//카드 모양과 숫자를 출력하는 코드
//		c.print();
		
		/* new 연산자를 통해 객체를 만들고, 만들어진 객체를 초기화 하기 위해
		 * 생성자 CardPack()으로 이동하여 실행. */
		CardPack cp = new CardPack();
		cp.shuffle(); 
		Card tmp; 
		for(int i= 1; i<=4; i++) {
			for (int j =1; j<=13; j++) {
				tmp = cp.pick();
				tmp.print();
			}
			System.out.println();
		}

	}
}


/* CardPack 클래스
 * - 카드팩 : 52장의 카드들
 * - 카드 섞기 기능 
 * - 카드 빼내는 기능
 * - 카드 초기화 기능
 * */

class CardPack {
	private Card[] pack = new Card[52];
	private int cnt = 0; // 현재 남은 카드 개수
	
	// 카드 섞기 기능
	public void shuffle() {
		int min = 0; // 0번지부터
		int max = pack.length-1;  // 9번지까지
		for(int i = 0; i<pack.length; i++ ) {
			int index = (int)((max-min+1)*Math.random()+min);
			Card tmp = pack[i];
			pack[i] = pack[index];
			pack[index] = tmp;
			
		}
	}
	// 카드 빼내는 기능
	// 리턴타입 : 꺼내간 카드 => Card
	public Card pick() {
		if (cnt==0) {
			return null;
		}
		cnt--;
		return pack[cnt]; // pack의 마지막 번지의 값을 pick
	}
	// 카드 초기화 기능
	public void init() {
		cnt = 52;
		shuffle();
	}
	
	public int getCnt() {
		return cnt;
	}
	
	public CardPack() { // 생성자
		char shape = '♥';
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1: shape = '♥'; break;
			case 2: shape = '◆'; break;
			case 3: shape = '♣'; break;
			case 4: shape = '♠'; break;
			}
			for(int j=1; j<=13; j++) {
				Card tmp = new Card(); // 카드 1장 생성
				tmp.setNum(j); 
				tmp.setShape(shape);
				pack[cnt] = tmp; 	// 카드 팩에 카드 추가
				cnt++;	// 카드 개수 증가
			}
		}
	}


	
	
}
 