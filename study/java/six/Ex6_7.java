package six;

public class Ex6_7 {

	public static void main(String[] args) {
		
		//메서드의 매개변수를 참조변수로 선언, 메서드를 호출해 객체의 멤버변수 값을 제어할 수 있음을 증명하는 소스파일
		//변수d가 가리키는 객체의 멤버변수 x의 값을 change메서드로 변경함 
		
		//x에는 10이 할당됨
		Data2 d = new Data2();
		d.x = 10;
		System.out.println(d.x);
		
		//메서드 change가 실행됨. 인자는 d
		change(d);
		
		//메서드가 소멸되어도 x의 값은 변동됐음의 정보를 제공하는 출력문
		System.out.println(d.x);
		
	}
		//참조변수는 주소값만 저장 됨. d의 주소값이 y에 복사됨으로, y와 d는 같은 객체를 참조함
		//매개변수는 반드시 인자와 같은 타입이어야함. 인자가 매개변수에 복사될 때 같은 타입만이 성립되니까
			// ㄴ 자동형변환을 유도하면 되지만, 참조형과 기본자료형 간의 자동형변환은 불가함. 서로 다른 개념임
		//반환타입은 void. 이 메서드는 반환값을 활용할 필요가 없는, 그저 객체의 멤버변수를 메서드로도 할당할 수 있음을 보여주기 위함인 코드
		//y.x = 1000; 이 문장은 d.x = 1000;과 다름이 없음. y에는 d와 같은 주소값이 들어있으니까
	static void change(Data2 y) {
		y.x = 1000;
		System.out.println(y.x);
	}
}


class Data2 { int x; }
