package four;

public class Ex4_16 {

	public static void main(String[] args) {
		int sumA = 0, iA = 0;
		
		while (true) {
			if (sumA>100) {
				break;
			}
			sumA += ++iA;
		} 
		System.out.println("iA="+iA);
		System.out.println("sumA="+sumA+"\n");
		//break문을 활용한 1부터 몇까지 합해 100이상이 되는지 알아내기 
		
		
	
		int sumB = 0, iB = 0;
		
		while (sumB<100) {
			sumB += ++iB;
		}
		System.out.printf("iB=%d %nsumB=%d", iB, sumB);
		// 위 break문과 같음
	}
	
}
