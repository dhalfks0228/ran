package day7;

public class 로또예제 {

	public static void main(String[] args) {
		int lotto[] = new int [7]; // 당첨번호,  마지막 번지는 보너스번호 !!
		int min = 1, max = 45;
		randomArray(lotto, min, max);
		printArray(lotto);
	}
	/* 기능 : 원하는 범위의 랜덤 값을 알려주는 메소드
	 * 매개변수 : min과 max의 범위 값 => int min, int max 
	 * 리턴타입 : 랜덤의 값 => int
	 * 메소드명 : random
	 * */
	static int random(int min, int max) { 
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
	static void randomArray(int arr[], int min, int max) {
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
	static void printArray(int arr[]) {
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	/* 기능 : 배열에 특정 값이 있는지 없는지 알려주는 메소드
	 * 매개변수 : 배열, 특정 값 => int []arr, int num
	 * 리턴타입 : 있는지 없는지 => boolean 
	 * 메소드명 : isContain
	 * */
	static boolean isContain(int arr[], int num) {
		for (int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}

}
