package accessModifier2;

import accessModifier.A;

public class C {
	void test() {
		A a = new A();//public ���ٰ���(�� ��Ű��, �ܺ� ��Ű��)
		a.field = 5; //private ���� �Ұ���(�� Ŭ���� ���� �ƴ�)
		a.method(); //default ���� �Ұ���(�� ��Ű�� ���� �ƴ�)
	}

}
