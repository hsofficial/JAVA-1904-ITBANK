package localinnerClass;

public class Outer {
	/* 중첩, inner, nested class라고 부릅니다.
	 * class내부에 또 다른 class가 포함되는 형태
	 * 상속과 비슷한 형태
	 * 바깥쪽의 클래스 : 부모
	 * 안쪽의 클래스 : 자식
	 * 자식은 부모의 모든 기능을 포함(extends, implements없이도 포함)
	 * UI프로그래밍에 많이 쓰입니다.
	 */
	String f = "OuterField";
	void method() {
		System.out.println("OuterMethod");
	}
	class Inner{
		//클래스의 3요소 : 생성자, 필드, 메소드
		Inner(){}//생성자가 호출되어야 객체 생성
		String f = "InnerField";
		void method() {
			System.out.println("InnerMethod");
		}
		void show() {
			System.out.println("inner field : " + this.f);
			//상속을 받지 않아도 부모 클래스 접근 가능
			System.out.println("outer field : " + f);
			
			this.method(); //Inner클래스의 메소드
			Outer.this.method(); //Outer클래스의 메소드
		}
	}
}




