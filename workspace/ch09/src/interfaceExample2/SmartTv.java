package interfaceExample2;

/* ��Ӱ� ������ ���ÿ� �Ҷ��� ����� ���� �����ְ� ������ ���´�(extends > implements)
 * class�� ���� ����� �Ұ����ϳ� interface�� ���� ������ ������
 * RemoteControl�� ��� ���� �ʿ���� > ��ӹ��� TV�� �� ������ ��
 */

public class SmartTv extends TV implements Searchable, RemoteControl{

	@Override
	public void search(String url) {
		System.out.println("�˻� : " + url);
		
	}

}
