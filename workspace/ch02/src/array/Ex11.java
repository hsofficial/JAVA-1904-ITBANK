package array;

public class Ex11 {
	public static void main(String[] args) {
		/* money�� ����� �ݾ��� �������� �ٲ�����
		 * �ּ� ��� ������ �Ž��� ����ϴ��� ���
		 * (coin�迭�� �ݺ����� �̿�)
		 * money = 2680;
		 * 500�� : 5
		 * 100�� : 1
		 * 50�� : 1
		 * 10�� : 3
		 * �� 10���� ������ �ǳ���� �մϴ�.
		 */
		int money = 2680, total = 0; //�� ����
		int[] coin = {500, 100, 50, 10};
		for(int i = 0; i < coin.length; i ++) {
			int count = money / coin[i]; //������ ��ΰ�?
			total += count; //�� ��ΰ�?
			money %= coin[i];
			System.out.println(coin[i] + "�� ���� : " + count);
		}
		System.out.println("��" + total + "���� ������ �Ž��� ����մϴ�.");
	}
}










