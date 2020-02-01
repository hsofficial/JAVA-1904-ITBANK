package innerInterfaceClass;

//interface ���� ������ �ʰ� Ŭ���� ���ο� �־ ���۽�ų��
public class Button {
	//��ø �������̽�
	interface onClickListener{
		void onClick(); //��ø �������̽��� �߻� �޼ҵ�
	}
	
	//interface�� �ڱ� �ڽ��� ��ü�� �־��� �� ����
	//�ڱ� interface ������ �͵��� �־��־�� �Ѵ�
	
	onClickListener listener;
	
	void setOnClickListener(onClickListener listener) {
		this.listener = listener; //���� ��ü�� listener���� ����
	}
	
	void touch() {
		listener.onClick(); //�߻�޼ҵ带 ����
	}
}
