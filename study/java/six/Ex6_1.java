package six;

public class Ex6_1 {

	public static void main(String[] args) {
		
		// Tv클래스의 참조변수t 선언
		Tv t;
		
		//Tv인스턴스 생성
		t = new Tv();
		
		
		t.channel = 7;
		t.channelDown();
	}//main클래스가 호출되면 Tv클래스로부터 인스턴스를 생성하고 멤버변수에 7이 할당되며 메서드로 값이 1감소함

}



// Tv클래스
// 객체를 생성하기 위한 멤버변수와 메서드가 정의 되어있음
class Tv{
	
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}