package question;

public class CalculatorMinus extends Calculator{
	//���� ������
	@Override
	public void minus() {
		System.out.println(super.left - super.right);
		}
	@Override
	public void div() {
		System.out.println(super.left / super.right);
		}
	@Override
	public void run() {
		this.minus();
		this.div();
		}
}
