package accessModifier2;

import accessModifier.A;

//CŬ������ AŬ������ ��ӹ޴´�.
public class C extends A{
	//��ü�� Ŭ������ ���� ����
	//Ŭ���� ������ �����ڸ� ȣ���ؾ� ��ü�� ����������
	//�����ڰ� Ŭ���� �̸����� �ٷ� ȣ���� ���� ����
	
//	void test() {
//		A a = new A();
//		a.field = "C";
//		a.method();
//	}
	//C class�� ������
	C(){
		//super() : �θ�Ŭ���� ������ : this�����ǵ� super : �θ�
//		super();	//�θ� Ŭ������ ������ ȣ��
		super.field = "C"; //super : �θ�
		this.field = "C"; //this : �θ� ���ٰ���
		super.method();
		this.method();
	}
}
