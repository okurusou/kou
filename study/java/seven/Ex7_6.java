package seven;

public class Ex7_6 {
    public static void main(String[] args) {
	    //��ĳ����, �ٿ�ĳ���� Ȯ��
	
	    Car car = new Car();
	    SportsCar scar = new SportsCar();
	    SportsCar scar2 = null; //���������̹Ƿ� ������ʱ�ȭ
	
	    //car : CarŸ��, Car�ν��Ͻ� ����
	    //�������̵� Ȯ�� - 19line
	    car.drive();
	
	    //��ĳ����
	    //scar : SportsCarŸ��, SportsCar�ν��Ͻ� ����
	    //car : CarŸ��, SportsCar�ν��Ͻ��� �����ϰԵ�
	    car = scar;
	    car.drive();    //�������̵� Ȯ��
	    
//	    car.model = "1X"; //����. car�� �ڽ�Ŭ������ �����ϴ��� �θ�Ŭ������ Ÿ���̹Ƿ�
	    
	    //�ٿ�ĳ����
	    //����ȯ ����� ���������� '�θ�Ŭ���� Ÿ�� && lvalue�� �ν��Ͻ� ����'�� ���� 
	    scar2 = (SportsCar)car;
	    
	    //scar2 : SportsCarŸ��, SportsCar�ν��Ͻ� ����
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