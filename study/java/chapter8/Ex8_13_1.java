package chapter8;

public class Ex8_13_1 {
	
	public static void main(String[] args) throws SomeException2  {  // Excpetion과도 대응
		SomeException se = new SomeException();   // 예외 메서드가 
//		exampleMethod();   // 예외 선언한 메서드 호출시, 메서드의 작업부 내용이 무엇이든 try-catch를 하거나 같은 예외선언을 해야함
		try {
			se.method();
		} catch (Exception e) {
			SomeException2 se2 = new SomeException2();
			se2.initCause(e);  // initCause()는 SomeException과 SomeException2가 상속관계가 아님에도 참조 가능
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
