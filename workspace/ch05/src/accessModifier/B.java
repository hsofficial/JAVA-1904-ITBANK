package accessModifier;

public class B {
	void test() {
		A a = new A();//public ���ٰ���(�� ��Ű��, �ܺ� ��Ű��)
		a.field = 5; //private ���� �Ұ���(�� Ŭ���� ���� �ƴ�)
		a.method(); //default ���ٰ���(�� ��Ű�� ����)
	}

}
