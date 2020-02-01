package question;

import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.등록 | 2.목록 | 3.예금 | 4.출금 | 5.종료");
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
				System.out.println("프로그램 종료");
				run = false;
			}
			else
				System.out.println("잘못된 입력입니다.");
		}
	}

}
