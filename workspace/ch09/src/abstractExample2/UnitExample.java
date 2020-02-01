package abstractExample2;

public class UnitExample {
	public static void main(String[] args) {
//		Unit unit = new Unit(); 추상클래스로 객체 못만들어
		Unit unit = new Marine(); //객체의 다형성 : 하위클래스의 객체를 저장할 수 있다.
		unit.move(5, 6);
		unit.stop();
		
		Unit[] group1 = new Unit[5];
		group1[0] = new Marine();
		group1[1] = new Marine();
		group1[2] = new Tank();
		group1[3] = new Dropship();
		group1[4] = new Tank();
		System.out.println("----부대 이동---");
		for(int i = 0; i < group1.length; i ++) {
			group1[i].move(50, 100);
		}
	}
}
