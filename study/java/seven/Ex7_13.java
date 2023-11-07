package seven;

public class Ex7_13 {
	class InstanceInner{}
	static class StaticInner {}
	
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
//		InstanceInner obj1 = new InstanceInner();   // 에러. static클래스에서 인스턴스 멤버 접근
		StaticInner obj2 = new StaticInner();
		
		Ex7_13 outer = new Ex7_13();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner();   // 에러. 메서드에서 선언된 클래스는 해당 메서드 외에서 접근불가
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}
}

