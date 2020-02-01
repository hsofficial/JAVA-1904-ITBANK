package anonymousExample3;


public class Anonymous {
	//1.객체 : 소나타를 운전합니다.
	Vehicle ve = new Vehicle() {
		@Override
		public void ride() {
			System.out.println("소나타 탑승");
		}
	};
	//2.메소드 : sm5를 운전합니다.
	void method1() {
		Vehicle ve = new Vehicle() {
			@Override
			public void ride() {
				System.out.println("sm5 운전");
			}
		};
		ve.ride();
	}
	//3.메소드 매개변수 : 티볼리를 운전합니다.
	void method2(Vehicle ve) {
		ve.ride();
	}
}
