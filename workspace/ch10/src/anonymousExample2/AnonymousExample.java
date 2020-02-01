package anonymousExample2;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous an = new Anonymous();
		
		an.rc.turnOn();
		
		an.method1();
		
		an.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("히터를 켭니다.");
			}
		});
	}
}
