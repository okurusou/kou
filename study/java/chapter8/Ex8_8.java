package chapter8;

public class Ex8_8 {

	public static void main(String[] args) {
		// ���ܸ� ������ ������ �ܰ迡�� ������ �ƴ�
		throw new RuntimeException();
	}
	class A {
		// �ε��� �������� �ʰ��ϴ� �ε����� ������ �õ��ص� ������ �ܰ迡���� ������ �ƴ�
		int[] arr = new int[5];
		int value = arr[10];
	}
}
