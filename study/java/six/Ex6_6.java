package six;

public class Ex6_6 {

	public static void main(String[] args) {
		Data d = new Data();
		
		//d.x는 객체주소를 저장하지 않고 int x자체를 가리킴. 사실상 int x라고 봐도 됨
		d.x = 10;
		System.out.println("객체 d의 x값 = " + d.x);
		
		change(d.x);	// change메서드 실행으로, 선언부의 매개변수 x에 10이 저장되고 작업부로 1000으로 다시 저장됨. 이후 출력
		System.out.println("change메서드 실행 이후의 d.x값 = " + d.x); // d.x는 1000이 아니고 10이 저장됨을 확인
		
		
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change메서드의 x값 = "+x);
	}

}


class Data { int x;}


