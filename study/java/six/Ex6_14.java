package six;

public class Ex6_14 {
	//Ŭ���� �ε��� ������ Ȯ���ϴ� Ŭ����
	//thisŰ������ ������ Ȯ��
	
	//static����
	static int a;
	static int b = 1;
	
	//�ν��Ͻ� ����
	int c;
	int d = 2;
	
	//static��
	static {  System.out.println("static�� ����"); 
	Ex6_14.a = 1;
	a = 1;
//	this.a = 1; ����
	}
	
	//�ν��Ͻ���
	{System.out.println("instance�� ����"); 
	Ex6_14.a = 1;
	a = 1;
	this.a =1;
	}
	
	//������
	Ex6_14() {
	System.out.println("�⺻ ������ ����");
	this.d = 4;
	
	Ex6_14.a = 1; 
	a = 1; 
	this.a = 1;
	}
	
	//�ν��Ͻ��޼���
	void thisScope() {
		Ex6_14.a = 1;
		a = 1;
		this.a = 1;
	}

	//static�޼���
	static void thisScopeStatic() {
		Ex6_14.a = 1;
		a = 1;
//		this.a = 1; ����
	}
	
	
	public static void main(String[] args){
		//main�޼��� ���۹�
		System.out.println("main�޼������");
		
		Ex6_14 t = new Ex6_14();
		System.out.println("d��>" + t.d);
		
	}
}

//�� Ŭ�������� static������ �ߺ�Ȯ��
class StaticDuplication {
	static int a;
//	static int a; ����
//	int a; ����
}
class StaticDuplication2 {
	static int a;
}