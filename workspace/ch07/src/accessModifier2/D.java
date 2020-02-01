package accessModifier2;

public class D {
	//	void test() {
	//	A a = new A();
	//}
	//상속을 받지 않으면 사용할 수 없다.
	D(){
		super();
		this.field = "C";
		this.method();
	}

}
