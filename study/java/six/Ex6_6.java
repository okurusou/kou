package six;

public class Ex6_6 {

	public static void main(String[] args) {
		Data d = new Data();
		
		//d.x�� ��ü�ּҸ� �������� �ʰ� int x��ü�� ����Ŵ. ��ǻ� int x��� ���� ��
		d.x = 10;
		System.out.println("��ü d�� x�� = " + d.x);
		
		change(d.x);	// change�޼��� ��������, ������� �Ű����� x�� 10�� ����ǰ� �۾��η� 1000���� �ٽ� �����. ���� ���
		System.out.println("change�޼��� ���� ������ d.x�� = " + d.x); // d.x�� 1000�� �ƴϰ� 10�� ������� Ȯ��
		
		
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change�޼����� x�� = "+x);
	}

}


class Data { int x;}


