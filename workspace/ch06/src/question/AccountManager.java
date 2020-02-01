package question;

import java.util.Scanner;

import array3.Car;

public class AccountManager {
	private static Scanner sc = new Scanner(System.in);
	private static Account[] accounts = new Account[100];

	public static void createAccount() {
		System.out.println("---------------------------------");
		System.out.println("[ 등록 ]");
		System.out.print("예금주명 : ");
		String name = sc.next();
		System.out.print("계좌번호 : ");
		String number = sc.next();
		System.out.print("최초 입금액 : ");
		int balance = sc.nextInt();
		
		if(search(number) == null) {
			for(int i = 0; i < accounts.length; i++) {
				//배열의 제일 앞에서부터 시작해서 빈공간에 객체
				if(accounts[i] == null) {
					accounts[i] = new Account(name, number, balance);
					System.out.println("---------------------------------");
					System.out.println("등록되었습니다.");
					return;
				}
				
			}
		}
			else {
				System.out.println("---------------------------------");
				System.out.println("이미 등록된 계좌번호입니다.");
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
		System.out.println("[ 목록출력 ]");
		for(int i = 0; accounts[i] != null; i++) {
			accounts[i].info();
		}
		
	}
	
	public static void deposit() {
		System.out.println("---------------------------------");
		System.out.println("[ 입금 ]");
		System.out.print("계좌번호 : ");
		String number = sc.next();
		Account account = search(number);
		if(number != null){
			System.out.print("입금액 : ");
			int balanceplus = sc.nextInt();
			account.setBalance(account.getBalance() + balanceplus);
			System.out.println("---------------------------------");
			System.out.println(balanceplus + "원 입금");
			return;
		}
		else {
			System.out.println("---------------------------------");
			System.out.println("잘못된 입력입니다");
			return;
		}
		
	}
	
	public static void withdraw() {
		System.out.println("---------------------------------");
		System.out.println("[ 출금 ]");
		System.out.print("계좌번호 : ");
		String number = sc.next();
		Account account = search(number);
		if(number != null){
			System.out.print("출금액 : ");
			int balanceminus = sc.nextInt();
			account.setBalance(account.getBalance() - balanceminus);
				if(account.getBalance() >= balanceminus) {
					System.out.println("---------------------------------");
					System.out.println(balanceminus + "원 출금");
					return;
				}
				else {
					System.out.println("---------------------------------");
					System.out.println("잔액이 부족합니다");
					return;
				}
		}
		else {
			System.out.println("---------------------------------");
			System.out.println("잘못된 입력입니다");
			return;
		}
	}
	
}
