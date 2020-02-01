package accessModifier;

public class A {
	//protected : 같은 패키지거나 상속받은 클래스만 사용가능
	protected String field; //필드
	protected A() {} //생성자
	protected void method() {} //메소드

}
