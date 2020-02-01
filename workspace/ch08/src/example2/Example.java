package example2;

public class Example {
	public static void main(String[] args) {
		/* 객체의 다형성(Polymorphism) : 상위의 클래스를 이용하여 다양한 기능 사용
		 * 오버라이딩된 기능만 사용가능
		 * 
		 * 부모님이 미술(유화)을 잘해 => 자식도 미술을 잘해(상속) => 자식은 미술(포토샵)을 잘해(오버라이딩)
		 * 자식이 프로그래밍을 배웠어(자식의 새로운 메소드) => 부모님이 프로그래밍을 할 순 없어
		 */
		Paper paper = new Paper(); //상위클래스의 객체
		A4 a4 = new A4(); //하위클래스의 객체
		B4 b4 = new B4();
		
		paper.printing(); //부모객체의 메소드
		
		//자동타입변환(Promotion) : 작은 타입에서 큰 타입은  컴파일러가 자동으로 타입변환
		paper = a4;
		paper.printing();//자식객체의 메소드
		paper.papersize(); //자식객체에만 있는 메소드는 실행안됨(프로그래밍)
		
		paper = b4;
		paper.printing();//자식객체의 메소드
		paper.papersize(); //자식객체에만 있는 메소드는 실행안됨(프로그래밍)

	}
}
