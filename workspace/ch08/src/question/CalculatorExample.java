package question;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator c1 = new CalculatorPlus();
		c1.setOperands(10, 5);
		c1.run();
		//10 + 5 = 15
		//10 * 5 = 50
		
		c1 = new CalculatorMinus();
		c1.setOperands(20, 7);
		c1.run();
		//20 - 7 = 13
		//20 / 7 = 2
	}
}
