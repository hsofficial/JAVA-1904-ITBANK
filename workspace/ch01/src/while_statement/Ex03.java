package while_statement;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/* UPDOWN����
		 * ��ǻ�Ͱ� �� 1 ~ 100������ ������ ����ڰ� ���߸� Ż�� => ��ȸ���� ������� ���
		 * 
		 * computer : 77
		 * 
		 * [ ���� ���� ]
		 * ���� �Է� : 50
		 * UP
		 * 
		 * [ ���� ���� ]
		 * ���� �Է� : 80
		 * DOWN
		 * 
		 * [ ���� ���� ]
		 * ���� �Է� : 77
		 * 3ȸ���� ������ϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		int computer = (int)(Math.random() * 100 + 1); // 0 ~ 99 => 1 ~ 100
		int count = 0;
		while(true) { //���ѹݺ���
			System.out.print("���� �Է� : ");
			int user = sc.nextInt();
			count ++;
			if(computer > user)
				System.out.println("UP");
			else if(computer < user)
				System.out.println("DOWN");
			else {
				System.out.println("�� " + count + "ȸ ���� ������ϴ�.");
				break;
			}
		}
		sc.close();
	}
}