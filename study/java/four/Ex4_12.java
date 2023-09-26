package four;

public class Ex4_12 {

	public static void main(String[] args) {
		int i = 1; // 초기화
		
		while (i<5) { // 조건문
			System.out.print(i); // 이하의 블럭은 반복됨
			i++; // 증감식
			int a = 1; // 블럭 밖을 벗어나면 제거됨을 확인하는 변수
		}
		System.out.println("\n"+i); // while문 밖의 변수 i를 while문의 블럭에서 증감했으나 할당된 값은 유지됨 
		/*
		 * System.out.println(a); 
		 * 위 문장은 오류발생. 변수 a는 while문 안에서만 존재함
		 */
		
		int a = 5; // 윗 while문의 int타입의 a와 겹치지만 초기화 가능. 하지만 가독성의 이유로 가급적 삼갈 것
		while (a-- !=0) {
			System.out.print(a);
		}System.out.println();
		//후위연산자인 이유로 4~0까지 출력
		
		int b = 5; 
		while (--b !=0) {
			System.out.print(b);
		}
		// 전위연산자인 이유로 4~1까지만 출력함
		
	}

}
