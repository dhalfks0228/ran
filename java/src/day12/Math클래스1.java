package day12;

public class Math클래스1 {

	public static void main(String[] args) {
		/* round() : 소수점 첫째자리에서 반올림에서 반올림해서 결과값을 정수(long)으로 반환하는 메소드
		 * ceil : 소수점 첫째자리에서 올림해서 결과를 실수로 반환하는 메소드
		 *  floor : 소수점 첫째자리에서 내림해서 결과를 실수로 반환하는 메소드
		 * */
		double num = 123.45678;
		System.out.println(num + "를 소수점 1번째 자리에서 반올림 :" + Math.round(num));
		System.out.println(num + "를 소수점" + 3 + "번째 자리에서 반올림 : " + round(num,2));
		System.out.println(num + "를 소수점 1번째 자리에서 올림 :" + Math.ceil(num));
		System.out.println(num + "를 소수점 1번째 자리에서 내림 :" + Math.floor(num));
		//rint : 가장 가까운 정수로 반환하는 메소드로, .5와 같이 딱 가운데 있는 경우 짝수 결과값으로 반환됨.
		System.out.println(num + "에서 가장 가까운 정수" + Math.rint(num));
	}
	public static double round(double num, int count) {
		for (int i = 1; i<=count;i++) {
			num *= 10; //count의 횟수만큼 10을 곱함.
		}
		//결과에서 round()
		num = Math.round(num);
		//결과에서 count의 횟수만큼 / 10
		for (int i = 1; i<=count;i++) {
			num /= 10; //count의 횟수만큼 10을 곱함.
		}
		return num;
	}
}
