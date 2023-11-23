package seven;

public class Ex7_14 {
	// 내부 클래스에서 외부 클래스의 멤버에 직접적인 접근 스코프를 확인하는 파일
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class instanceinner{
		// 인스턴스 클래스는 외부 클래스의 인스턴스 멤버, static 멤버 모두에 접근 가능
		// 접근제어자가 private이어도 문제없음
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
		// static 클래스는 외부 인스턴스 멤버에 접근은 불가. static 멤버는 가능
//		int siv = outerIv;
		static int scv = outerCv;
		
		// 외부 인스턴스 멤버에 접근은 불가하지만, 클래스 내부에서 정의는 가능함
		int siv;
		// final 키워드로 정의한 상수는 자동초기화가 안된다는 점에 유의
		final int siv2 = 0;
	}
	
	
	// 지역클래스 또한 외부 클래스의 멤버에 접근 가능
	// 지역변수에도 가능하지만 이 때, 지역변수는 상수이어야함
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;  // jdk1.8이후이므로 정상. 컴파일러가 해당 변수에 final 키워드를 자동으로 추가함. 즉 lv는 상수가됨
			int liv4= LV;
			Ex7_14 ex = new  Ex7_14();
			
			// lv가 상수가 됏으므로 이하 메서드는 에러
//			void method() { lv = 1; }
		}
	}
	
	 Ex7_14 ex = new  Ex7_14();
	static void method() {
		// static메서드에서, 지역변수 정의 가능 및 외부 static 멤버에 접근 가능
		int i = outerCv;
		
		// 외부 인스턴스 멤버에 접근은 불가
//		int i2 = outerIv;
		
		// static 변수 정의 또한 불가
//		static int cv2;
		
		// 외부 static 멤버에 접근 가능. static 클래스 또한 포함됨
		StaticInner si = new StaticInner();
		
		// static 메서드는 외부 인스턴스 멤버에 접근은 불가하지만 외부 클래스 인스턴스화는 가능함 
		Ex7_14 ex = new  Ex7_14();
		
		// 외부 인스턴스 멤버의 접근은 불가지만, 내부 인스턴스 클래스는 가능
		instanceinner iiner;
		
		// 생성한 외부 클래스 인스턴스-참조변수를 통해 내부 인스턴스 클래스의 인스턴스를 생성 및 멤버의 접근이 허용
		instanceinner iiner2 = ex.new instanceinner(); // 내부 인스턴스 클래스의 인스턴스화
		iiner2.iiv = 0; // 내부 인스턴스 클래스의 변수에 접근
	}
}
