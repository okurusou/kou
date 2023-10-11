package six;


public class Ex6_10 {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("결과 : " + mm.add(3,3));
		System.out.println("결과 : " + mm.add(3,3L));
		System.out.println("결과 : " + mm.add(3L,3));
		System.out.println("결과 : " + mm.add(3L,3L));
		// 출력시 "결과"가 먼저 나오질 않고 메서드내 print문이 가장 처음에, 반환값은 나중에 나옴
		// println메서드에서 mm.add(3,3)이 호출되어 메서드의 print문이 실행되고
		// 반환값이 "결과 : "와 결합되는 방식임
		
		
		int[] a = {100, 200, 300};
		// 매개변수가 배열인 경우 인자로는 배열화된 변수 혹은 숫자리터럴을 그대로 넣는다 mm.add(100, 200) 처럼
		System.out.println("결과 : " + mm.add(a));  
		
		
	}
}

class MyMath3{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a + b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a + b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length; i++)
			result += a[i];
		return result;
	}
}