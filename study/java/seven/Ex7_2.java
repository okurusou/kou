package seven;

public class Ex7_2 {

	public static void main(String[] args) {
		Child c = new Child();
		
		c.method();
	}

}


class Parent{
	int x;
	int y;
	
	Parent() {}
	Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Child extends Parent{
	int x = 1;
	int z;
	void method() {
		System.out.println("x : " + x); // �ڼ�
		System.out.println("this.x : " + this.x); // �ڼ�
		System.out.println("super.x : " + super.x); // ����
		
		System.out.println("\ny : " + y); // ����
		System.out.println("this.y : " + this.y); // ����
		System.out.println("super.y : " + super.y); // ����
//		System.out.println(super.z); ����. super�� ���� ȣ����
		//thisŰ����� ������ ȣ���� �ڼպ��� ȣ����
	}
	
	Child() {}
	Child(int x, int y, int z) {
		//������ ������ Parent(int x, int y)�� �ڼ��� super()�� ���� ȣ����. �����ڰ� �ڼտ��� ��ӵǴ� �� �ƴԿ� ����
		super(x,y);	
		this.z = z;
		}
		
}