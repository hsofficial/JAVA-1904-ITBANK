package while_statement;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("[�޴�]");
			System.out.println("1.�Ƹ޸�ī�� | 2.ī��� | 3.��ī | 4.����");
			System.out.println(">>>");
			int select = sc.nextInt();
			if(select == 1)
				System.out.println("5,500��");
			else if(select == 2)
				System.out.println("6,000��");
			else if(select == 3)
				System.out.println("6,500��");
			else if(select == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
			}
		}
	}
}
