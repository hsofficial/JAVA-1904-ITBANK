package swich_statement;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/* �ֹι�ȣ �� �ڸ��� �Է� �ް�,
		 * �������� ���������� ���(switch��, ��������� ���)
		 * 
		 * ����>
		 * 1021456, 3021456
		 * �� �ڸ��� 1�Ǵ� 3�̸� ����
		 * 
		 * 2021456, 4021456
		 * �� �ڸ��� 2�Ǵ� 4�̸� ����
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹε�Ϲ�ȣ ���ڸ� �Է�(1234567) : ");
		int num = Integer.parseInt(sc.nextLine()) / 1000000;
		
		switch (num) {
		case 1: case 3:
			System.out.println("�����Դϴ�.");
			break;
		case 2: case 4:
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("�˼� ����");
			break;
		}
		
	}
}
