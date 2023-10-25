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
	void stop() {/* 현재 위치에 정지 */}
}

class Marine extends Unit {
	void move(int x, int y) { // 추상클래스의 하위클래스는 이 추상 메서드를 재정의 하지 않으면 컴파일에러
		System.out.printf("Marine[x = %d, y = %d]%n", x, y);
	}
	void stimPack() {/* 스팀팩 사용 */}
}
class Tank extends Unit {
	void move(int x, int y) {
		System.out.printf("Tank[x = %d, y = %d]%n", x, y);
	}
	void changeMod() {/* 모드전환 */}
}
class Dropship extends Unit {
	void move(int x, int y) {
		System.out.printf("Dropship[x = %d, y = %d]%n", x, y);
	}
	void load() {/* 탑승 */}
	void unload() {/* 하차 */}
}