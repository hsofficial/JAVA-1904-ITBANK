package interfaceExample2;

public interface RemoteControl {
	/* interface
	 * �ۿ��� ������ �����ϱ� ���� ����
	 * �ۿ����� ������ �� �ֵ��� ������ public�� ����
	 */
	
	//�Ϲ��ʵ带 ������ ����
	//static final field - �Һ����
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�������̽��� ������ static final field / abstract method �� ����
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	default void method() {
		System.out.println("default���� ����");
	}
}

/* �������̽��� �߻�Ŭ������ ����
 * �߻�Ŭ���� : ������� ������ �Ǿ��ְ� ����� �ϳ� �ۿ� ���޾ƿ�
 * �������̽� : ���� ������ �ȵǾ��ְ� ���� �Ǿ������� �������� �������� �� �ִ�.
 * 
 * ver 8 ���ķ� ���������ڸ� default�� ����ϸ� �߻�Ŭ����ó�� ���� ����
 * �������������� �ִ��� �������ƾ� ��
 */
