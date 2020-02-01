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
		System.out.println("폴더를 열어서 전원을 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("폴더를 닫아서 전원을 끕니다.");
	}
}