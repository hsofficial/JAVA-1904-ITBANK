package example6;

public class Person { //���θ�
	//protected - ���� ��Ű�� Ȥ�� ��ӹ��� Ŭ������ ��밡�� >>> �ٸ� ��Ű�������� ��ӹ����� ��� ����
	//default - ���� ��Ű��
	protected String name;
	protected int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}
