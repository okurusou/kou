package six;

public class Ex6_3 {

	public static void main(String[] args) {
		
		// CardŬ������ Ŭ���� ������ ���
		System.out.println("Card.width" + Card.width);
		System.out.println("Card.height" + Card.height);
		
		
		// c1, c2��ü ���� �� �ν��Ͻ� ������ �� �Ҵ�
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 2;
		
		// c1, c2�� �ν��Ͻ� �������� Ŭ�������� ���� ���
		System.out.println("c1�� ũ��� " + c1.kind + ", " + c1.number + "ũ��� " + c1.width + ", " + c1.height);
		System.out.println("c2�� ũ��� " + c2.kind + ", " + c2.number + "ũ��� " + c2.width + ", " + c2.height);
		
		c1.width = 50;
		c1.height = 30;
		
		// ��üc1���� Ŭ������������ �����, c1�� c2�� Ŭ�������� ���� ���
		System.out.println("c1�� ũ��� " + c1.kind + ", " + c1.number + "ũ��� " + c1.width + ", " + c1.height);
		System.out.println("c2�� ũ��� " + c2.kind + ", " + c2.number + "ũ��� " + c2.width + ", " + c2.height);
		//Ŭ���������� ��������� ��� ��ü�� �����ϱ⿡ c1���� ���� �����ϸ� c2������ �����
		//c1.width << �̷� ������ Ŭ���� ���� ���� �Ҵ������� ���� ���� ���� �����
		//Card.width << �̷��� �ۼ��ؾ���. ��ó�� �ۼ��� �ν��Ͻ� ������ ������ ���� ����
		
	}

	

}

class Card{
	
	//�ν��Ͻ� ����
	String kind;
	int number;
	
	// Ŭ���� ����
	static int width = 100;
	static int height = 250;
	
	// �� �� ���������	
}
