package seven;

public class Ex7_6 {
    public static void main(String[] args) {
	    //업캐스팅, 다운캐스팅 확인
	
	    Car car = new Car();
	    SportsCar scar = new SportsCar();
	    SportsCar scar2 = null; //지역변수이므로 명시적초기화
	
	    //car : Car타입, Car인스턴스 참조
	    //오버라이딩 확인 - 19line
	    car.drive();
	
	    //업캐스팅
	    //scar : SportsCar타입, SportsCar인스턴스 참조
	    //car : Car타입, SportsCar인스턴스를 참조하게됨
	    car = scar;
	    car.drive();    //오버라이딩 확인
	    
//	    car.model = "1X"; //에러. car가 자식클래스를 참조하더라도 부모클래스의 타입이므로
	    
	    //다운캐스팅
	    //형변환 대상의 참조변수는 '부모클래스 타입 && lvalue의 인스턴스 참조'가 조건 
	    scar2 = (SportsCar)car;
	    
	    //scar2 : SportsCar타입, SportsCar인스턴스 참조
	    scar2.drive();
	    scar2.color = "black";
	    scar2.model = "3X";
    }
}


class Car{
    String color;

    void drive(){
        System.out.println("comfort mode");
    }
}

class SportsCar extends Car{
    String model;

    void drive(){
        System.out.println("sports mode");
    }

}