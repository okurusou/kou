package six;

public class Ex6_8 {

	public static void main(String[] args) {
		
		//리턴을 통해 객체의 멤버변수 값을 변경하는 소스파일
		//값을 바꿀 멤버변수는 변수 d2가 가리키는 객체의 변수 x
		
		//Data3 객체 생성 후 d.x에 10 대입
		Data3 d = new Data3();
		d.x = 10;
		System.out.println(d.x);
		
		//d2에 메서드copy 반환값을 대입
		//참조변수 d의 타입은 Data3. 참조변수에 대입가능한 값은 '같은 타입의 참조변수'만 허용
		//메서드copy 매개변수에 Data3 d의 값을 복사하는 것이니, 매개변수 또한 Data3타입이어함
				
		//lvalue의 참조변수 d2는 아무 값도 없는 선언만한 상태지만, rvalue인 메서드copy에 인자d를 넣어 실행해 반환값은 객체d를 가리키고
		//그 반환값을 d2에 대입함으로서 d2는 d와 같은 객체를 참조함
		Data3 d2 = copy(d);
		System.out.println(d2.x);
	}
	
		//return을 사용하므로 반환타입은 void이 올 수 없음
			//return문이 곧 반환값이므로, return값의 타입과 반환타입은 일치해야하며, 이윽고 d2에 할당하므로 d2의 타입과도 일치해야함 
		//매개변수 타입도 인자의 타입과 동일해야하므로 Data3로 선언
		//즉, 인자타입==매개변수타입, 반환타입==리턴값은 일종의 공식
	static Data3 copy(Data3 y) { //y에 d의 주소값이 복사됨으로, y와 d는 같은 객체를 조작할 수 있게됨
		y.x = 100;	//y.x == d.x
		
		return y;	// 결과값인 y의 주소값(d의 주소값과 동일)이 반환됨
	}

}

class Data3 { int x;}
