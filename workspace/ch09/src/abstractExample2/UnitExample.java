package abstractExample2;

public class UnitExample {
	public static void main(String[] args) {
//		Unit unit = new Unit(); �߻�Ŭ������ ��ü �������
		Unit unit = new Marine(); //��ü�� ������ : ����Ŭ������ ��ü�� ������ �� �ִ�.
		unit.move(5, 6);
		unit.stop();
		
		Unit[] group1 = new Unit[5];
		group1[0] = new Marine();
		group1[1] = new Marine();
		group1[2] = new Tank();
		group1[3] = new Dropship();
		group1[4] = new Tank();
		System.out.println("----�δ� �̵�---");
		for(int i = 0; i < group1.length; i ++) {
			group1[i].move(50, 100);
		}
	}
}
