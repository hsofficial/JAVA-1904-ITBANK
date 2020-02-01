package InterfaceExample;

//extends : 상속
//implements : 구현
public class CalculatorA implements Calculatable{
	int first, second, third;
	
	@Override
	public void setOperands(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	@Override
	public int sum() {
		return first + second + third;
	}

	@Override
	public int avg() {
		return (first + second + third) / 3;
	}
	
}
