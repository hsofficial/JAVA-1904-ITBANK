package accessModifier;

public class A {
	/* 접근제어자는 단순히 관념적인 개념이 아니고
	 * 규모있는 어플리케이션 개발시 사용자가 객체 내부적으로 사용하는 필드나 메소드에
	 * 잘못된 접근을 하므로서 의도치 못한 오작동을 일으킴
	 * public : 은행의 안내창구(아무나 들어와서 업무를 봅니다.)
	 * private : 은행안의 개인 금고
	 */
	private int field;	//private필드(내 클래스만 접근가능해)
	public A() {}	//public메소드 - 생성자(누구나 접근가능)
	void method() {}	//default 메소드(내 패키지에서만 접근가능해)
	void test() {
		A a = new A();//public 접근가능(내 패키지, 외부 패키지)
		a.field = 5; //private 접근가능(내 클래스 내부)
		a.method(); //default 접근가능(내 패키지 내부)
	}

}
