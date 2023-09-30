package five;

public class Ex5_5 {

	public static void main(String[] args) {
		
		
		/*
		 * 로또 번호 만들기
		 * 1. 총 6개의 랜덤 값을 출력			/ Math.random()
		 * 2. 중복은 불가					/ 배열, 자리바꾸기
		 * 3. 작은 값부터 큰값으로 순서대로		/ Arrays.sort
		 * 
		 * 배열 생성
		 * 배열에 일련의 값 할당
		 * 요소의 내부값만 랜덤하게 자리 바꾸기
		 * 인덱스0~5까지 출력  
		 */
		
		
		//배열 생성
		int[] ball = new int[45];
		
		//45개의 요소에 일련의 1~45값을 할당
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		
		// 배열ball의 요소에 저장된 1~45의 요소값을 각각의 요소간에 랜덤하게 서로 바꾸기
		// 1. 6개만 출력하면 되므로 인덱스0~5에만 적용
		// 2. ball[0]~ball[5]에 1~45의 랜덤값을 할당
		// 3. ball[0]~ball[44]에 1~45의 값이 할당된 상태이므로, 서로 내부값만 바꾸면 가능
		// 4. 대입만 해도 랜덤값이 적용되나 서로 값을 바꾸는 이유는, 중복방지를 위함
		for(int i=0;i<6;i++) {
			
			//ball[0]~ball[5]의 값과 바꿀 랜덤한 인덱스번호 추출
			int j = (int)(Math.random()*45);
			// 자리 바꿈에 사용할 임시변수 선언 및 초기화
			int tmp=0;
			
			//for문의 조건식에 따라 i값은 0~5. 즉 ball[0]~ball[5]
			//j는 0~44의 랜덤값. ball[0]~ball[5]에 ball[0]~ball[44]의 내부값을 대입
			//인덱스i의 내부값이 저장된 tmp를, (인덱스i에 대입한)인덱스j의 내부값으로 대입. 즉 자리바꾸기
			//자리바꾸기를 하는 이유로는 중복값 방지. 계속 내부값을 서로 바꾸면 배열ball의 요소값은 중복없는 1~45를 유지하게됨
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;			
		}
		
		for(int i=0; i<6; i++)
//		System.out.println("ball["+i+"]	"+ball[i]);
		 System.out.printf("ball[%d]	%d%n", i, ball[i]); 
		
		
		
	
	}

}
