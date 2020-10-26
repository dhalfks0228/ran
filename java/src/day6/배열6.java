package day6;

public class 배열6 {

	public static void main(String[] args) {
		/* 최소값과 최대값
		 * 다음과 같은 배열이 있을 때 최소값, 최대값을 찾아 출력.
		 * */
		int arr[] = new int[] { 3, 1, 5, 10, 20, 4, 8};
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("최소값 : " + min);
		
		int max = arr[0];
		int sum = 0;
		double avg = 0;
		for(int i = 0; i<arr.length; i++) {
			sum +=arr[i];
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		avg = (double)sum / arr.length;
		System.out.println("최대값 : " + max);
		System.out.println("배열의 합계 : " + sum);
		System.out.println("배열의 평균 : " + avg);

	}

}
