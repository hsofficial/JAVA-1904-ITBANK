package example02;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		try {
			account.deposit(10000);
			account.withdraw(15000);
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
