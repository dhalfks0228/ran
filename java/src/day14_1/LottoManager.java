package day14_1;

import java.util.Scanner;

import javax.print.PrintService;

public class LottoManager {
	LottoE lotto[] = new LottoE[5];//당첨번호List
	int lCount = 0; // 생성된 로또 번호 개수
	Lotto2 user = new Lotto2();//사용자번호
	
	public void printMenu() {
		System.out.println("--------nemu---------");
		System.out.println("1. 로또 번호 생성(수동)");
		System.out.println("2. 로또 번호 생성(자동)");
		System.out.println("3. 로또 당첨 번호 입력");
		System.out.println("4. 로또 당첨 확인");
		System.out.println("5. 로또 당첨 번호 확인(전체)");
		System.out.println("6. 종료");
		System.out.println("----------------------");
		System.out.print("메뉴를 선택하세요 : ");
	}
	
	public void createLotto(Scanner scan) {
		System.out.println("로또 번호를 입력하세요.(중복X, 6개 숫자)");
		int []tmp = new int[6];
		for (int i =0; i<tmp.length;i++) {
			tmp[i] = scan.nextInt(); // 입력 받기
		}
		// 중복 체크, 범위 체크
			if(isDuplicated(tmp)) {
				System.out.println("중복 발생. 취소!!");
			}else {
				user.insertNumber(tmp);
				printString("로또 번호 : "+user);
			}
	}
	
	private boolean isDuplicated(int[] arr) {
		// 중복체크 메소드 중복이 있으면 true, 없으면 false
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void createLottoAuto() {
		user.randomLotto();
		printString("로또 번호 : "+user); //매개변수가 문자열. (배열만X)
		
	}
	
	public void printString(String str) {
		System.out.println("→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→");
		System.out.println(str);
		System.out.println("→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→→");
	}
	
	public void insertLotto(Scanner scan) {
		System.out.println("로또 번호를 입력하세요.(중복X, 7개 숫자, 보너스 번호 마지막 입력)");
		int []tmp = new int[7];
		for (int i =0; i<tmp.length;i++) {
			tmp[i] = scan.nextInt(); // 입력 받기
		}
		// 중복 체크, 범위 체크
			if(isDuplicated(tmp)) {
				System.out.println("중복 발생. 취소!!");
			}else {
				LottoE tmpLotto = new LottoE();
				tmpLotto.insertNumber(tmp);
				lotto[lCount] = tmpLotto;
				lCount++;
				printString("로또 번호 : "+tmpLotto);
			}
		
	}
	
	public void checkLotto() {
		//사용자 로또 번호를 입력하지 않았을 때
		if(user.contain(0)) {
			printString("로또 번호를 입력하세요");
			return;
		}
		if(lCount == 0) { //당첨 로또번호를 입력하지 않았을 때
			printString("당첨 번호를 입력하세요");
			return;
		}
		int cnt = 0; // 일치하는 번호의 개수
		//최신 당첨 번호
		LottoE tmp = lotto[lCount-1];
		for(int i=0;i<user.getNumbers().length;i++) {
			// lotto[lCount-1] : 마지막에 입력된 당첨번호
			//getNumbers()[i] : 최신 당첨번호 중 i+1 번째 번호
			int num = tmp.getNumbers()[i]; 
			if(user.contain(num)) {
				cnt++;
			}
		}
		int rank = -1;
		//당첨 등수 확인
		switch (cnt) {
		case 6: rank = 1 ; break;
		case 5: 
//			if(user.contain(tmp.getBonus())) {
//				rank = 2;
//			}else {
//				rank =3;
//			}
			//조건 선택 연산자 (위의 if문 대신 쓸 수 있다.)
			rank = user.contain(tmp.getBonus()) ? 2 : 3;
			break;
		case 4: rank = 4; break;
		case 3: rank = 5; break;
		}
		if(rank !=-1) {
			printString(rank+"등 당첨~!!");
		}else {
			printString("꽝!!");
		}
	}

	public void printLotto() {
//		System.out.println("*****당첨번호(전체내역)*****");
//		for(int i=0;i<lCount;i++) {
//			System.out.println(i+1+"회차 : " + lotto[i]);
//		}
//		System.out.println("------------------------");
		String str = "";
		for(int i=0;i<lCount;i++) {
			str += (i+1) + "회차 : " + lotto[i] + "\n" ; // 문자열 이어 붙이기
		}
		//마지막 로또 번호에 들어가는 엔터를 제거하기 위한 것.
		//substring : 시작부터 끝에 포함된 문자열을 얻기.
		str = str.substring(0, str.length()-1);
		printString(str);
		
	}


	
	
	
}
 