package seven;

import test.Test12;

public class Ex7_4 {

	public static void main(String[] args) {
		Test12 t = new Test12();
		
		//public ������� ȣ��
		Test12.a = 1;
		t.b = 2;
		
		/*
		default ������� ȣ��. ����
		Test12.c = 3; 
		t.d = 4;
		
		default ����޼��� ȣ��. ����
		Test12.staticMethod();
		t.method();
		*/
		
		// public �޼��� ȣ��
		t.publicMethod();
		
		//���� �޼��� ȣ��. Ex7_4�� StringŸ�� �迭�� �Ű������� ���ڷξ�
		t.main(args);
		
		
		
	}

}



