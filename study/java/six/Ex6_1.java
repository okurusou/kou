package six;

public class Ex6_1 {

	public static void main(String[] args) {
		
		// TvŬ������ ��������t ����
		Tv t;
		
		//Tv�ν��Ͻ� ����
		t = new Tv();
		
		
		t.channel = 7;
		t.channelDown();
	}//mainŬ������ ȣ��Ǹ� TvŬ�����κ��� �ν��Ͻ��� �����ϰ� ��������� 7�� �Ҵ�Ǹ� �޼���� ���� 1������

}



// TvŬ����
// ��ü�� �����ϱ� ���� ��������� �޼��尡 ���� �Ǿ�����
class Tv{
	
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}