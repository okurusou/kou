package seven;


public class Ex7_11_1 {

	public static void main(String[] args) {
		Square sq = new Square();
		
		Circle2 c = new Circle2();
		c.getArea(new Circle2());
		
		Circle3 c2 = new Circle3();
		Circle3 c3 = (Circle3)c2.method(); //�ٿ�ĳ����
		Shape2 s = c2.method(); //���������� �ٲ�
		
	}

}


interface Shape { // ���������ڴ� default
	abstract void getArea();
	abstract void getArea2();
	void getArea3(); // abstract��������. �׷��� ���� ����
}

abstract class Circle implements Shape {
	public void getArea() { // public�� ������
	}

	// �߻�Ŭ������ ����� �Ϻ� �޼���-getArea2�� �������� �ʾƵ� ���� 
	
	public void getArea3() {
	}
}

class Square extends Circle{
	public void getArea() {} //�������̵��� ��Ģ
	public void getArea2() {}  // �߻� Ŭ������ Circle�� getArea2�� ���ǵ��� �ʾ���
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