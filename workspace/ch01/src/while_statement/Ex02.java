package while_statement;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//while�� label�� �ٿ���
		outside:while(true) { //���ѹݺ��� : break�� ����ߵǿ�
			System.out.println("[�޴�]");
			System.out.println("1.�Ƹ޸�ī�� | 2.ī��� | 3.��ī | 4.����");
			System.out.println(">>>");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("5,500��");
				break;
			case 2:
				System.out.println("6,000��");
				break;
			case 3:
				System.out.println("6,500��");
				break;
			case 4:
				System.out.println("�����մϴ�.");
				break outside; //outside�� ����
			}
		}
	}
}
