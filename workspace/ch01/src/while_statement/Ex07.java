package while_statement;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		/* 10���� ������ �Է¹޾Ƽ� 2������
		 * ���� �Է� : 48 => 110000
		 * 48 % 2 => 0 * 1
		 * 24 % 2 => 0 * 10
		 * 12 % 2 => 0 * 100
		 * 6 % 2 => 0 * 1000
		 * 3 % 2 => 1 * 10000
		 * 1 % 2 => 1 * 100000
		 * 110000
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է� : ");
		int decimal = sc.nextInt();
		int binary = 0, digit = 0; //binary�� ��ȯ�� ������ ����, digit�� �ڸ���
		while(decimal != 0) {
			binary += (decimal % 2) * Math.pow(10, digit);
			digit += 1;
			decimal /= 2;
		}
		System.out.println(binary);
		sc.close();
	}
}
