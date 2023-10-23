package seven;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price/10.0); //명시적 형변환
	}
}

class SmartTv extends Product {
	SmartTv() {
		super(100); //부모 생성자에 인자값을 넘김
	}
	
	public String toString() { return "Tv1"; } //오버라이딩
}

class Preflow extends Product {
	Preflow() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0; //의도전달
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구매");
	}
}


public class Ex7_8 {

	public static void main(String[] args) {
		//Buyer클래스 메서드 호출을 목표로하는 main메서드
		
		//Buyer클래스 메서드 호출을 위한 인스턴스화
		Buyer b = new Buyer();
		
		/*
		첫번째
		SmartTv st = new SmartTv();
		b.buy(st);
		
		두번째
		Product p = new Preflow();
		b.buy(p);
		*/
		
		//세번째
		//인자값으로 객체를 넘김
		b.buy(new SmartTv());
		
		System.out.println("남은 돈 : "+b.money);
		System.out.println("적립된 포인트 : "+b.bonusPoint);
		
	}

}
