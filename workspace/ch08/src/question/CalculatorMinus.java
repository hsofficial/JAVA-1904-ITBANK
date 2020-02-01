package question;

public class CalculatorMinus extends Calculator{
	//»¬¼À ³ª´°¼À
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
