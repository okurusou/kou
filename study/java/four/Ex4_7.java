package four;

public class Ex4_7 {

	public static void main(String[] args) {
		
		  int num = 0; double random = 0.0;
		  
		  for (int i = 0; i <= 4; i++) { 
		  		num = (int)(Math.random() * 6 + 1);
		  		System.out.println(num);
		   } 
		 		
			// num자리에 random을, (int)형변환을 삭제하면 실수형으로 반환함
			// 최소1 <= num < 최대7

		
		/*
		 * int numA = 0, min = 2, max = 5;
		 * 
		 * for (int i = 0; i < 5; i++) { 
		 * 		numA = (int) (Math.random() * (max - min + 1)) + min; 
		 * 		System.out.println(numA);
		 * }
		 */
		// 변수를 활용한 정수형 난수 구하기
		// min <= numA && numA <= max(혹은 < max + 1)

		
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
