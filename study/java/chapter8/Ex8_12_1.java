package chapter8;

public class Ex8_12_1 {

	public static void main(String[] args) {
		try {
			method1();
			System.out.println("main메서드에서 method1()호출");  // 실행되지 않음
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(method2());
		System.out.println(method3());
	}
	
	
	static int method1() throws Exception{
		try {
			System.out.println("method1()호출");
			throw new Exception();
//			return 0;  // try블럭에 예외를 던지지 않았다면 필요
		} catch (Exception e) {
			throw e;
//			return 1;  // throw 이후의 문장이므로 에러
		} finally {
			System.out.println("finally블럭 실행"); // finally블럭은 어떠한 경우에도 실행되며 순서는, try-catch-finally
		}
	}
	
	public static int method2() {
        try {
            return 10;
        } catch (Exception e) {
            return 30;
        } finally {
            return 20;// no return
        }
//        return 40; // 불가능
	}
	
	static int method3() {
		try {
			int a = 1/0;
//			throw new ArithmeticException();  // 위 문장과 동일하지만 컴파일러는 다르게 감지함
			return 0;
		} catch (Exception e) {
			return 1;
		} finally {
			
		}
	}
}
