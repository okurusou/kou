package seven;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price/10.0); //����� ����ȯ
	}
}

class SmartTv extends Product {
	SmartTv() {
		super(100); //�θ� �����ڿ� ���ڰ��� �ѱ�
	}
	
	public String toString() { return "Tv1"; } //�������̵�
}

class Preflow extends Product {
	Preflow() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0; //�ǵ�����
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ׺���");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "�� ����");
	}
}


public class Ex7_8 {

	public static void main(String[] args) {
		//BuyerŬ���� �޼��� ȣ���� ��ǥ���ϴ� main�޼���
		
		//BuyerŬ���� �޼��� ȣ���� ���� �ν��Ͻ�ȭ
		Buyer b = new Buyer();
		
		/*
		ù��°
		SmartTv st = new SmartTv();
		b.buy(st);
		
		�ι�°
		Product p = new Preflow();
		b.buy(p);
		*/
		
		//����°
		//���ڰ����� ��ü�� �ѱ�
		b.buy(new SmartTv());
		
		System.out.println("���� �� : "+b.money);
		System.out.println("������ ����Ʈ : "+b.bonusPoint);
		
	}

}
