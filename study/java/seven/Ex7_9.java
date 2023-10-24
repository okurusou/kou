package seven;

class Product2 {
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
	Product2() {}
}

class Tv2 extends Product2 {
	Tv2() { super(100); }
	public String toString() { return "Tv";}
}

class Computer2 extends Product2 {
	Computer2() { super(200); }
	public String toString() { return "Computer";}
}

class Audio2 extends Product2 {
	Audio2() { super(500); }
	public String toString() { return "Audio";}
}

class Buyer2 {
	int money = 10000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];
	int i = 0;
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("�ܾ׺���");
			return;
		} else if(i==10) {
			System.out.println("���ŷ� �ʰ�");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p; 
		System.out.println(p+" ���ſϷ�");
	}
	
	void summary() {
		int sum = 0;
		String cartlist = "";
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i] == null) break;
			sum += cart[i].price;
			cartlist += (i==0) ? "" + cart[i] : ", " + cart[i];
		}
		System.out.println("�� ���űݾ� : " + sum);
		System.out.println("�� ���Ż�ǰ : " + cartlist);
	}
	
}


public class Ex7_9 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		b.buy(new Audio2());
		b.buy(new Computer2());
		b.buy(new Tv2());
		b.summary();

	}

}
