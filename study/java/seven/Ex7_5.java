package seven;

// import test.Test12.publicMethod; //����. import���� Ŭ������ ����. �ν��Ͻ�����, �޼����� �������� import�� �Ұ�
// ��, static�� ����

// public static����, �޼��� ȣ��
// *Ű���带 ������ ��� public static����� ����� �� ����
import static test.Test12.a;	
import static test.Test12.publicStaticMethod;	
//import static test.Test12.main; // ����. import������ main�޼��带 ȣ���� ���� ������ import static�� �ȵ�
import static test.Test12.*;
// import static test.Test12.c; // ����. static�̶�� �� �Ǵ� ���� �ƴ�. public�� �ƴϸ� �Ұ�. << ���� ��Ű����� �Ǳ� ��
public class Ex7_5 {

	public static void main(String[] args) {
		
		//Test12Ŭ������ static��� ȣ��
		a = 3;
		publicStaticMethod();
		
		String[] tmp = {"a"};
		/*
		main(tmp); ����. main�޼��� ȣ���� ������ import������ ���
		
		1. import test.Test12;
		2. Test12.main(tmp); tmp��� ���ڷ� �迭�̸� ���� �������. �Ű����� args�� ����
		���� ������� Ŭ������ import�ؼ� �ٷ� static�� ȣ���ϰų�
		
		1. Test12 t = new Test12();
		2. t.main(args);
		�̷��� ��ü�� �����ϴ� �����θ� �������� 
		import static���� main�޼��带 ������� ȣ���� �Ұ�
		*/
		
		
	}

}
