package anonymousExample;

public class Anonymous {
	/* �͸� ���� ��ü : ��ü �����ÿ� ����� �����ϰ� ����� �� �ִ� ��ü
	 * ������ Ŭ���� ���ο����� ��밡��
	 * 1ȸ�� Ŭ���� => �ȵ���̵� ���߽� ���
	 */
	
	//Person ��ӹ޾Ƽ� ��� �߰��ϰ� �������̵� �ϰ� ����
	//�׷��� �̷� ��ü�� �ϳ��� ����� >> �͸� ���� ��ü
	//1.��ü ������ �͸� ���� ��ü ����
	Person worker = new Person() {
		void work() {
			System.out.println("���� �մϴ�.");
		}
		@Override
		void sleep() {
			work();
			System.out.println("24�ÿ� ��ϴ�.");
		}
	};
	//2.�޼ҵ� ���ο��� ����
	void method1() {
		Person student = new Person() { //��ü�� �͸� ���� ��ü�� ������
			void game() {
				System.out.println("����");
			}
			@Override
			void sleep() {
				game();
				System.out.println("1�ÿ� ��ϴ�.");
			}
		};
		student.sleep(); //�͸� ���� ��ü�� sleep �޼ҵ� ����
	}
	//3. �޼ҵ��� �Ű������� ����
	void method2(Person programmer) {//Person programmer = new Person(){ �͸� ���� ��ü };
		programmer.sleep();
	}
}
