package abstractExample;

public class FolderPhone extends Phone{

	public FolderPhone(String owner) {
		super(owner);
	}
	
	public void sendMessage(String msg) {
		System.out.println(msg);
	}
	@Override
	public void turnOn() {
		System.out.println("������ ��� ������ �մϴ�.");
	}
	@Override
	public void turnOff() {
		System.out.println("������ �ݾƼ� ������ ���ϴ�.");
	}
}