package array3;

import java.util.Scanner;

public class CarExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean button = true;
		while (button) {
			System.out.println("---------------------");
			System.out.println("[�߰��� ���α׷�]");
			System.out.println("1. �߰��� ���");
			System.out.println("2. �߰��� ����");
			System.out.println("3. �߰��� ���� ����");
			System.out.println("4. �߰��� ���");
			System.out.println("5. ����");
			System.out.println("---------------------");
			System.out.print("�޴� ���� > > > > ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				CarManager.registration();
				break;
			case 2:
				CarManager.remove();
				break;
			case 3:
				CarManager.changeprice();
				break;
				
			case 4:
				CarManager.list();
				break;
				
			case 5:
				System.out.println("---------------------");
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println("---------------------");
				button = false;
				sc.close();
				break;

			default:
				break;
			}
		}
	}

}
