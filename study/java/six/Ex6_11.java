package six;



class Data_1{
	int value;
}

class Data_2{
	int value;
	
	Data_2(int x){
		value = x;
	}
	
//	Data_2() {}
	
}

public class Ex6_11 {

	public static void main(String[] args) {
		
		Data_1 d1 = new Data_1();
		// �����߻�. �⺻�ʱ�ȭ�� �䱸�� ����������, �ν��Ͻ� ���� value�� ������ ������ �ʱ�ȭ�� �Ұ���
//		Data_2 d2 = new Data_2(); 
		
		// �Ű�����x�� ���� ���ͷ��� ������ value�� �ʱ�ȭ�ϰų� Data_2() {}�� �����ϸ� ��
		Data_2 d2 = new Data_2(10);
		System.out.println(d2.value);

	}

}



