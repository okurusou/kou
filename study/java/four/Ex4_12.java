package four;

public class Ex4_12 {

	public static void main(String[] args) {
		int i = 1; // �ʱ�ȭ
		
		while (i<5) { // ���ǹ�
			System.out.print(i); // ������ ���� �ݺ���
			i++; // ������
			int a = 1; // �� ���� ����� ���ŵ��� Ȯ���ϴ� ����
		}
		System.out.println("\n"+i); // while�� ���� ���� i�� while���� ������ ���������� �Ҵ�� ���� ������ 
		/*
		 * System.out.println(a); 
		 * �� ������ �����߻�. ���� a�� while�� �ȿ����� ������
		 */
		
		int a = 5; // �� while���� intŸ���� a�� ��ġ���� �ʱ�ȭ ����. ������ �������� ������ ������ �ﰥ ��
		while (a-- !=0) {
			System.out.print(a);
		}System.out.println();
		//������������ ������ 4~0���� ���
		
		int b = 5; 
		while (--b !=0) {
			System.out.print(b);
		}
		// ������������ ������ 4~1������ �����
		
	}

}
