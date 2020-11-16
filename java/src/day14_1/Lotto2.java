package day14_1;

import java.util.Arrays;
import java.util.Random;

public class Lotto2 {
	protected int [] numbers = new int [6];
	
	//1에서 45사이의 정수를 생성하여 반환하는 메소드
	protected int random() {
		return new Random().nextInt(45)+1; 
	}
	//1~45사이의 중복되지 않은 번호 6개를 생성하는 메소드
	public void randomLotto() {
		init(); // 배열 초기화
		int cnt = 0;
		while(cnt<6) {
			int r = random();
			if(!contain(r)) {
			numbers[cnt] = r;
			cnt++;
			}
		}
	}
	//로또 번호 배열에 num가 있는지 체크
	protected boolean contain(int num) throws RuntimeException {
		if(num < 0 || num > 45) //num의 범위가 넘어가면 false 리턴 
			throw new RuntimeException("숫자는 1~45이여야 합니다.");
		for (int tmp : numbers) {
			if (tmp == num) {
				return true;
			}
		} 
		return false;
	}
	//로또 번호 배열을 초기화 하는 메소드
	protected void init() {
//		for(int i=0; i<numbers.length;i++) {
//			numbers[i] = 0;
//		}
		numbers = new int[6]; 	
		
	}
	// 로또 당첨 번호 확인을 위한 번호를 문자열로 변환
	@Override
	public String toString() {
		//양쪽 대괄호를 공백으로 바꾸기 (체이닝기법)
		return  Arrays.toString(numbers).replace("[", "").replace("]", ""); 
	}
	
	public void insertNumber(int[]arr) {
		if(arr.length<numbers.length)
			throw new RuntimeException("저장하려는 배열의 숫자가 작습니다.");
//		for(int i=0; i<numbers.length;i++) { // 하나씩 옮김.
//			numbers[i] = arr[i];
//		}
		System.arraycopy(arr, 0, numbers, 0, numbers.length);// 배열복사(속도가 더 빠름)
	}
	public int[] getNumbers() {
		return numbers;
	}
	
	
}
