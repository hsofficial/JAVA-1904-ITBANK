package question;

public class Calculator {
	int left, right;
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() { System.out.println("���ϱ�");}
	public void minus() {System.out.println("����");}
	public void mul() {System.out.println("���ϱ�");}
	public void div() {System.out.println("������");}
	public void run() {
		sum();
		minus();
		mul();
		div();
	}
}
