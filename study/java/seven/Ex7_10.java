package seven;

public class Ex7_10 {

	public static void main(String[] args) {
		
		
		Unit[] group = { new Marine(), new Tank(), new Dropship() };
		
		for(int i=0; i<group.length; i++)
			group[i].move(100, 200);
	}

}


abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {/* ���� ��ġ�� ���� */}
}

class Marine extends Unit {
	void move(int x, int y) { // �߻�Ŭ������ ����Ŭ������ �� �߻� �޼��带 ������ ���� ������ �����Ͽ���
		System.out.printf("Marine[x = %d, y = %d]%n", x, y);
	}
	void stimPack() {/* ������ ��� */}
}
class Tank extends Unit {
	void move(int x, int y) {
		System.out.printf("Tank[x = %d, y = %d]%n", x, y);
	}
	void changeMod() {/* �����ȯ */}
}
class Dropship extends Unit {
	void move(int x, int y) {
		System.out.printf("Dropship[x = %d, y = %d]%n", x, y);
	}
	void load() {/* ž�� */}
	void unload() {/* ���� */}
}