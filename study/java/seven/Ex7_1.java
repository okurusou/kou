package seven;

public class Ex7_1 {
	 public static void main(String[] args) {
		//상속클래스의 중복된 이름인 멤버의 호출범위 확인

		//p는 부모객체, p3d는 p의 자식객체, t는 p3d의 자식객체
		Point p = new Point();
		Point3d p3d = new Point3d();
		PointTmp t = new PointTmp();
		
		//부모와 자식 클래스의 동일한 인스턴스 변수x 출력
		System.out.println("p.x = " + p.x);
		System.out.println("p3d.x = " + p3d.x);
		
		//부모만이 갖는, 자식만이 갖는 변수의 값출력
		System.out.println("p.y = " + p.y + ", p3d.y = " + p3d.y);
		System.out.println("p3d.z = " + p3d.z); // p.z는 오류임
		
		//오버라이딩 확인
		//this, super키워드 범위 확인
		p3d.pointMethod();
		t.pointMethod();
		
		
	}
}

class Point{
	int x = 1;
	int y;
	void pointMethod() {
		System.out.println("Point, 메서드 실행");
	}
}

class Point3d extends Point{
	int x = 2;
	int z;
	void pointMethod() {
		System.out.println("Point3d, 메서드 실행");
		System.out.println("Point3d, this.x = " + this.x);
		System.out.println("Point3d, this.y = " + this.y);
		System.out.println("Point3d, super.x = " + super.x);
	}
}

class PointTmp extends Point3d{
	void pointMethod() {
		System.out.println("PointTmp, this.x = " + this.x);
		System.out.println("PointTmp, super.x = " + super.x);
		
	}
}