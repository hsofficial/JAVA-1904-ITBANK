package innerInterfaceClass;

public class CheckListener implements Button.onClickListener{

	@Override
	public void onClick() {
		System.out.println("선택 표시");
	}
}
