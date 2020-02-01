package example5;

public class CoupeCar extends Car{
	//private 접근 불가 >>> 오버라이딩 불가
	
	//final적으면 반드시 오버라이딩
	//수퍼클래스의 메소드가 final => 변경이 안됨 => 오버라이딩 불가능
	//final은 하위클래스 객체로 잘 접근이 된다 => 그 대신 상수라서 오버라이딩은 안됨
	
	@Override
	public final void ride() {
		System.out.println("2인승에 탄다.");
	}
}
