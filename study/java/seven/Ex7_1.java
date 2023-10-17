package seven;

public class Ex7_1 {
	 public static void main(String[] args) {
		//���Ŭ������ �ߺ��� �̸��� ����� ȣ����� Ȯ��

		//p�� �θ�ü, p3d�� p�� �ڽİ�ü, t�� p3d�� �ڽİ�ü
		Point p = new Point();
		Point3d p3d = new Point3d();
		PointTmp t = new PointTmp();
		
		//�θ�� �ڽ� Ŭ������ ������ �ν��Ͻ� ����x ���
		System.out.println("p.x = " + p.x);
		System.out.println("p3d.x = " + p3d.x);
		
		//�θ��� ����, �ڽĸ��� ���� ������ �����
		System.out.println("p.y = " + p.y + ", p3d.y = " + p3d.y);
		System.out.println("p3d.z = " + p3d.z); // p.z�� ������
		
		//�������̵� Ȯ��
		//this, superŰ���� ���� Ȯ��
		p3d.pointMethod();
		t.pointMethod();
		
		
	}
}

class Point{
	int x = 1;
	int y;
	void pointMethod() {
		System.out.println("Point, �޼��� ����");
	}
}

class Point3d extends Point{
	int x = 2;
	int z;
	void pointMethod() {
		System.out.println("Point3d, �޼��� ����");
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