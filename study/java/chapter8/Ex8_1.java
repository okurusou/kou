package chapter8;

public class Ex8_1 {

	public static void main(String[] args) {
		System.out.println(1);
		try {  // try���� ���忡 ���ܰ� �߻����� �ʴ´ٸ� catch���� ������
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) { // try���� println���� ���ܰ� �߻����� �ʾ����Ƿ� �ش� ���� ������
			System.out.println(4);
		} // try-catch�� ����
		System.out.println(5);
	}

}
