package day6;

public class 배열9 {

	public static void main(String[] args) {
		/* 배열 정렬하기(예제5-10, p.201, 버블정렬)
		 * */
		int arr[] = new int[] {4,3,2,9,8,7,6,10,1,5};
		for (int i=0; i<arr.length-1;i++) { // 배열의 개수만큼 반복. 
			for (int j=0; j<arr.length-1-i;j++) {  // 배열의 앞과 뒤의 값을 비교 바꿈.
				// j번지에 있는 값이 다음 배열값(j+1)보다 크면
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			for(int j = 0; j<arr.length; j++) {
				System.out.print(arr[j]+ " ");
			}
			System.out.println();
		}

	}

}
