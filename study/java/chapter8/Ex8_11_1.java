package chapter8;

public class Ex8_11_1 {

	public static void main(String[] args) {
        try {
            performOperation(5);
            performOperation(-3);
        } catch (MyException e) {
            System.out.println("���� �޽��� : " + e.getMessage());
            System.out.println("���� �ڵ� : " + e.getErrCode());
        }
    }

    static void performOperation(int value) throws MyException {
        if (value < 0) {
            throw new MyException("������ ó���� �� ����", 200);
        }
        System.out.println("�۾� ���� �Ϸ� : " + value);
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