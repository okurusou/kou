package chapter8;

public class Ex8_13_1 {
	
	public static void main(String[] args) throws SomeException2  {  // Excpetion���� ����
		SomeException se = new SomeException();   // ���� �޼��尡 
//		exampleMethod();   // ���� ������ �޼��� ȣ���, �޼����� �۾��� ������ �����̵� try-catch�� �ϰų� ���� ���ܼ����� �ؾ���
		try {
			se.method();
		} catch (Exception e) {
			SomeException2 se2 = new SomeException2();
			se2.initCause(e);  // initCause()�� SomeException�� SomeException2�� ��Ӱ��谡 �ƴԿ��� ���� ����
			throw se2;
		}
		
	}
	
	static void exampleMethod() throws Exception {
	}
	
}


class SomeException extends Exception {
	static void method() throws Exception {
		throw new Exception();
	}
	
}

class SomeException2 extends Exception {
	static void method2() throws Exception {
		throw new Exception();
		
	}
	
}
