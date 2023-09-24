package four;

import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
	System.out.println("현재 월을 입력하시오");
		
	Scanner scanner = new Scanner(System.in);
	int input = scanner.nextInt();
	
	int month = (1 <= input && input <= 12) ? input : 0 ;
	// input에 할당되는 값이 1~12라면 month에도 1~12 값이 할당
	// 그 외의 숫자라면 0이 할당
	
	switch (month) {
		case 3 :	// 아무 내용이 없어도 가능
		case 4 :
		case 5 :
			System.out.println("현재 계절은 봄");
			break;	// break를 받아 switch에서 탈출
		case 6 :	case 7:		case 8 :	// 한줄로 작성해도 가능
			System.out.println("현재 계절은 여름");
			break;
		case 9 :	case 10:		case 11 :
			System.out.println("현재 계절은 가을");
			break;
		case 12 :	case 1:		case 2 :
			System.out.println("현재 계절은 겨울");
			break;
		default :	// 1~12가 아닌 수를 받으면 실행할 문
			System.out.println("잘못 입렸했습니다");
		}
	
	
	}

}
