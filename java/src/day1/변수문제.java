package day1;

public class �������� {

	public static void main(String[] args) {
		//����1. ȫ�浿�� ���������� �����Ϸ��Ѵ�. 
		//�̶� �ʿ��� ������ �����ϼ���. ��, ������ ������ �����Ѵ�.
		
		int korScore;
		
		//����2. ȫ�浿�� ���������� �����Ϸ��Ѵ�.
		//�̶� �ʿ��� ������ �����ϼ���. ��, ������ A,B,C,D,F�� �����Ѵ�.
		char mathScore;
		
		//������ ���� ����(kor), ����(math), ����(eng)�� ���� ��
		// ������ �հ�, ����� ������ ������ �����ϼ���.
		int kor = 100;
		int math = 90;
		int eng = 80;
		
		int sum; //�հ�
		double avg; //���
		
		sum = kor + math + eng;
		avg = sum / 3;
		
		//����4. ���� �� ������ �ִ� ���� ������? 2, 4, 5
		/* 1. char ch1 = 'A';
		 * 2. char ch2 = '11'; -> ���ڴ� 1����.
		 * 3. char ch3 = '_';
		 * 4. char ch4 = C;    -> ' ' ������.
		 * 5. char ch5 = "D";  -> ' ' �� �Ǿ���.  
		 */
		
		System.out.println(sum);
		System.out.println(avg);
		

	}

}
