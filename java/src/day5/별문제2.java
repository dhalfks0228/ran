package day5;

public class 별문제2 {

	public static void main(String[] args) {
		/* - 일반변수 vs 참조변수
		 * - 일반변수는 변수타입(자료형)을 이용한 변수들로 값을 저장
		 * - 참조변수는 주소를 저장하는 변수로, 객체, 배열 등이 있다.
		 * 
		 * - 지역변수 : 특정지역에서 사용하는 변수 (대부분의 변수는 지역변수)
		 * 
		 * */
		/* int i;
		for(int j=1; j<=5; j++) {
			System.out.println(j);
		}
		System.out.println(j);  // j의 사용 영역은 for문 괄호 안에서만 허용. 그래서 에러. 
		int j;    				// j변수가 이미 끝났기 때문에 다시 정의 가능.
		if ( i % 2 == 0) {
			int k = 2;
			System.out.println(k);
		}
		System.out.println(k); // k의 사용 영역은 if문 중괄호 안에서만 허용.  지역변수들의 특징 */
	
		/*     * 		i=1 공=4 별=1 별+=0 
		 *    ** *		i=2 공=3 별=2 별+=1
		 *   *** **		i=3 공=2 별=3 별+=2
		 *  **** ***	i=4 공=1 별=4 별+=3
		 * ***** ****	i=5 공=0 별=5 별+=4
		 * 공 = 5-i,  별 = i, 별+ = i-1 
		 * */
		int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
					System.out.print(" ");
				}
				for(int k=1;k<=i ;k++) {
					System.out.print("*");
				}
				for(int j=1; j<=i-1; j++) {
					System.out.print("*");	
				}
			System.out.println();	
		}
		
		/*     * 		i=1 공=4 별=1 
		 *    ***		i=2 공=3 별=3 
		 *   *****		i=3 공=2 별=5 
		 *  *******		i=4 공=1 별=7 
		 * *********	i=5 공=0 별=9 
		 * 공 = 5-i,   별 = 2*i-1 
		 * */
		for(int i=1; i<=num; i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* ********* 	i=1 공=0 별=9 
		 *  *******		i=2 공=1 별=7 
		 *   *****		i=3 공=2 별=5 
		 *    ***		i=4 공=3 별=3 
		 *     *		i=5 공=4 별=1 
		 * 공 = i-1,   별 = 10-(2*i-1) 
		 * */
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*(num-i)+1 ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	
}
