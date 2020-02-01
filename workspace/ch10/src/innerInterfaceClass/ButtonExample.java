package innerInterfaceClass;

public class ButtonExample {
	public static void main(String[] args) {
		Button button = new Button();
		
		//인터페이스를 구현한 클래스를 인자로 넣어줍니다.
		button.setOnClickListener(new CheckListener());
		button.touch();
		
		button.setOnClickListener(new MessageListener());
		button.touch();

	}

}
