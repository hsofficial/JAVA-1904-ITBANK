package abstractExample;

//�߻�method �� �ִ� class�� �߻�class

public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}

	/* �޼ҵ�� ����ο� ������(����)�� �־��
	 * �߻�޼ҵ�� ����θ� �ۼ��ϰ� �����θ� �ۼ����մϴ�.
	 * ���赵 >>> ū Ʋ�� ��Ƴ��� �޼ҵ�
	 * ��� >>> superclass�� method�� �ٲ��� �ʴ� ���� overriding ���� �ʾƵ� ��
	 * �߻� method�� ����� ���� �ڽĵ鿡�� �ݵ�� overriding �ϵ��� ������
	 */
	public void call() {System.out.println("��ȭ�ɱ�");}
	public abstract void turnOn();
	public abstract void turnOff();
}
