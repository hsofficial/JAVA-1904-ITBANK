package accessModifier;

public class B {
	void test() {
		A a = new A();//public 접근가능(내 패키지, 외부 패키지)
		a.field = 5; //private 접근 불가능(내 클래스 내부 아님)
		a.method(); //default 접근가능(내 패키지 내부)
	}

}
