package innerInterfaceClass;

public class MessageListener implements Button.onClickListener {

	@Override
	public void onClick() {
		System.out.println("�޽��� Ȯ��");
	}
}
