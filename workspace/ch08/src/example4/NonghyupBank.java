package example4;

public class NonghyupBank extends Bank{
	public NonghyupBank(String name, int maxCount) {
		super(name, maxCount);
	}

	@Override
	public void counting() {	//�̳�Ƚ���� �ö󰡴� �޼ҵ�
		count++;
		if(count <= maxCount) {
			System.out.println("�̳�Ƚ�� : " + count + " / " + maxCount);
		}
		else {
			System.out.println("�������� �̳�Ƚ���� �ʰ��Ǿ����ϴ�.");
		}
	}
}
