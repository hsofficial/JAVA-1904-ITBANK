package example02;

public class BalanceException extends Exception{
	public BalanceException() {}
	public BalanceException(String msg) {
		super(msg); //super Exception
	}
}
