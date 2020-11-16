package day7;

public class 로또예제 {

	public static void main(String[] args) {
		int lotto[] = new int [7]; // 당첨번호,  마지막 번지는 보너스번호 !!
		int min = 1, max = 45;
		int user[] = new int[6]; // 사용자 번호
		randomArray(lotto, min, max);
		printArray(lotto);
		randomArray(user, min, max);
		printArray(user);
	
		int rank = lottoRank(lotto, user);
		if(rank==-1) {
			System.out.println("꽝! 다음기회에...");
		}else {
		System.out.println("축하합니다." + rank+"등");
		}
		
//		switch(rank) {
//		case 1 : case 2: case 3: case 4: case 5:
//			System.out.println("축하합니다." + rank+"등");
//			break;
//		default :
//			System.out.println("꽝! 다음기회에...");
//		}
	}
	
	/* 기능 : 원하는 범위의 랜덤 값을 알려주는 메소드
	 * 매개변수 : min과 max의 범위 값 => int min, int max 
	 * 리턴타입 : 랜덤의 값 => int
	 * 메소드명 : random
	 * */
	public static int random(int min, int max) { 
		if(min>max) {		// min 값을 크게 입력했을 시
			int tmp = min;  // min과 max를 변경함. 
				min = max;
				max = tmp;
		}
		return (int)((max - min + 1)* Math.random() + min);
		
	}
	/* 기능 : 주어진 배열에 모든 번지에 있는 값을 랜덤으로 설정하는 메소드
	 * 매개변수 : int [] 
	 * 리턴타입 : void
	 * 메소드명 : randomArray
	 * */
	public static void randomArray(int arr[], int min, int max) {
		// 중복허용.
		/*for(int i = 0; i<arr.length; i++) {
			arr[i] = random(1, 45);
			}  */
		
		// 만약 중복된 숫자가 있다면, 중복이 되지 않게...
		if (max-min+1 <= arr.length) {
			System.out.println("범위가 작습니다.");
			return;
		}
		int cnt = 0;
		while(cnt<arr.length) {
			int r = random(min, max);
			if(!isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}
	/* 기능 : 주어진 정수 배열의 값들을 콘솔에 출력하는 메소드
	 * 매개변수 : 정수 배열 => int arr[]
	 * 리턴타입 : 없음. void
	 * 메소드명 : printArray
	 * */
	public static void printArray(int arr[]) {
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	/* 기능 : 배열에 특정 값이 있는지 없는지 알려주는 메소드
	 * 매개변수 : 배열, 특정 값 => int []arr, int num
	 * 리턴타입 : 있는지 없는지 => boolean 
	 * 메소드명 : isContain
	 * */
	public static boolean isContain(int arr[], int num) {
		for (int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	/* 기능 : 로또 번호의 등수를 알려주는 메소드
	 * 		=> 사용자가 자동으로 생성한 번호가 몇등인지 알려주는 메소드
	 * 			(단, 등수에 없으면 -1을 반환)
	 * 매개변수 : 로또번호, 사용자번호 => int []lotto, int []user
	 * 리턴타입 : 
	 * 메소드명 : lottoRank
	 * */
	public static int lottoRank(int []lotto, int []user) {
		if (lotto.length <= user.length){  //  사용자 번호와 로또 번호의 순서가 바뀐경우.
			return -1;
		}
		int cnt = 0; //로또번호와 일치하는 사용자 번호개수(단, 보너스번호는 제외)
		// user배열을 메인으로 확인하는 이유는 보너스 번호를 포함하지 않기 위해.
		for (int i = 0 ; i<user.length; i++) { // 사용자 번호와 로또 번호가 일치하는지 확인.
			// 로또번호에서 하나 꺼낸 번호가 사용자 번호에 있는지 확인하여
			// 있으면 증가
			if (isContain(user, lotto[i])){
				cnt++;
			}
		}
		switch(cnt) {
		case 6 : return 1; // break가 필요 없음. 
		case 5 : 
			return isContain(user, lotto[lotto.length-1]) ? 2 : 3;
		case 4 : return 4;
		case 3 : return 5;
		default: return -1;		
		}
	}

}
