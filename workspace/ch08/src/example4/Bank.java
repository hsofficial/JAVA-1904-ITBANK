package example4;

public class Bank {
	public int maxCount;	//�ִ� �̳�Ƚ��
	public int count;		//�̳�Ƚ��(0���� �ʱ�ȭ)
	public String name;		//�ŷ� �����̸�
	
	//������
	public Bank(String name, int maxCount) {
		this.name = name;
		this.maxCount = maxCount;
		this.count = 0;
	}
	
	//�޼ҵ�
	public void counting() {	//�̳�Ƚ���� �ö󰡴� �޼ҵ�
		count++;
		if(count <= maxCount) {
			System.out.println("�̳�Ƚ�� : " + count + " / " + maxCount);
		}
		else {
			System.out.println("�̳�Ƚ���� �ʰ��Ǿ����ϴ�.");
		}
	}
}
