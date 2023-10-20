package seven;

// import test.Test12.publicMethod; //에러. import문은 클래스만 허용됨. 인스턴스변수, 메서드의 독단적인 import는 불가
// 단, static은 가능

// public static변수, 메서드 호출
// *키워드를 정의해 모든 public static멤버를 사용할 수 있음
import static test.Test12.a;	
import static test.Test12.publicStaticMethod;	
//import static test.Test12.main; // 에러. import문으로 main메서드를 호출할 수는 있지만 import static은 안됨
import static test.Test12.*;
// import static test.Test12.c; // 에러. static이라고 다 되는 것이 아님. public이 아니면 불가. << 같은 패키지라면 되긴 함
public class Ex7_5 {

	public static void main(String[] args) {
		
		//Test12클래스의 static멤버 호출
		a = 3;
		publicStaticMethod();
		
		String[] tmp = {"a"};
		/*
		main(tmp); 에러. main메서드 호출은 오로지 import만으로 허용
		
		1. import test.Test12;
		2. Test12.main(tmp); tmp대신 인자로 배열이면 뭐든 상관없음. 매개변수 args도 가능
		위의 절차대로 클래스를 import해서 바로 static을 호출하거나
		
		1. Test12 t = new Test12();
		2. t.main(args);
		이렇게 객체를 생성하는 식으로만 가능하지 
		import static으로 main메서드를 명시적인 호출은 불가
		*/
		
		
	}

}
