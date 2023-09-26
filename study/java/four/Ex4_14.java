package four;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.println("숫자를 입력하시오>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		// nextInt를 활용하면 바로 정수형만 받을 수 있지만. 예외처리에 있어서 Stirng으로 받아 int로 형변환하는 편이 더 낫다
		// 이 문에서는 따로 예외처리하지는 않았음
		num = Integer.parseInt(tmp);

		
		while(num!=0) {
			
			sum += num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			num /= 10;
		}
		System.out.println("각 자리수의 합 : "+sum);
	}

}
