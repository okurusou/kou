package six;

public class Ex6_8_1 {

	public static void main(String[] args) {
		
		
		//Ex6_8�� ���� ��ȯ������ ��ü�� ���� �����ϴ� �ҽ�����
		//�ӽð�ütmp�� �̿��߰� �������� d2�� ������, d2�� tmp�� �ּҰ��� �����Ͽ� x���� ����ϴ� �ڵ�
		//tmp�� �޼��� ���ο� �����ϹǷ� �޼��尡 ����Ǹ� ���� ���뵵 �Ҹ�������
		//�޼��� ���ο��� ������ ��ü�� �ܺο��� �����Ѵٸ�, �޼��尡 ����ǵ� �� ��ü�� �Ҹ����� �ʰ� ������
		
		Data4 d = new Data4();
		d.x = 10;
		System.out.println(d.x);
		
		Data4 d2 = copy(d);
		System.out.println(d.x);
		System.out.println(d2.x);
		
		
	}
	
	
	static Data4 copy(Data4 y) {
		Data4 tmp = new Data4();
		tmp.x = y.x;
				
		return tmp;
		
	}

}

class Data4 { int x;}
