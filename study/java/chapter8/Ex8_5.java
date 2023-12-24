package chapter8;

public class Ex8_5 {

	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			System.out.println(2);
			System.out.println(0/0);
			System.out.println(3);
		} catch (ArithmeticException ae) {
		ae.printStackTrace();
		System.out.println("예외메시지 : " + ae.getMessage());
		}
		System.out.println(5);
	}

}

