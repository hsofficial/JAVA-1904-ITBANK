package example5;

public class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시를 운행합니다.");
	}
	public void horseRun() {
		System.out.println("돈이 올라간다.");
	}
}