package abstractExample;

//추상method 가 있는 class가 추상class

public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}

	/* 메소드는 선언부와 구현부(몸통)이 있어요
	 * 추상메소드는 선언부만 작성하고 구현부를 작성안합니다.
	 * 설계도 >>> 큰 틀을 잡아놓은 메소드
	 * 상속 >>> superclass의 method중 바뀌지 않는 것은 overriding 하지 않아도 됨
	 * 추상 method는 상속을 받은 자식들에게 반드시 overriding 하도록 강제함
	 */
	public void call() {System.out.println("전화걸기");}
	public abstract void turnOn();
	public abstract void turnOff();
}
