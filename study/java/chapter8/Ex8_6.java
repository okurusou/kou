package chapter8;

public class Ex8_6 {

	public static void main(String[] args) {
		Exception e1 = new Exception();		// catch블럭의 참조변수 또한 지역변수이므로 변수명의 중복 불가
		try {
			throw new Exception("A");  // throw e1; << 같은 문장임
//			throw new CustomException();   // 에러
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
	}
}

class CustomException extends Exception{}