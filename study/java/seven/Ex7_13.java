package seven;

public class Ex7_13 {
	// ����Ŭ���� ����
	class InstanceInner{ int bc;}
	static class StaticInner { static class StaticInner2{} }
	
	// ����Ŭ���� ��ü ����. ��Ȯ����, iv�� �����ϰ� ��ü�� ������ 
	// �ν��Ͻ� Ÿ���� ���������� �ν��Ͻ� ��ü�� ���� ����. static�� ��������
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	// iv, cv ������
	int a;
	int b = c;	// cv�� c�� ����
	static int c = b;   // ����. iv�� b�� ����
	static int d = c;
	
	static void staticMethod() {
//		InstanceInner obj1 = new InstanceInner();   // ����. static�޼��忡�� �ν��Ͻ� ��� ����
		StaticInner obj2 = new StaticInner();
		Ex7_13 outer = new Ex7_13();
		InstanceInner obj1 = outer.new InstanceInner();
		
//		StaticInner2 si = new StaticInner2();    // ����
		StaticInner.StaticInner2 si = new StaticInner.StaticInner2();  // �������ڷ� �ּҸ� �����ؾ���
		
	}
	
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner();   // ����. �޼��忡�� ����� ���� Ŭ������ �ش� �޼��� �ܿ��� ���ٺҰ�
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
		InstanceInner obj1 = new InstanceInner();
	}
}


