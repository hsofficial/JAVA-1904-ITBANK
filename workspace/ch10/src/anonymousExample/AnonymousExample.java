package anonymousExample;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous an = new Anonymous();
		
		//Ŭ���� ������ �͸� ���� ��ü �޼ҵ� ����
		an.worker.sleep();
		
		//Ŭ���� ������ �޼ҵ尡 �͸� ���� ��ü�� ����鼭 ����
		an.method1();
		
		//�޼ҵ��� �Ű��������� �͸� ���� ��ü�� ����鼭 ����
		an.method2(new Person() {
			void coding() {
				System.out.println("�ڹ� ���θ� �մϴ�.");
			}
			@Override
			void sleep() {
				coding();
				System.out.println("2�ÿ� ��ϴ�.");
			}
		});
	}

}
