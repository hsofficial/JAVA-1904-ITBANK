package input;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		/* �Ǽ� 1���� ���� 1���� �Է¹ް�, �� ���� ���� �Ҽ��� 1�ڸ����� ǥ��
		 * Decimalformat ���
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ǽ� �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� �Է� : ");
		double num2 = sc.nextDouble();
		
		double multi = num1 * num2;
		
		DecimalFormat df = new DecimalFormat("#.0");
		String a = df.format(multi);
		System.out.println("�Ǽ��� ������ �� : " + a);
		
		sc.close();
		
	}
}
