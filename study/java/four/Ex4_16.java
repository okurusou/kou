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
		//break���� Ȱ���� 1���� ����� ���� 100�̻��� �Ǵ��� �˾Ƴ��� 
		
		
	
		int sumB = 0, iB = 0;
		
		while (sumB<100) {
			sumB += ++iB;
		}
		System.out.printf("iB=%d %nsumB=%d", iB, sumB);
		// �� break���� ����
	}
	
}
