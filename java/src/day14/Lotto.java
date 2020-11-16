package day14;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import day7.로또예제;

// 로또 당첨번호 생성 클래스
public class Lotto {
	
	private Integer []numbers = new Integer[6];
	private Integer []lotto = new Integer[6];
	private ArrayList<Integer[]> lottoList = new ArrayList<Integer[]>();
	private ArrayList<Integer> bonusList = new ArrayList<Integer>();
	//로또 번호 발생
	public int random() {  //로또 번호 발생 
		return new Random().nextInt(45)+1;  
		
	}
	
	//1~45사이의 중복되지 않은 번호 6개를 생성하는 메소드
	public void randomLotto(Integer []arr) {
		
		int cnt = 0;
		while(cnt<6) {
			int r = random();
			if(!contain(arr, r)) {
			arr[cnt] = r;
			cnt++;
			}
		}
	}
	
	
	//로또 번호 배열에 num가 있는지 체크
	public boolean contain(Integer []arr, int num) throws RuntimeException {
		if(num < 0 || num > 45) {
			throw new RuntimeException("숫자의 범위가 다릅니다.");
		}
		for (int tmp : arr) {
			if(tmp == num)
				return true;
		}
		return false;
	}
		
	// 사용자 번호 6자리 랜덤 등록
	public void userRandom() { 
		System.out.println("선택하신 번호는 : ");
		randomLotto(numbers);
		for(int i =0;i<numbers.length;i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
	


	// 사용자 수동 번호 등록
	public void userChoice(Scanner scan) {
		int cnt=0;
		System.out.print("1~10까지 번호를 입력해주세요 : ");
		while(cnt<6) {
			int r = scan.nextInt();
			if(!contain(numbers, r)) {
				numbers[cnt] = r;
				cnt++;
			}
		}
		
		for(int i =0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}

		System.out.println();
	}
	
	//생성한 당첨번호 저장
	public void lottolist() {
		System.out.println("------당첨번호 확인-------");
		Iterator<Integer[]> it = lottoList.iterator();
		while(it.hasNext()) { // hasnext() 다음 요소가 있다면, 
			Integer tmp[] = it.next(); // 다음 요소 가져오기.
			System.out.print(tmp + " ");
		
		
		}
	}
	
	
	// 당첨 확인
	public void lottoWin() {
		int bonus = 0;
		randomLotto(lotto);
		bonus = random();
		if(!contain(lotto,bonus)) {
			bonus = random();
		}
		
		//당첨 로또 번호 생성
		for(int i =0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println("[" + bonus + "]");
		
		lottoList.add(lotto);
		bonusList.add(bonus);
		
		int rank = -1; 
		int cnt = 0;
		// 등수 확인
		for(int i =0; i<lotto.length;i++) {
			if (contain(numbers,lotto[i])) {
				cnt ++;
			}
		}
		switch(cnt) {
		case 6: rank = 1; break;
		case 5:
//			if(contain(numbers,bonus)) {
//				rank = 2;
//			}else {
//				rank = 3;
//			}
				rank = contain(numbers,bonus) ? 2 : 3;
			break;
		case 4: rank = 4; break;
		case 3: rank = 5; break;
		}
		
		if(rank==-1) {
			System.out.println("꽝! 다음기회에...");
		}else {
		System.out.println("축하합니다." + rank+"등");
		}
		
		
	}
}
