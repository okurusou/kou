package five;

public class Ex5_8 {

	public static void main(String[] args) {
		
		//4행3열, score[4][3]
		int[][] score = {
		 	 	 {1, 2, 3},
		 	 	 {4, 5, 6},
		 	 	 {7, 8, 9},
		 	 	 {10, 11, 12},
		};
		
		//각 요소의 합을 저장하는 변수
		int sum = 0;
		
		//각 요소의 합을 구하는 반복문
		//score[0][0]~[0][2]을 더하는 식으로 해서 score[3][0]~[3][2]까지 더하는 중첩 for문
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[j].length; j++) {
				System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
				
				sum += score[i][j];
			} // score.length의 값은 행의 길이. 즉 4
			// score[0].length의 값은 인덱스0인 행이 참조하는 열의 값(열의 길이). 즉 3
			// 안쪽의 for문의 조건문인 score[j]의 값은, j가 증감식으로 늘어나도 계속 같은 3인 값을 가지는 구조
			// 그런 이유로 score[0].length ~ score[3].lenghth은 같은 3값임
		}
		
		System.out.println("sum = " + sum);
		
		
	}

}
