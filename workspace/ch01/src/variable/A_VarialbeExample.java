package variable;

public class A_VarialbeExample {
	public static void main(String[] args) {
		//���� : ���ϴ� ��
		//��� : ��'��' ������ �ʴ� '��'
		//����� ���������� ���� �빮�ڷ� ���´�
		
		final int MAX = 100;
		//MAX = 50;
		//MAX�� ���� 100�̶�� ���� => ���ͷ�
		//100�� ���� ���ͷ�, 3.14�� �Ǽ� ���ͷ�, 'A'���� ���ͷ�
		System.out.println(MAX);
		
		int num1 = 10, num2 = 20;
		int tmp = num1;	//���� ������ ���� ������
		num1 = num2;
		num2 = tmp;
	}

}
