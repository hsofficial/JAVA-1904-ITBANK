package example3;

class A{	//���θ� ��ü
	public void x() {System.out.println("A.x");}
}

class B extends A{	//�θ� ��ü
	@Override
	public void x() {System.out.println("B.x");}
	public void y() {System.out.println("y");}
}

class C extends B{	//�ڳ� ��ü
	public void x() {System.out.println("C.x");}
	public void z() {System.out.println("z");}
}

public class Polymorphism {
	public static void main(String[] args) {
		A obj = new B(); //����Ŭ������ ��ü�� ����Ŭ������ ����(������)
		obj.x();//�������̵� �� �޼ҵ�� ���ٰ���
//		obj.y(); �ڽĸ� ������ �ִ� �޼ҵ�� ���ٺҰ���
		
		obj = new C();
		obj.x();
		
		C son = new C();
		son.x(); 
		son.y(); 
		son.z(); 
	}
}
