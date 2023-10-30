package seven;

interface MyInterface {
	
	// 인터페이스의 모든 변수는 상수(public static final)
	// 인터페이스에서는 생성자, 초기화블럭은 사용하지 못하며, 자바언어의 상수는 자동초기화가 안됨
	// 따라서 변수는 명시적 초기화를 꼭 정의해야함
	int a = 0; // 명시적 초기화
	void myMethod();
}

// 인터페이스 간의 상속이 가능함
interface MyInterface2 extends MyInterface{
	void myMethod2();
}

// 클래스, 추상클래스와 인터페이스의 상속은 불가
//class MyClass0 extends MyInterface {}

// 인터페이스의 다중상속(구현)은 가능
abstract class MyClass implements MyInterface, MyInterface2{
	// MyInterface의 상수는 static. 아래의 변수는 일반 상수
	// static이 아닌 일반 상수의 초기화는 static과 다르게 생성자로도 초기화가 가능
	final int a;
	MyClass() { a = 0; }
	
	void myMethod3() {
		// 상수의 지역변수 또한 자동초기화가 되지 않지만, 멤버변수와 다르게 초기화를 하지 않고 선언만 하는 것은 가능함 
		final int localA;
	}
	
}


public class Ex7_11_2 {

	public static void main(String[] args) {
		
	}

}