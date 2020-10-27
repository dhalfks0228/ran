package day7;

public class 메소드4 {

	public static void main(String[] args) {
		int arr[] = new int[] {1,3,5,7,9,2,4,6,8,10,11};
		
		//printArray(arr);
		sortArray(arr);  // 배열 정렬 까지만.
		arr = sortArray2(arr);
		printArray(arr); // 배열 출력 만.
		arr = creatArray(5);
		printArray(arr);
	}
	/* 기능 : 주어진 정수 배열의 값들을 콘솔에 출력하는 메소드
	 * 매개변수 : 정수 배열 => int arr[]
	 * 리턴타입 : 없음. void
	 * 메소드명 : printArray
	 * */
	static void printArray(int arr[]) {
		for (int i=0; i<arr.length;i++) {
			// 5개씩 한줄에 출력하기 위한 코드
			if(i % 5 == 0) {   
				System.out.println();
			}
			System.out.print(arr[i] + " ");
		}
	}
	/* 기능 : 주어진 정수 배열을 정렬하는 메소드
	 * 매개변수 : 정수 배열 => int arr1[]
	 * 리턴타입 : 정수 배열 => int [] , 또는 없음. void
	 * 메소드명 : sortArray 
	*/
	static void sortArray(int [] arr) {     // 배열을 정렬하는 메서드.
		
		for (int i=0; i<arr.length-1;i++) { // 배열의 개수만큼 반복. 
			for (int j=0; j<arr.length-1-i;j++) {  // 배열의 앞과 뒤의 값을 비교 바꿈.
				// j번지에 있는 값이 다음 배열값(j+1)보다 크면
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	static int [] sortArray2(int [] arr) {     // 배열을 정렬하는 메서드.
		
		for (int i=0; i<arr.length-1;i++) { // 배열의 개수만큼 반복. 
			for (int j=0; j<arr.length-1-i;j++) {  // 배열의 앞과 뒤의 값을 비교 바꿈.
				// j번지에 있는 값이 다음 배열값(j+1)보다 크면
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	/* 기능 : 새로운 배열을 만들어서 돌려주는 메소드
	 * 매개변수 : 만들어야할 배열, 배열의 길이 => int [] arr, int size
	 * 리턴타입 : 새로 만든 정수 배열 => int []
	 * 메소드명 : creatArray
	 * */
	static int [] creatArray(int size) {
		 return new int[size];
		
	}
}
