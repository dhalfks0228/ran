package day22_ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class food {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Foodmanager fm = new Foodmanager();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		int i=0;
		int menu, sum;
		fm.printmenu();
		do {
			System.out.println("메뉴를 선택하세요. : ");
			menu = scan.nextInt();
			list3.add(menu);
			if (menu != 0) {
				System.out.println("수량을 입력하세요. : ");
				int count = scan.nextInt();
			
				if(menu < 6) {
					fm.sale(menu, count);
					System.out.println("----다른 메뉴를 골라주세요.----");
					System.out.println("주문을 끝내시려면 0을 입력하세요.");
				}else if (menu==6)
					System.out.println("프로그램 종료");
				else
					System.out.println("잘못된 메뉴");
						
			}
		}while (menu != 0);
		
		System.out.println("계산하실 금액은 " + fm.totsum + "원입니다.");

	}

}
