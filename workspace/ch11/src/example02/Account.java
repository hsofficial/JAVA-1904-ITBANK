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
		System.out.println("현재 잔고 : " + this.balance);
		if(this.balance < money) {
			//throw : 예외 객체 생성(예외를 발생시킬때 사용)
			throw new BalanceException("잔고가 부족합니다.");
		}
		this.balance -= money;
	}
}
