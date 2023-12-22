package chapter8;

public class Ex8_2 {

	public static void main(String[] args) {
		System.out.println(1);
//		System.out.println(0/0);  // 해당 문장을 실행하면 ArithmeticException 예외가 발생. console에서 확인가능
		try {
			System.out.println(2);
			System.out.println(0/0); // ArithmeticException예외 발생. catch문이 실행됨
			System.out.println(3);	// 해당 문장은 실행되지 않음
		} catch (ArithmeticException ae) { 
			// ArithmeticException클래스는 Exception의 하위 클래스이므로 (Exception e)로 정의해도 무방함
			System.out.println(4);
		}
		System.out.println(5);
	}

}
