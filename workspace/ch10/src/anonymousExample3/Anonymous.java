package anonymousExample3;


public class Anonymous {
	//1.��ü : �ҳ�Ÿ�� �����մϴ�.
	Vehicle ve = new Vehicle() {
		@Override
		public void ride() {
			System.out.println("�ҳ�Ÿ ž��");
		}
	};
	//2.�޼ҵ� : sm5�� �����մϴ�.
	void method1() {
		Vehicle ve = new Vehicle() {
			@Override
			public void ride() {
				System.out.println("sm5 ����");
			}
		};
		ve.ride();
	}
	//3.�޼ҵ� �Ű����� : Ƽ������ �����մϴ�.
	void method2(Vehicle ve) {
		ve.ride();
	}
}
