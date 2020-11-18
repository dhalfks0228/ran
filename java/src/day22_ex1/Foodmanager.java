package day22_ex1;

import java.util.ArrayList;

public class Foodmanager {
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	int totsum=0;
	int sum=0;
	public void printmenu(){
		System.out.println("-----메뉴 & 가격 -----");
		System.out.println("1. 햄버거 : 10,000원");
		System.out.println("2. 피자 :  20,000원");
		System.out.println("3. 음료 :   1,000원");
		System.out.println("4. 과자 :   3,000원");
		System.out.println("5. 사탕 :   2,000원");
		System.out.println("6. 프로그램 종료");
		System.out.println("---------------------");
	}
	public void sale(int menu, int count) {
		list.add("햄버거");
		list.add("피자");
		list.add("음료");
		list.add("과자");
		list.add("사탕");
		
		list2.add(10000);
		list2.add(20000);
		list2.add(1000);
		list2.add(3000);
		list2.add(2000);
		
		sum = list2.get(menu-1)*count;
		totsum = totsum + sum;
		
		System.out.println("--------------------------------");
		System.out.println("주문하신 메뉴는 " + list.get(menu-1) + count +"개 나왔습니다." );
		System.out.println("금액은 " + sum + "원 입니다.");
		System.out.println("--------------------------------");	
	}
		
		
	
}
