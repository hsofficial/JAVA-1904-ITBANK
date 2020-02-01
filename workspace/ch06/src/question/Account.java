package question;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class Account {
	private String number; //°èÁÂ¹øÈ£
	private String name; //°èÁÂÁÖ
	private int balance; //ÀÜ¾×
	public int balanceplus;
	public int balanceminus;
	
	Account(){}
	Account(String number, String name, int balance){
		this.name = name;
		this.number = number;
		this.balance = balance;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		if(Pattern.matches("^[0-9]*$", number))
			this.number = number;
		else
			System.out.println("°èÁÂ¹øÈ£´Â ¼ıÀÚ¸¸ ÀÔ·Â°¡´ÉÇÕ´Ï´Ù.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(Pattern.matches("^[¤¡-¤¾°¡-ÆR]*$", name))
			this.name = name;
		else
			System.out.println("ÀÌ¸§Àº ÇÑ±Û¸¸ °¡´ÉÇÕ´Ï´Ù.");
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance>0)
			this.balance = balance;
		else
			System.out.println("Àß¸øµÈ ±İ¾×ÀÔ´Ï´Ù.");
	}
	
	public void info() {
		System.out.println("---------------------------------");
		System.out.println("¿¹±İÁÖ : " + name);
		System.out.println("°èÁÂ¹øÈ£ : " + number);
		DecimalFormat df = new DecimalFormat("#,###");
		String balanceDf = df.format(balance);
		System.out.println("°¡°İ : " + balanceDf);
	}
	
	//1.°èÁÂ¹øÈ£´Â ¹İµå½Ã ¼ıÀÚ¸¸ ÀÔ·ÂÇÏµµ·Ï
	//2.°èÁÂÁÖ´Â ¹İµå½Ã ÇÑ±Û¸¸ ÀÔ·ÂµÇµµ·Ï
	//3.setBalance´Â 0º¸´Ù Å©µµ·Ï
	
	
}
