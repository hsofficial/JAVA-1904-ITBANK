package if_statement;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/* 1 ~ 100������ ���ڸ� �ϳ� �Է� �ް�,
		 * �Է� ���� ���� 3�� ����̸� �������� ����
		 * 5�� ����̸� �̸�
		 * 3�� ����̸鼭 5�� ����̸� ���� �̸��� ��� ���
		 * �߸��� ������ ���� �Է¹����� �����޽����� ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int num = sc.nextInt();
		
		if(num < 0 || num > 100)
			System.out.println("�߸��� �Է��Դϴ�.");
		else if(num % 3 == 0 && num % 5 == 0)
			System.out.println("������");
		else if(num % 3 == 0 && num % 5 != 0)
			System.out.println("��");
		else if(num % 3 != 0 && num % 5 == 0)
			System.out.println("����");
		else
			System.out.println("***");
		
		sc.close();
	}
}
