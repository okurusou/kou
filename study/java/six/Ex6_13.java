package six;

class Car2 {
	String color;
	String gearType;
	int door;
	
	//첫번째 생성자
	//new연산자에 아무 값도 전달하지 않으면 아래 생성자로 초기화
	Car2() {
		this("white", "auto", 4);	//this()키워드는 생성자를 호출함. 이 문장에는 2개의 문자열 리터럴과 숫자리터얼이 이어지므로 세번째의 생성자를 호출
	}
	
	//두번째 생성자
	//하나의 문자열값을 인자를 통해 매개변수에 복사를 시도하면 아래 생성자로 초기화
	Car2(String color){
		this(color, "auto", 4);
	}
	
	//세번째 생성자
	//2개의 문자열과 숫자를 전달할 시 아래 생성자로 초기화. 순서, 타입, 갯수가 모두 일치해야함
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
}



public class Ex6_13 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("Blue");	//문자열리터럴 하나를 전달하니 두번째 생성자를 실행
		
		System.out.printf("c1.color = %s, c1.gearType = %s, c1.door = %d%n", c1.color, c1.gearType, c1.door);
		System.out.printf("c2.color = %5s, c2.gearType = %s, c2.door = %d", c2.color, c2.gearType, c2.door);
	}

}
