package six;


public class Ex6_10 {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("��� : " + mm.add(3,3));
		System.out.println("��� : " + mm.add(3,3L));
		System.out.println("��� : " + mm.add(3L,3));
		System.out.println("��� : " + mm.add(3L,3L));
		// ��½� "���"�� ���� ������ �ʰ� �޼��峻 print���� ���� ó����, ��ȯ���� ���߿� ����
		// println�޼��忡�� mm.add(3,3)�� ȣ��Ǿ� �޼����� print���� ����ǰ�
		// ��ȯ���� "��� : "�� ���յǴ� �����
		
		
		int[] a = {100, 200, 300};
		// �Ű������� �迭�� ��� ���ڷδ� �迭ȭ�� ���� Ȥ�� ���ڸ��ͷ��� �״�� �ִ´� mm.add(100, 200) ó��
		System.out.println("��� : " + mm.add(a));  
		
		
	}
}

class MyMath3{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a + b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a + b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length; i++)
			result += a[i];
		return result;
	}
}