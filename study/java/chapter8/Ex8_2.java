package chapter8;

public class Ex8_2 {

	public static void main(String[] args) {
		System.out.println(1);
//		System.out.println(0/0);  // �ش� ������ �����ϸ� ArithmeticException ���ܰ� �߻�. console���� Ȯ�ΰ���
		try {
			System.out.println(2);
			System.out.println(0/0); // ArithmeticException���� �߻�. catch���� �����
			System.out.println(3);	// �ش� ������ ������� ����
		} catch (ArithmeticException ae) { 
			// ArithmeticExceptionŬ������ Exception�� ���� Ŭ�����̹Ƿ� (Exception e)�� �����ص� ������
			System.out.println(4);
		}
		System.out.println(5);
	}

}
