package example5;

public class Car {
	// private 상속불가(상속은 이루어지나 접근 불가)
	//final method : 상속은 가능하나 서브클래스에서 오버라이딩(변경) 불가능
	public void ride() {
		System.out.println("4인승에 탄다.");
	}
}