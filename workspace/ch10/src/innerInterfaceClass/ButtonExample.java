package innerInterfaceClass;

public class ButtonExample {
	public static void main(String[] args) {
		Button button = new Button();
		
		//�������̽��� ������ Ŭ������ ���ڷ� �־��ݴϴ�.
		button.setOnClickListener(new CheckListener());
		button.touch();
		
		button.setOnClickListener(new MessageListener());
		button.touch();

	}

}
