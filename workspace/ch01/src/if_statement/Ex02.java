package if_statement;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/* ������ �ϳ� �Է¹ް� ������ ���� ������ ���
		 * 90 ~ 100 : "A����"
		 * 80 ~ 89 : "B����"
		 * 70 ~ 79 : "C����"
		 * 60 ~ 69 : "D����"
		 * 0 ~ 59 : "F����"
		 * 
		 * �Է¹��� ������ �����̰ų� 100�� �ʰ��ϸ� �����޽��� ���
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		if (num >= 90 && num<=100)
			System.out.println("A");
		else if(num>=80 && num<=89)
			System.out.println("B");
		else if(num>=70 && num<=79)
			System.out.println("C");
		else if(num>=60 && num<=69)
			System.out.println("D");
		else if(num>=0 && num<=59)
			System.out.println("F");
		else
			System.out.println("�Է°��� 1���� 100 ���̿��� �մϴ�");
		
	}
}
