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
		System.out.println("x : " + x); // 자손
		System.out.println("this.x : " + this.x); // 자손
		System.out.println("super.x : " + super.x); // 조상
		
		System.out.println("\ny : " + y); // 조상
		System.out.println("this.y : " + this.y); // 조상
		System.out.println("super.y : " + super.y); // 조상
//		System.out.println(super.z); 에러. super는 조상만 호출함
		//this키워드와 보통의 호출은 자손부터 호출함
	}
	
	Child() {}
	Child(int x, int y, int z) {
		//조상의 생성자 Parent(int x, int y)를 자손이 super()를 통해 호출함. 생성자가 자손에게 상속되는 건 아님에 유의
		super(x,y);	
		this.z = z;
		}
		
}