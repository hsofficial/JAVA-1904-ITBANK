package question;

import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.��� | 2.��� | 3.���� | 4.��� | 5.����");
			System.out.println("---------------------------------");
			System.out.print(">> ");
			int select = sc.nextInt();
			if(select == 1)
				AccountManager.createAccount();
			else if(select == 2)
				AccountManager.accountList();
			else if(select == 3)
				AccountManager.deposit();
			else if(select == 4)
				AccountManager.withdraw();
			else if(select == 5) {
				System.out.println("���α׷� ����");
				run = false;
			}
			else
				System.out.println("�߸��� �Է��Դϴ�.");
		}
	}

}
