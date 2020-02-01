package question;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class Account {
	private String number; //���¹�ȣ
	private String name; //������
	private int balance; //�ܾ�
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
			System.out.println("���¹�ȣ�� ���ڸ� �Է°����մϴ�.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(Pattern.matches("^[��-����-�R]*$", name))
			this.name = name;
		else
			System.out.println("�̸��� �ѱ۸� �����մϴ�.");
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance>0)
			this.balance = balance;
		else
			System.out.println("�߸��� �ݾ��Դϴ�.");
	}
	
	public void info() {
		System.out.println("---------------------------------");
		System.out.println("������ : " + name);
		System.out.println("���¹�ȣ : " + number);
		DecimalFormat df = new DecimalFormat("#,###");
		String balanceDf = df.format(balance);
		System.out.println("���� : " + balanceDf);
	}
	
	//1.���¹�ȣ�� �ݵ�� ���ڸ� �Է��ϵ���
	//2.�����ִ� �ݵ�� �ѱ۸� �Էµǵ���
	//3.setBalance�� 0���� ũ����
	
	
}
