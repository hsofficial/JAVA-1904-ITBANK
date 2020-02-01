package abstractExample;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOn() {
		System.out.println("터치를 해서 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("터치를 해서 전원을 끕니다.");
	}

}
