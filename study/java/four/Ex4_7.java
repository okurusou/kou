package four;

public class Ex4_7 {

	public static void main(String[] args) {
		
		  int num = 0; double random = 0.0;
		  
		  for (int i = 0; i <= 4; i++) { 
		  		num = (int)(Math.random() * 6 + 1);
		  		System.out.println(num);
		   } 
		 		
			// num�ڸ��� random��, (int)����ȯ�� �����ϸ� �Ǽ������� ��ȯ��
			// �ּ�1 <= num < �ִ�7

		
		/*
		 * int numA = 0, min = 2, max = 5;
		 * 
		 * for (int i = 0; i < 5; i++) { 
		 * 		numA = (int) (Math.random() * (max - min + 1)) + min; 
		 * 		System.out.println(numA);
		 * }
		 */
		// ������ Ȱ���� ������ ���� ���ϱ�
		// min <= numA && numA <= max(Ȥ�� < max + 1)

		
		/*
		 * int min2 = 2, max2 = 5; double random2 = 0.0;
		 * 
		 * 	for (int i = 0; i <= 4; i++) { 
		 * 		random2 = (Math.random() * (max2 - min2)) + min2; 
		 * 		System.out.println(random2); 
		 * }
		 */
			// min <= random2 && random2 < max

	}

}
