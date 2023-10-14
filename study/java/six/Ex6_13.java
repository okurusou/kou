package six;

class Car2 {
	String color;
	String gearType;
	int door;
	
	//ù��° ������
	//new�����ڿ� �ƹ� ���� �������� ������ �Ʒ� �����ڷ� �ʱ�ȭ
	Car2() {
		this("white", "auto", 4);	//this()Ű����� �����ڸ� ȣ����. �� ���忡�� 2���� ���ڿ� ���ͷ��� ���ڸ��;��� �̾����Ƿ� ����°�� �����ڸ� ȣ��
	}
	
	//�ι�° ������
	//�ϳ��� ���ڿ����� ���ڸ� ���� �Ű������� ���縦 �õ��ϸ� �Ʒ� �����ڷ� �ʱ�ȭ
	Car2(String color){
		this(color, "auto", 4);
	}
	
	//����° ������
	//2���� ���ڿ��� ���ڸ� ������ �� �Ʒ� �����ڷ� �ʱ�ȭ. ����, Ÿ��, ������ ��� ��ġ�ؾ���
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
}



public class Ex6_13 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("Blue");	//���ڿ����ͷ� �ϳ��� �����ϴ� �ι�° �����ڸ� ����
		
		System.out.printf("c1.color = %s, c1.gearType = %s, c1.door = %d%n", c1.color, c1.gearType, c1.door);
		System.out.printf("c2.color = %5s, c2.gearType = %s, c2.door = %d", c2.color, c2.gearType, c2.door);
	}

}
