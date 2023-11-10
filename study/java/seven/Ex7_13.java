package seven;

public class Ex7_13 {
	// 내부클래스 선언
	class InstanceInner{ int bc;}
	static class StaticInner { static class StaticInner2{} }
	
	// 내부클래스 객체 생성. 정확히는, iv를 선언하고 객체를 참조함 
	// 인스턴스 타입의 참조변수는 인스턴스 객체만 참조 가능. static도 마찬가지
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	// iv, cv 스코프
	int a;
	int b = c;	// cv인 c를 대입
	static int c = b;   // 에러. iv인 b를 대입
	static int d = c;
	
	static void staticMethod() {
//		InstanceInner obj1 = new InstanceInner();   // 에러. static메서드에서 인스턴스 멤버 접근
		StaticInner obj2 = new StaticInner();
		Ex7_13 outer = new Ex7_13();
		InstanceInner obj1 = outer.new InstanceInner();
		
//		StaticInner2 si = new StaticInner2();    // 에러
		StaticInner.StaticInner2 si = new StaticInner.StaticInner2();  // 점연산자로 주소를 지정해야함
		
	}
	
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner();   // 에러. 메서드에서 선언된 지역 클래스는 해당 메서드 외에서 접근불가
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
		InstanceInner obj1 = new InstanceInner();
	}
}


