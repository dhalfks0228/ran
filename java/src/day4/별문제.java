package day4;

public class 별문제 {
	
	public static void main(String[] args) {
		/* 이중 반복문을 이용하여 아래와 같이 출력되도록 작성하세요.
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * */
		int i, j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/* 이중 반복문을 이용하여 아래와 같이 출력되도록 작성하세요.
		 * *		i=1 j=* 
		 * **		i=2 j=**
		 * ***		i=3 j=***
		 * ****		i=4 j=****
		 * *****	i=5 j=*****
		 * */
		for(i=1; i<=5; i++) {
			for(j=1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/* 이중 반복문을 이용하여 아래와 같이 출력되도록 작성하세요.
		 *     *	i=1 공=4 j=1 
		 *    **	i=2 공=3 j=2
		 *   ***	i=3 공=2 j=3
		 *  ****	i=4 공=1 j=4
		 * *****	i=5 공=0 j=5
		 * */
		int k;
		for(i=1;i<=5;i++) {
			//반복문을 이용하여 공백을 출력
			for(k=1; k<=5-i; k++) {
					System.out.print(" ");
			}
			//반복문을 이용하여 *을 출력
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1;i<=5;i++) {
			//반복문을 이용하여 공백을 출력
			for(j=1; j<=5; j++) {
				if(j<=5-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		/* 이중 반복문을 이용하여 아래와 같이 출력되도록 작성하세요.
		 * *****	i=1 j=5 
		 * ****		i=2 j=4
		 * ***		i=3 j=3
		 * **		i=4 j=2
		 * **		i=5 j=1 6-i
		 * */
		for(i=1; i<=5; i++) {
			for(j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* 이중 반복문을 이용하여 아래와 같이 출력되도록 작성하세요.
		 * 111  
		 * 112
		 * 113
		 * 121
		 * 122
		 * 123
		 *...
		 * */
		for (i=1; i<=3; i++) {
			for(j=1; j<=3; j++) {
				for(k=1; k<=3; k++) {
					System.out.println(""+i+j+k);
				}
			}
			
		}
		
	}

}
