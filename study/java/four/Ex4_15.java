package four;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("���ڸ� �Է��Ͻÿ�");
			input = scanner.nextInt();
			
			if (input<answer) {
				System.out.println("�Է��� ���ڰ� �۽��ϴ�");
			} else if (input>answer) {
				System.out.println("�Է��� ���ڰ� Ů�ϴ�");
			} 
			
		} while (input!=answer);
		System.out.println("��÷!");
		
	}

}
