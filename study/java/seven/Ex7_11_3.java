package seven;

interface MyInterface3 {}
interface MyInterface4 {}
abstract class MyClass2 implements MyInterface4{}

//Ŭ���� �ϳ��� �߻�޼��带 ����ϰ� �ټ��� �������̽��� ������ �� ����
class MyClass3 extends MyClass2 implements MyInterface3, MyInterface4 {}


//�������̽� ��ü�� ���������ڰ� default���� �� ���� ����� public���� ������ - ����Ʈ �޼��� ����
interface MyInterface5 {
	 void methodA();
	 void methodB();
}

abstract class MyClass4 implements MyInterface5{
	
	//�߻� Ŭ������ �Ϲ� �޼��带 ������ �� �ְ�, �����ε� �׷� ������ �߻�Ŭ������ ���������
	//�߻� �޼��尡 �ƴ� �Ϲ� �޼��带 �ʹ� ���� �����ϴٰ� �߻�ȭ�� ������
	//���� �߻� Ŭ������ �߻� �޼��尡 ���ٸ� �߻� Ŭ������ �ǹ̰� ����
	//��, �߻� Ŭ������ �������̽��� �����Ѵٸ� �������̽��� �߻� �޼��带 �Ϻθ� �����ϴ� �뵵�� ����� �� ���� // 31line
	void method1() {}
	void method2() {}
	void method3() {}
	
	//�������̽��� �߻� �޼��带 �������̵� �� ����, ���������� public�� �ٿ�����
	public void methodA() {} 
	
}

class MyClass5 extends MyClass4 {
	//MyClass5�� MyClass4�� ��� ����� ��ӹ���. MyInterface5 ���� ��ӹް� ��
	//MyClass4���� methodA�� ���������� methodB�� �������� �ʾ���
	//���� �ش� Ŭ�������� methodB�� �������̵� ���� ������ ����
	public void methodB() {} 
}



public class Ex7_11_3 {

	public static void main(String[] args) {

	}

}
