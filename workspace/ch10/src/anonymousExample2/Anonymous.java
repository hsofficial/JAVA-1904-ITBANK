package anonymousExample2;

public class Anonymous {	
	//�������̽��� �޼ҵ�� �߻�޼ҵ� => �ٸ� Ŭ������ ����� ������ �޾ƾ��� �޼ҵ��� �����θ� �ۼ�����
	//�͸� ���� ��ü�� �� ��ü�� ���������� �ٷ� �����θ� �ۼ�����
	RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("Tv�� �մϴ�.");
		}
	};
	void method1() {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
			}
		};
		rc.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
