package seven;

import test.Test12;

public class Ex7_4 {

	public static void main(String[] args) {
		Test12 t = new Test12();
		
		//public 멤버변수 호출
		Test12.a = 1;
		t.b = 2;
		
		/*
		default 멤버변수 호출. 에러
		Test12.c = 3; 
		t.d = 4;
		
		default 멤버메서드 호출. 에러
		Test12.staticMethod();
		t.method();
		*/
		
		// public 메서드 호출
		t.publicMethod();
		
		//메인 메서드 호출. Ex7_4의 String타입 배열의 매개변수를 인자로씀
		t.main(args);
		
		
		
	}

}



