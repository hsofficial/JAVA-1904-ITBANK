package abstractExample;

public class PhoneExample {
	public static void main(String[] args) {
		
		//�߻�Ŭ�����δ� ��ü�� ������ϴ�. => idea theory
		Phone phone = new Phone("������");
		
		FolderPhone lolipop = new FolderPhone("ȫ�浿");
		lolipop.turnOn();
		lolipop.sendMessage("�޽���");
		lolipop.turnOff();
		
		SmartPhone galaxy = new SmartPhone("ȫ���");
		galaxy.turnOn();
		galaxy.turnOff();
		
		/* ����� �ڼ�Ŭ������ ����µ� ����Ŭ������ ����ϴ� ���̶��
		 * �߻�ȭ�� ������ Ŭ�������� ����κ��� �̾Ƴ��� ����Ŭ������ ����� ��
		 * ��Ӱ������� ���� ���������� ����ȭ, �ö󰥼��� �����Ҹ� ���Եȴ�.
		 */
	}
}
