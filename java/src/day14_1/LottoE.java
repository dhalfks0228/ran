package day14_1;
//당첨번호
public class LottoE extends Lotto2 {
	private int bonus; // 보너스 번호
	
	@Override
	protected void init() {
		super.init();
		bonus = 0;
	}
	@Override
	public void randomLotto() {
		super.randomLotto();
		//보너스 번호가 중복되지 않게 랜덤으로 생성
		while(true) { 
			int r = random();
			if(!contain(r)) {
				bonus = r; 
				break; // break가 없으면 빠져나오는 구문이 없음.(무한루프)
			}
		}
	}
	@Override
	public String toString() {
		return super.toString()+", [" + bonus + "]";
	}
	//오버로딩. 
	// 당첨번호 추가.
	public void insertNumber(int[]arr, int bonus) {
		if(arr.length < numbers.length)
			throw new RuntimeException("저장하려는 배열의 숫자가 적습니다.");
		super.insertNumber(arr);
		this.bonus = bonus; // 멤버 변수의 이름과 매개변수의 이름이 중복될 때 this를 반드시 써야함.
		
	}
	@Override
	public void insertNumber(int []arr) {
		if(arr.length < numbers.length+1) 
			throw new RuntimeException("저장하려는 배열의 숫자가 적습니다.");
		super.insertNumber(arr);
		bonus = arr[numbers.length];
		
	}
	public int getBonus() {
		return bonus;
	}
	
}
