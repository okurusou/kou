package seven;

interface MyInterface {
	
	// �������̽��� ��� ������ ���(public static final)
	// �������̽������� ������, �ʱ�ȭ���� ������� ���ϸ�, �ڹپ���� ����� �ڵ��ʱ�ȭ�� �ȵ�
	// ���� ������ ����� �ʱ�ȭ�� �� �����ؾ���
	int a = 0; // ����� �ʱ�ȭ
	void myMethod();
}

// �������̽� ���� ����� ������
interface MyInterface2 extends MyInterface{
	void myMethod2();
}

// Ŭ����, �߻�Ŭ������ �������̽��� ����� �Ұ�
//class MyClass0 extends MyInterface {}

// �������̽��� ���߻��(����)�� ����
abstract class MyClass implements MyInterface, MyInterface2{
	// MyInterface�� ����� static. �Ʒ��� ������ �Ϲ� ���
	// static�� �ƴ� �Ϲ� ����� �ʱ�ȭ�� static�� �ٸ��� �����ڷε� �ʱ�ȭ�� ����
	final int a;
	MyClass() { a = 0; }
	
	void myMethod3() {
		// ����� �������� ���� �ڵ��ʱ�ȭ�� ���� ������, ��������� �ٸ��� �ʱ�ȭ�� ���� �ʰ� ���� �ϴ� ���� ������ 
		final int localA;
	}
	
}


public class Ex7_11_2 {

	public static void main(String[] args) {
		
	}

}