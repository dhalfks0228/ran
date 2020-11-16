package day14;

import java.util.Scanner;

public class 로또프로그램 {

	public static void main(String[] args) {
		Lottocontrol lotto = new Lottocontrol();
		Lotto l = new Lotto();
		char menu = '0';
		Scanner scan = new Scanner(System.in);
		do {
			lotto.printMenu();
			menu = scan.next().charAt(0);
			switch(menu) {
			case '1': l.userRandom(); break;
			case '2': l.userChoice(scan); break;
			case '3': l.random(); break;
			case '4': l.lottoWin();break;
			case '5': break; //종료
			default :
				lotto.printAlert();
			}
		}while(menu != '5');
		lotto.printExit();
		scan.close();
	
	}

}
