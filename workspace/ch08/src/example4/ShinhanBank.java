package example4;

public class ShinhanBank extends Bank{
	
	public ShinhanBank(String name, int maxCount) {
		super(name, maxCount); //������ => ������ü�� ����
	}

	@Override
	public void counting() { //�̳�Ƚ���� �ö󰡴� �޼ҵ�
		count++;
		if(count <= maxCount) {
			System.out.println("�̳�Ƚ�� : " + count + " / " + maxCount);
		}else {
			System.out.println("�������� �̳�Ƚ���� �ʰ��Ǿ����ϴ�.");
		}
	}
}
