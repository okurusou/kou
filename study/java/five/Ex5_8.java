package five;

public class Ex5_8 {

	public static void main(String[] args) {
		
		//4��3��, score[4][3]
		int[][] score = {
		 	 	 {1, 2, 3},
		 	 	 {4, 5, 6},
		 	 	 {7, 8, 9},
		 	 	 {10, 11, 12},
		};
		
		//�� ����� ���� �����ϴ� ����
		int sum = 0;
		
		//�� ����� ���� ���ϴ� �ݺ���
		//score[0][0]~[0][2]�� ���ϴ� ������ �ؼ� score[3][0]~[3][2]���� ���ϴ� ��ø for��
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[j].length; j++) {
				System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
				
				sum += score[i][j];
			} // score.length�� ���� ���� ����. �� 4
			// score[0].length�� ���� �ε���0�� ���� �����ϴ� ���� ��(���� ����). �� 3
			// ������ for���� ���ǹ��� score[j]�� ����, j�� ���������� �þ�� ��� ���� 3�� ���� ������ ����
			// �׷� ������ score[0].length ~ score[3].lenghth�� ���� 3����
		}
		
		System.out.println("sum = " + sum);
		
		
	}

}
