package abstractExample;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOn() {
		System.out.println("��ġ�� �ؼ� ������ �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("��ġ�� �ؼ� ������ ���ϴ�.");
	}

}
