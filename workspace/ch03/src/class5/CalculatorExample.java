package class5;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		System.out.println(cal.addition(5, 6));
		
		System.out.println(cal.division(10, 3));
		
		cal.powerOff();
	}

}
