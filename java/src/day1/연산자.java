package day1;

public class ������ {

	public static void main(String[] args) {
		//���Կ����� : = 
		// = �� �������� �����ʿ� �ִ� ���� ���ʿ� ����
		// A = B
		// B�� A�� ����(����)�϶� / �Ǵ� �����
		// A�� �����̿����Ѵ�.
		// A�� 1���� ���������Ѵ�.
		int a = 10;
		int b = 20;
		a = 30;
		b = b + 30;
		
		//b + 30 = a  �����߻�
		
		//��� ������ : +, -, *, /, %(������,���)
		// +, -, * �� �״��
		System.out.println(4+3);
		System.out.println(4-3);
		System.out.println(4*3);
		
		System.out.println(1.2 + 3.4);
		System.out.println(1.2 - 3.4);
		System.out.println(1.2 * 3.4);
		
		/* ������
		 * ���� / ���� => ���� (�Ҽ��� ����)
		 * ���� / �Ǽ� => �Ǽ�
		 * �Ǽ� / ���� => �Ǽ�
		 * �Ǽ� / �Ǽ� => �Ǽ�
		 */
		System.out.println(3 / 2);
		System.out.println(3 / 2.0);
		System.out.println(3.0 / 2);
		System.out.println(3.0 / 2.0);
		// ���� / ������ �ؾ��ϴ� ��� ���ʿ��� �ڷ�����ȯ�� �ؼ�
		// �Ǽ� / ������ ���� ����Ѵ�.
		System.out.println((double)3 / 2);
		
		int num1 = 3;
		int num2 = 2;
		System.out.println((double)num1 / num2);
		
		// ������ ������ % 
		// a % b : a�� b�� �������� �� �������� ���ϴ� ������
		// ����� ��� ���� �� ���
		System.out.println(4 % 3);
		System.out.println(199 % 17);
		
		/* ����1. ���� ������ 100��, ���� ������ 35��, ���� ������ 97���� ��  
		 * ����, ����, ���� �� ������ ������ ����� ���Ͽ� �ֿܼ� ����ϼ���. 
		 */
		int kor = 100;
		int math = 97;
		int eng = 35;
		
		int sum;
		double avg;
		
		sum = kor + math + eng;
		avg = sum / 3.0;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
				
		
		
	}

}
