package chapter8;

public class Ex8_8 {

	public static void main(String[] args) {
		// 예외를 던져도 컴파일 단계에서 에러가 아님
		throw new RuntimeException();
	}
	class A {
		// 인덱스 스코프를 초과하는 인덱스에 접근을 시도해도 컴파일 단계에서는 에러가 아님
		int[] arr = new int[5];
		int value = arr[10];
	}
}
