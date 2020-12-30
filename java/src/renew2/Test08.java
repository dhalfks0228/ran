package renew2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		/*- 정수 n을 입력받고 입력받은 수만큼 단어와 뜻을
		 *  입력받아 저장하고 출력하는 코드를 작성하세요.*/
		// 내 코딩
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> liststr = new ArrayList<String>();
		ArrayList<String> listdata = new ArrayList<String>();
		System.out.print("정수를 입력 : ");
		int num = scan.nextInt();
		String str, data;
		while(liststr.size() < num) {
			System.out.print("단어 : ");
			str = scan.next();
			liststr.add(str);
			System.out.print("뜻 : ");
			data = scan.next();
			listdata.add(data);
		}
//		while(listdata.size() < num) {
//		}	
		
		
		for(int i=0; i<num; i++) {
			String tmpstr = liststr.get(i);
			String tmpdata = listdata.get(i);
			System.out.println("단어 : "+tmpstr);
			System.out.println("뜻 : "+tmpdata);
		}
		scan.close();
	}
		
}


