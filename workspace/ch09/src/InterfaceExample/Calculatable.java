package InterfaceExample;

/* A, B���� ���� ���� ���α׷��� ����ſ��� => ���߿� ��ĥ�ž�
 * ū Ʋ�� ����ش�.
 * 
 * �߻�Ŭ������ ����� �� ���ۿ� �ȵǿ�
 * �������̽��� ������ ������ �� �� �־��
 * 
 * �����̶� Ŭ�������ο��� ������ �Ǿ������� �߻�Ŭ����, ���� �������� �ʰ� ���� �ϸ� �������̽�
 */

//�߻�Ŭ������ ������
//1.����� �������� �� �־�(implements)
//2.�������̽� ���ο��� �����θ� ���� �� ����.

public interface Calculatable {
//	public void minus() {System.out.println("�����ɱ���");} interface �� ���� �Ұ���
	public void setOperands(int first, int second, int third);
	public int sum();
	public int avg();

}
