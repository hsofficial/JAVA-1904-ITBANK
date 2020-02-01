package interfaceExample2;

public interface RemoteControl {
	/* interface
	 * 밖에서 유저가 실행하기 위한 단추
	 * 밖에서도 접근할 수 있도록 무조건 public로 선언
	 */
	
	//일반필드를 가지지 못함
	//static final field - 불변상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//인터페이스는 오로지 static final field / abstract method 를 가짐
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	default void method() {
		System.out.println("default쓰면 가능");
	}
}

/* 인터페이스와 추상클래스의 차이
 * 추상클래스 : 어느정도 구현이 되어있고 상속을 하나 밖에 못받아요
 * 인터페이스 : 전혀 구현이 안되어있고 선언만 되어있으면 여러개를 구현받을 수 있다.
 * 
 * ver 8 이후로 접근제한자를 default로 사용하면 추상클래스처럼 구현 가능
 * 구현가능하지만 최대한 쓰지말아야 함
 */
