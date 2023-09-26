package four;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("숫자를 입력하시오");
			input = scanner.nextInt();
			
			if (input<answer) {
				System.out.println("입력한 숫자가 작습니다");
			} else if (input>answer) {
				System.out.println("입력한 숫자가 큽니다");
			} 
			
		} while (input!=answer);
		System.out.println("당첨!");
		
	}

}
