package six;



class Data_1{
	int value;
}

class Data_2{
	int value;
	
	Data_2(int x){
		value = x;
	}
	
//	Data_2() {}
	
}

public class Ex6_11 {

	public static void main(String[] args) {
		
		Data_1 d1 = new Data_1();
		// 오류발생. 기본초기화를 요구한 문장이지만, 인스턴스 변수 value가 생성자 때문에 초기화가 불가능
//		Data_2 d2 = new Data_2(); 
		
		// 매개변수x에 숫자 리터럴을 전달해 value를 초기화하거나 Data_2() {}를 정의하면 됨
		Data_2 d2 = new Data_2(10);
		System.out.println(d2.value);

	}

}



