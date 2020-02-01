package InterfaceExample;

public class CalculatorExample {
	public static void main(String[] args) {
		CalculatorA a = new CalculatorA();
		a.setOperands(10, 20, 30);
		System.out.println(a.sum());
		System.out.println(a.avg());
	}
}

