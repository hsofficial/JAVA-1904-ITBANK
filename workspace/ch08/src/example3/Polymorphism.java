package example3;

class A{	//조부모 객체
	public void x() {System.out.println("A.x");}
}

class B extends A{	//부모 객체
	@Override
	public void x() {System.out.println("B.x");}
	public void y() {System.out.println("y");}
}

class C extends B{	//자녀 개체
	public void x() {System.out.println("C.x");}
	public void z() {System.out.println("z");}
}

public class Polymorphism {
	public static void main(String[] args) {
		A obj = new B(); //수퍼클래스의 객체에 하위클래스를 저장(다형성)
		obj.x();//오버라이딩 된 메소드는 접근가능
//		obj.y(); 자식만 가지고 있는 메소드는 접근불가능
		
		obj = new C();
		obj.x();
		
		C son = new C();
		son.x(); 
		son.y(); 
		son.z(); 
	}
}
