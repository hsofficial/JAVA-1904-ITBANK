package question;

import java.util.Scanner;

import array3.Car;

public class AccountManager {
	private static Scanner sc = new Scanner(System.in);
	private static Account[] accounts = new Account[100];

	public static void createAccount() {
		System.out.println("---------------------------------");
		System.out.println("[ ��� ]");
		System.out.print("�����ָ� : ");
		String name = sc.next();
		System.out.print("���¹�ȣ : ");
		String number = sc.next();
		System.out.print("���� �Աݾ� : ");
		int balance = sc.nextInt();
		
		if(search(number) == null) {
			for(int i = 0; i < accounts.length; i++) {
				//�迭�� ���� �տ������� �����ؼ� ������� ��ü
				if(accounts[i] == null) {
					accounts[i] = new Account(name, number, balance);
					System.out.println("---------------------------------");
					System.out.println("��ϵǾ����ϴ�.");
					return;
				}
				
			}
		}
			else {
				System.out.println("---------------------------------");
				System.out.println("�̹� ��ϵ� ���¹�ȣ�Դϴ�.");
			}
	}
	private static Account search(String number) {
		for(int i = 0; accounts[i] != null;i++) {
			if(accounts[i].getNumber().equals(number)) {
				return accounts[i];
			}
		}
		return null;
	}
				
	public static void accountList() {
		System.out.println("---------------------------------");
		System.out.println("[ ������ ]");
		for(int i = 0; accounts[i] != null; i++) {
			accounts[i].info();
		}
		
	}
	
	public static void deposit() {
		System.out.println("---------------------------------");
		System.out.println("[ �Ա� ]");
		System.out.print("���¹�ȣ : ");
		String number = sc.next();
		Account account = search(number);
		if(number != null){
			System.out.print("�Աݾ� : ");
			int balanceplus = sc.nextInt();
			account.setBalance(account.getBalance() + balanceplus);
			System.out.println("---------------------------------");
			System.out.println(balanceplus + "�� �Ա�");
			return;
		}
		else {
			System.out.println("---------------------------------");
			System.out.println("�߸��� �Է��Դϴ�");
			return;
		}
		
	}
	
	public static void withdraw() {
		System.out.println("---------------------------------");
		System.out.println("[ ��� ]");
		System.out.print("���¹�ȣ : ");
		String number = sc.next();
		Account account = search(number);
		if(number != null){
			System.out.print("��ݾ� : ");
			int balanceminus = sc.nextInt();
			account.setBalance(account.getBalance() - balanceminus);
				if(account.getBalance() >= balanceminus) {
					System.out.println("---------------------------------");
					System.out.println(balanceminus + "�� ���");
					return;
				}
				else {
					System.out.println("---------------------------------");
					System.out.println("�ܾ��� �����մϴ�");
					return;
				}
		}
		else {
			System.out.println("---------------------------------");
			System.out.println("�߸��� �Է��Դϴ�");
			return;
		}
	}
	
}
