package chapter8;

public class Ex8_12_1 {

	public static void main(String[] args) {
		try {
			method1();
			System.out.println("main�޼��忡�� method1()ȣ��");  // ������� ����
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(method2());
		System.out.println(method3());
	}
	
	
	static int method1() throws Exception{
		try {
			System.out.println("method1()ȣ��");
			throw new Exception();
//			return 0;  // try���� ���ܸ� ������ �ʾҴٸ� �ʿ�
		} catch (Exception e) {
			throw e;
//			return 1;  // throw ������ �����̹Ƿ� ����
		} finally {
			System.out.println("finally�� ����"); // finally���� ��� ��쿡�� ����Ǹ� ������, try-catch-finally
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
//        return 40; // �Ұ���
	}
	
	static int method3() {
		try {
			int a = 1/0;
//			throw new ArithmeticException();  // �� ����� ���������� �����Ϸ��� �ٸ��� ������
			return 0;
		} catch (Exception e) {
			return 1;
		} finally {
			
		}
	}
}
