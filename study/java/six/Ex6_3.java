package six;

public class Ex6_3 {

	public static void main(String[] args) {
		
		// Card클래스의 클래스 변수값 출력
		System.out.println("Card.width" + Card.width);
		System.out.println("Card.height" + Card.height);
		
		
		// c1, c2객체 생성 후 인스턴스 변수에 값 할당
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 2;
		
		// c1, c2의 인스턴스 변수값과 클래스변수 값을 출력
		System.out.println("c1의 크기는 " + c1.kind + ", " + c1.number + "크기는 " + c1.width + ", " + c1.height);
		System.out.println("c2의 크기는 " + c2.kind + ", " + c2.number + "크기는 " + c2.width + ", " + c2.height);
		
		c1.width = 50;
		c1.height = 30;
		
		// 객체c1으로 클래스변수값을 출력후, c1과 c2의 클래스변수 값을 출력
		System.out.println("c1의 크기는 " + c1.kind + ", " + c1.number + "크기는 " + c1.width + ", " + c1.height);
		System.out.println("c2의 크기는 " + c2.kind + ", " + c2.number + "크기는 " + c2.width + ", " + c2.height);
		//클래스변수의 저장공간은 모든 객체가 공유하기에 c1에서 값을 변경하면 c2에서도 변경됨
		//c1.width << 이런 식으로 클래스 변수 값을 할당했지만 별로 좋지 않은 방식임
		//Card.width << 이렇게 작성해야함. 위처럼 작성시 인스턴스 변수로 오인할 수가 있음
		
	}

	

}

class Card{
	
	//인스턴스 변수
	String kind;
	int number;
	
	// 클래스 변수
	static int width = 100;
	static int height = 250;
	
	// 둘 다 멤버변수임	
}
