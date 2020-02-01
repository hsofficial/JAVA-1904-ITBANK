package question;

public class Calculator {
	int left, right;
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() { System.out.println("더하기");}
	public void minus() {System.out.println("빼기");}
	public void mul() {System.out.println("곱하기");}
	public void div() {System.out.println("나누기");}
	public void run() {
		sum();
		minus();
		mul();
		div();
	}
}
