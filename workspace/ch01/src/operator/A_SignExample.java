package operator;

public class A_SignExample {
	public static void main(String[] args) {
		/* ��ȣ������
		 * ������ + �Ǵ� -
		 * ��� �� ���� ǥ��
		 * ���׿����ڷ� ���� ���� ��ȣ
		 * ���׿����ڷ� ���� ���� ��������ڷ� ���
		 * + : �ǿ����� ��ȣ ����
		 * - : �ǿ����� ��ȣ ����
		 */
		int var1 = -100;	//���׿�����
		int result1 = +var1;	//��ȣ ����
		System.out.println(var1);
		System.out.println(result1);
		
		short var2 = -100;
		//������(int) >>> short ��ȯ�� ������ ��ȯ (casting)
		short result3 = (short) -var1;
		System.out.println(result3);
	}
}
