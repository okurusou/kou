package four;

import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
	System.out.println("���� ���� �Է��Ͻÿ�");
		
	Scanner scanner = new Scanner(System.in);
	int input = scanner.nextInt();
	
	int month = (1 <= input && input <= 12) ? input : 0 ;
	// input�� �Ҵ�Ǵ� ���� 1~12��� month���� 1~12 ���� �Ҵ�
	// �� ���� ���ڶ�� 0�� �Ҵ�
	
	switch (month) {
		case 3 :	// �ƹ� ������ ��� ����
		case 4 :
		case 5 :
			System.out.println("���� ������ ��");
			break;	// break�� �޾� switch���� Ż��
		case 6 :	case 7:		case 8 :	// ���ٷ� �ۼ��ص� ����
			System.out.println("���� ������ ����");
			break;
		case 9 :	case 10:		case 11 :
			System.out.println("���� ������ ����");
			break;
		case 12 :	case 1:		case 2 :
			System.out.println("���� ������ �ܿ�");
			break;
		default :	// 1~12�� �ƴ� ���� ������ ������ ��
			System.out.println("�߸� �Է��߽��ϴ�");
		}
	
	
	}

}
