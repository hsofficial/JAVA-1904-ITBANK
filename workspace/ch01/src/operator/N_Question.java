package operator;

public class N_Question {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int result = (--a) + (b++);
		//result : 11
		
		/* 100�� ¥�� ������ 1,234���� �־��, 25���� �л��鿡�� ���� ������ ���
		 * �Ѹ�� ��� ������ ������ �� ����ϰ�
		 * ��� ������ ������
		 */
		int coin = 1234;
		int student = 25;

		//������ ������ ������ �Ҽ����� ������ ����
		System.out.println(coin / student);
		System.out.println(coin % student);
	}
}
