package question;

public class CalculatorPlus extends Calculator{
	//���� ����
	@Override
	public void sum() {
		System.out.println(super.left + super.right);
		}
	@Override
	public void mul() {
		System.out.println(super.left * super.right);
		}
	@Override
	public void run() {
		this.sum();
		this.mul();
		}
}
