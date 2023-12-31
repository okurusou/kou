package chapter8;

public class Ex8_11_1 {

	public static void main(String[] args) {
        try {
            performOperation(5);
            performOperation(-3);
        } catch (MyException e) {
            System.out.println("예외 메시지 : " + e.getMessage());
            System.out.println("에러 코드 : " + e.getErrCode());
        }
    }

    static void performOperation(int value) throws MyException {
        if (value < 0) {
            throw new MyException("음수는 처리할 수 없음", 200);
        }
        System.out.println("작업 수행 완료 : " + value);
    }

}

class MyException extends Exception {
	private final int ERR_CODE;
	
	MyException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	
	MyException(String msg) {
		this(msg, 100);
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
	
}