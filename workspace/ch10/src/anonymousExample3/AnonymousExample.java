package anonymousExample3;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous an = new Anonymous();
		
		an.ve.ride();
		
		an.method1();
		
		an.method2(new Vehicle() {
			@Override
			public void ride() {
				System.out.println("Æ¼º¼¸® Å¾½Â");
			}
		});
	}
}
