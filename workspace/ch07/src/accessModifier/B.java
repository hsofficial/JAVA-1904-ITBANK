package accessModifier;

public class B {
	void test() {
		A a = new A();
		a.field = "C";
		a.method();
	}
}
