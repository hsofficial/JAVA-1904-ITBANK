package generics;

class Bank<T, S>{
	T bankName;
	S balance;
	void deposit(S balance) {
		this.balance = balance;
		System.out.println(balance + "원 입금되었습니다.");
	}
}


public class GenericsExample2 {
	public static void main(String[] args) {
		Bank<String, Double> bank = new <String, Double>Bank();
//		Bank<String, Integer> bank = new <String, Integer>Bank();		
		bank.deposit(5000.0);
	}
}
