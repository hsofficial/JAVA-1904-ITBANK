package accessModifier2;

import accessModifier.A;

//C클래스는 A클래스를 상속받는다.
public class C extends A{
	//객체는 클래스로 만든 변수
	//클래스 내부의 생성자를 호출해야 객체를 생성시켜줌
	//생성자가 클래스 이름으로 바로 호출이 되지 않음
	
//	void test() {
//		A a = new A();
//		a.field = "C";
//		a.method();
//	}
	//C class의 생성자
	C(){
		//super() : 부모클래스 생성자 : this같은건데 super : 부모
//		super();	//부모 클래스의 생성자 호출
		super.field = "C"; //super : 부모
		this.field = "C"; //this : 부모꺼 접근가능
		super.method();
		this.method();
	}
}
