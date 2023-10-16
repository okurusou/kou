package six;

public class Ex6_14 {
	//클래스 로드의 순서를 확인하는 클래스
	//this키워드의 범위를 확인
	
	//static변수
	static int a;
	static int b = 1;
	
	//인스턴스 변수
	int c;
	int d = 2;
	
	//static블럭
	static {  System.out.println("static블럭 실행"); 
	Ex6_14.a = 1;
	a = 1;
//	this.a = 1; 오류
	}
	
	//인스턴스블럭
	{System.out.println("instance블럭 실행"); 
	Ex6_14.a = 1;
	a = 1;
	this.a =1;
	}
	
	//생성자
	Ex6_14() {
	System.out.println("기본 생성자 실행");
	this.d = 4;
	
	Ex6_14.a = 1; 
	a = 1; 
	this.a = 1;
	}
	
	//인스턴스메서드
	void thisScope() {
		Ex6_14.a = 1;
		a = 1;
		this.a = 1;
	}

	//static메서드
	static void thisScopeStatic() {
		Ex6_14.a = 1;
		a = 1;
//		this.a = 1; 에러
	}
	
	
	public static void main(String[] args){
		//main메서드 시작문
		System.out.println("main메서드실행");
		
		Ex6_14 t = new Ex6_14();
		System.out.println("d값>" + t.d);
		
	}
}

//각 클래스간의 static변수의 중복확인
class StaticDuplication {
	static int a;
//	static int a; 오류
//	int a; 오류
}
class StaticDuplication2 {
	static int a;
}