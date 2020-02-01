package example02;

public class Account {
	private int balance;
	public Account() {}
	public int getBalance() {
		return this.balance;
	}
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) throws BalanceException {
		System.out.println("���� �ܰ� : " + this.balance);
		if(this.balance < money) {
			//throw : ���� ��ü ����(���ܸ� �߻���ų�� ���)
			throw new BalanceException("�ܰ� �����մϴ�.");
		}
		this.balance -= money;
	}
}
