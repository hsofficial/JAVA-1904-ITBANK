package array2;

import java.util.Scanner;

//���� Ŭ����
public class MemberExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("--------------------------");
			System.out.println("1. ���̵� ã��");
			System.out.println("2. ���̵� ����");
			System.out.println("3. �α���");
			System.out.println("4. ����");
			System.out.println("--------------------------");
			System.out.print(">> ");
			int select = sc.nextInt();
			if(select == 1)
				MemberManager.searchId();
			else if(select == 2)
				MemberManager.changeId();
			else if(select == 3)
				MemberManager.login();
			else if(select == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}

}
