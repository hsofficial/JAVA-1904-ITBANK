package question;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UpdownGame {
	public static void main(String[] args) {
		/* 1 ~ 100������ ������ ���ڸ� ���ߴ� ������ ������ּ���
		 * ���ڰ� �ƴ϶� �����ڸ� �־���� � ���ܰ� �ߴ��� => ����ó�����ּ���
		 */
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0; //����� �Է� �������
		int count = 0; //�õ� Ƚ���� �������� ����
		while(true) {
				System.out.print("1�� 100������ ���� �Է� : ");
				Scanner sc = new Scanner(System.in);
			try {
				input = sc.nextInt(); //InputMismatchException�� ����ó��
			} catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է� �����մϴ�");
				continue;
			}
			
			if(answer > input)
				System.out.println("�� ū ���� �Է�");
			else if(answer < input)
				System.out.println("�� ���� ���� �Է�");
			else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� " + count + "�� �Դϴ�.");
				break;//while���� ���
			}
		}
	}
}