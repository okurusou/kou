package chapter8;

public class Ex8_1 {

	public static void main(String[] args) {
		System.out.println(1);
		try {  // try블럭의 문장에 예외가 발생되지 않는다면 catch문은 생략됨
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) { // try블럭의 println문에 예외가 발생되지 않았으므로 해당 블럭은 생략됨
			System.out.println(4);
		} // try-catch문 종료
		System.out.println(5);
	}

}
