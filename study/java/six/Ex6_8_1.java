package six;

public class Ex6_8_1 {

	public static void main(String[] args) {
		
		
		//Ex6_8과 같은 반환값으로 객체의 값을 변경하는 소스파일
		//임시객체tmp를 이용했고 참조변수 d2를 선언해, d2에 tmp의 주소값을 참조하여 x값을 출력하는 코드
		//tmp가 메서드 내부에 존재하므로 메서드가 종료되면 블럭의 내용도 소멸하지만
		//메서드 내부에서 생성한 객체를 외부에서 참조한다면, 메서드가 종료되도 그 객체는 소멸하지 않고 유지됨
		
		Data4 d = new Data4();
		d.x = 10;
		System.out.println(d.x);
		
		Data4 d2 = copy(d);
		System.out.println(d.x);
		System.out.println(d2.x);
		
		
	}
	
	
	static Data4 copy(Data4 y) {
		Data4 tmp = new Data4();
		tmp.x = y.x;
				
		return tmp;
		
	}

}

class Data4 { int x;}
