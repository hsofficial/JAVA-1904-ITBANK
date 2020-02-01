package abstractExample2;

//�߻� class�� ���� class�� ����� method�� �����Ѵ�
public abstract class  Unit {	//superclass
	int x, y; //���� ��ġ
	abstract void move(int x, int y); //move>>>��ӹ��� class���� �ݵ�� overriding
	void stop() {}	//stop >>> overriding �ص� �ǰ� ���ص� ��
}

class Marine extends Unit{
	@Override
	void move(int x, int y) {
		System.out.println("�ѹ��ѹ�");
	}
	void stimPack() {System.out.println("��������");}
}

class Tank extends Unit{
	@Override
	void move(int x, int y) {
		System.out.println("��������");
	}
	void changeMode() {System.out.println("������");}
}

class Dropship extends Unit{
	@Override
	void move(int x, int y) {
		System.out.println("�����緯 �ָ��ָ�");
	}
	void load() {System.out.println("�� Ÿ");}
	void unload() {System.out.println("�� ����");}
}