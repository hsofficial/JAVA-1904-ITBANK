package if_statement;

public class Ex01 {
	public static void main(String[] args) {
		/* ���ǹ� if
		 * ���ǽ��� true�� �Ʒ��� ���ӹ����� ����
		 * ���ӹ����� �ѹ����̸� {}��������
		 * if�� ���ǽ��� �����̸� else if()���ǽ��� ���
		 * if�� else if�� ���� �����̸� else�� ���ӹ����� ����
		 */
		
		int kor = 95, eng = 65;
		double avg = (kor + eng) / 2.0;
		
		if(kor < 50 || eng < 50)
			System.out.println("����");
		else if(avg > 70)
			System.out.println("�հ�");
		else
			System.out.println("���հ�");
	}
}
