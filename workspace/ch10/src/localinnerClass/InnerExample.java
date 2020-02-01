package localinnerClass;

public class InnerExample {
	public static void main(String[] args) {
//		Outer.Inner : 클래스명(자료형)
//		new Outer() : 생성자 호출
//  	Inner inner = new Inner();
		Outer outer = new Outer(); //바깥 클래스 객체 생성
		Outer.Inner inner = outer.new Inner(); 
		
		inner.show();
	}
}