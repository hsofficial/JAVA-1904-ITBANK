package example5;

public class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("버스를 운행합니다.");
	}
	public void ddingdong() {
		System.out.println("내린다.");
	}
}
