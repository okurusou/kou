package seven;

interface MyInterface3 {}
interface MyInterface4 {}
abstract class MyClass2 implements MyInterface4{}

//클래스 하나에 추상메서드를 상속하고 다수의 인터페이스를 구현할 수 있음
class MyClass3 extends MyClass2 implements MyInterface3, MyInterface4 {}


//인터페이스 자체는 접근제어자가 default지만 그 안의 멤버는 public으로 고정됨 - 디폴트 메서드 제외
interface MyInterface5 {
	 void methodA();
	 void methodB();
}

abstract class MyClass4 implements MyInterface5{
	
	//추상 클래스에 일반 메서드를 정의할 수 있고, 실제로도 그런 이유로 추상클래스를 사용하지만
	//추상 메서드가 아닌 일반 메서드를 너무 많이 정의하다간 추상화가 낮아짐
	//또한 추상 클래스에 추상 메서드가 없다면 추상 클래스는 의미가 없음
	//단, 추상 클래스가 인터페이스를 구현한다면 인터페이스의 추상 메서드를 일부만 구현하는 용도로 사용할 수 있음 // 31line
	void method1() {}
	void method2() {}
	void method3() {}
	
	//인터페이스의 추상 메서드를 오버라이딩 할 때는, 접근제어자 public을 붙여야함
	public void methodA() {} 
	
}

class MyClass5 extends MyClass4 {
	//MyClass5는 MyClass4의 모든 멤버를 상속받음. MyInterface5 또한 상속받게 됨
	//MyClass4에서 methodA를 구현했지만 methodB는 구현하지 않았음
	//따라서 해당 클래스에서 methodB를 오버라이딩 하지 않으면 에러
	public void methodB() {} 
}



public class Ex7_11_3 {

	public static void main(String[] args) {

	}

}
