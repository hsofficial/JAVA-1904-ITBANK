package question;

public class PeopleExample {
	public static void main(String[] args) {
		/* People ������������ �迭 group�� ��� �� ��ŭ �����
		 * ������ �̸����, �б�, ���̸� �Է�
		 * �ݺ����� �̿��Ͽ� talk�޼ҵ� ���
		 * �߻�Ŭ��������
		 */
		People[] group = new People[2];
		group[0] = new personA("A","movie","Daedong", 30);
		group[1] = new personB("B","game","Busan", 30);
		System.out.println("�ڱ�Ұ�\n");
		for(int i = 0; i < group.length; i ++) {
			group[i].talk();
			System.out.println();
		}
		/* 
		 * �ڱ�Ұ�
		 * �ȳ��ϼ���
		 * �� �̸��� A�Դϴ� ���̴� 30��, Daedong �б��� �ٴϰ� �ְ�, ��̴� movie�Դϴ�
		 * 
		 */
	}
}
