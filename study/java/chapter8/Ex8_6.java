package chapter8;

public class Ex8_6 {

	public static void main(String[] args) {
		Exception e1 = new Exception();		// catch���� �������� ���� ���������̹Ƿ� �������� �ߺ� �Ұ�
		try {
			throw new Exception("A");  // throw e1; << ���� ������
//			throw new CustomException();   // ����
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
	}
}

class CustomException extends Exception{}