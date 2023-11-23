package seven;

public class Ex7_14 {
	// ���� Ŭ�������� �ܺ� Ŭ������ ����� �������� ���� �������� Ȯ���ϴ� ����
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class instanceinner{
		// �ν��Ͻ� Ŭ������ �ܺ� Ŭ������ �ν��Ͻ� ���, static ��� ��ο� ���� ����
		// ���������ڰ� private�̾ ��������
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
		// static Ŭ������ �ܺ� �ν��Ͻ� ����� ������ �Ұ�. static ����� ����
//		int siv = outerIv;
		static int scv = outerCv;
		
		// �ܺ� �ν��Ͻ� ����� ������ �Ұ�������, Ŭ���� ���ο��� ���Ǵ� ������
		int siv;
		// final Ű����� ������ ����� �ڵ��ʱ�ȭ�� �ȵȴٴ� ���� ����
		final int siv2 = 0;
	}
	
	
	// ����Ŭ���� ���� �ܺ� Ŭ������ ����� ���� ����
	// ������������ ���������� �� ��, ���������� ����̾����
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;  // jdk1.8�����̹Ƿ� ����. �����Ϸ��� �ش� ������ final Ű���带 �ڵ����� �߰���. �� lv�� �������
			int liv4= LV;
			Ex7_14 ex = new  Ex7_14();
			
			// lv�� ����� �����Ƿ� ���� �޼���� ����
//			void method() { lv = 1; }
		}
	}
	
	 Ex7_14 ex = new  Ex7_14();
	static void method() {
		// static�޼��忡��, �������� ���� ���� �� �ܺ� static ����� ���� ����
		int i = outerCv;
		
		// �ܺ� �ν��Ͻ� ����� ������ �Ұ�
//		int i2 = outerIv;
		
		// static ���� ���� ���� �Ұ�
//		static int cv2;
		
		// �ܺ� static ����� ���� ����. static Ŭ���� ���� ���Ե�
		StaticInner si = new StaticInner();
		
		// static �޼���� �ܺ� �ν��Ͻ� ����� ������ �Ұ������� �ܺ� Ŭ���� �ν��Ͻ�ȭ�� ������ 
		Ex7_14 ex = new  Ex7_14();
		
		// �ܺ� �ν��Ͻ� ����� ������ �Ұ�����, ���� �ν��Ͻ� Ŭ������ ����
		instanceinner iiner;
		
		// ������ �ܺ� Ŭ���� �ν��Ͻ�-���������� ���� ���� �ν��Ͻ� Ŭ������ �ν��Ͻ��� ���� �� ����� ������ ���
		instanceinner iiner2 = ex.new instanceinner(); // ���� �ν��Ͻ� Ŭ������ �ν��Ͻ�ȭ
		iiner2.iiv = 0; // ���� �ν��Ͻ� Ŭ������ ������ ����
	}
}
