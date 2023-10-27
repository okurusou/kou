package seven;


public class Ex7_11_1 {

	public static void main(String[] args) {
		Square sq = new Square();
		
		Circle2 c = new Circle2();
		c.getArea(new Circle2());
		
		Circle3 c2 = new Circle3();
		Circle3 c3 = (Circle3)c2.method(); //다운캐스팅
		Shape2 s = c2.method(); //참조변수만 바꿈
		
	}

}


interface Shape { // 접근제어자는 default
	abstract void getArea();
	abstract void getArea2();
	void getArea3(); // abstract생략가능. 그러나 좋지 않음
}

abstract class Circle implements Shape {
	public void getArea() { // public만 가능함
	}

	// 추상클래스로 선언시 일부 메서드-getArea2를 정의하지 않아도 가능 
	
	public void getArea3() {
	}
}

class Square extends Circle{
	public void getArea() {} //오버라이딩의 규칙
	public void getArea2() {}  // 추상 클래스인 Circle에 getArea2가 정의되지 않았음
	public void getArea3() {}
	
}

class Shape2{}

class Circle2 extends Shape2 {
	void getArea(Shape2 s) {
	}
}

class Circle3 extends Shape2{
	Shape2 method() {
		return new Circle3();
	}
}