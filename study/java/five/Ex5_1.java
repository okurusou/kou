package five;

import java.util.Arrays;

public class Ex5_1 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {10, 23, 95, 187, 22};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i] = i + 1;
			// �ε���0 ���� ��1���� 10���� ������� �Ҵ�
			// iArr1[i] += 1	<< l-value���� �������� �ٲ�鼭 ������ ���� ����
		}
		
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
		}
		
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");		// print������ ȭ����� ��¿� ������ ���
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
		
	}
}
