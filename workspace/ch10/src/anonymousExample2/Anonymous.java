package anonymousExample2;

public class Anonymous {	
	//인터페이스의 메소드는 추상메소드 => 다른 클래스를 만들고 구현을 받아야지 메소드의 구현부를 작성가능
	//익명 구현 객체는 그 객체에 한정적으로 바로 구현부를 작성가능
	RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("Tv를 켭니다.");
		}
	};
	void method1() {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
		};
		rc.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
