package five;

public class Ex5_5 {

	public static void main(String[] args) {
		
		
		/*
		 * �ζ� ��ȣ �����
		 * 1. �� 6���� ���� ���� ���			/ Math.random()
		 * 2. �ߺ��� �Ұ�					/ �迭, �ڸ��ٲٱ�
		 * 3. ���� ������ ū������ �������		/ Arrays.sort
		 * 
		 * �迭 ����
		 * �迭�� �Ϸ��� �� �Ҵ�
		 * ����� ���ΰ��� �����ϰ� �ڸ� �ٲٱ�
		 * �ε���0~5���� ���  
		 */
		
		
		//�迭 ����
		int[] ball = new int[45];
		
		//45���� ��ҿ� �Ϸ��� 1~45���� �Ҵ�
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		
		// �迭ball�� ��ҿ� ����� 1~45�� ��Ұ��� ������ ��Ұ��� �����ϰ� ���� �ٲٱ�
		// 1. 6���� ����ϸ� �ǹǷ� �ε���0~5���� ����
		// 2. ball[0]~ball[5]�� 1~45�� �������� �Ҵ�
		// 3. ball[0]~ball[44]�� 1~45�� ���� �Ҵ�� �����̹Ƿ�, ���� ���ΰ��� �ٲٸ� ����
		// 4. ���Ը� �ص� �������� ����ǳ� ���� ���� �ٲٴ� ������, �ߺ������� ����
		for(int i=0;i<6;i++) {
			
			//ball[0]~ball[5]�� ���� �ٲ� ������ �ε�����ȣ ����
			int j = (int)(Math.random()*45);
			// �ڸ� �ٲ޿� ����� �ӽú��� ���� �� �ʱ�ȭ
			int tmp=0;
			
			//for���� ���ǽĿ� ���� i���� 0~5. �� ball[0]~ball[5]
			//j�� 0~44�� ������. ball[0]~ball[5]�� ball[0]~ball[44]�� ���ΰ��� ����
			//�ε���i�� ���ΰ��� ����� tmp��, (�ε���i�� ������)�ε���j�� ���ΰ����� ����. �� �ڸ��ٲٱ�
			//�ڸ��ٲٱ⸦ �ϴ� �����δ� �ߺ��� ����. ��� ���ΰ��� ���� �ٲٸ� �迭ball�� ��Ұ��� �ߺ����� 1~45�� �����ϰԵ�
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;			
		}
		
		for(int i=0; i<6; i++)
//		System.out.println("ball["+i+"]	"+ball[i]);
		 System.out.printf("ball[%d]	%d%n", i, ball[i]); 
		
		
		
	
	}

}