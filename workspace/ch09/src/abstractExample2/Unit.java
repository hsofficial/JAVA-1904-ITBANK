package abstractExample2;

//추상 class는 하위 class의 공통된 method만 포함한다
public abstract class  Unit {	//superclass
	int x, y; //현재 위치
	abstract void move(int x, int y); //move>>>상속받은 class에서 반드시 overriding
	void stop() {}	//stop >>> overriding 해도 되고 안해도 됨
}

class Marine extends Unit{
	@Override
	void move(int x, int y) {
		System.out.println("뚜벅뚜벅");
	}
	void stimPack() {System.out.println("스팀스팀");}
}

class Tank extends Unit{
	@Override
	void move(int x, int y) {
		System.out.println("데굴데굴");
	}
	void changeMode() {System.out.println("시즈모드");}
}

class Dropship extends Unit{
	@Override
	void move(int x, int y) {
		System.out.println("프로펠러 휘릭휘릭");
	}
	void load() {System.out.println("야 타");}
	void unload() {System.out.println("야 내려");}
}