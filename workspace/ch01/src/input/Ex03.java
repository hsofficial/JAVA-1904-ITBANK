package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/* �� ���� �Է¹��� �ǵ� ù ��° ���� �Ǽ��� �Է�, �� ��° ���� ������ �Է�
		 * �� ���� ����(����)�� ������(�Ǽ�) ��� ���
		 * Double.parseDouble(); => string���� ��ȯ
		 * sc.nextDouble(); => �ٷ� �Է�
		 */
		Scanner sc = new Scanner(System.in);
		
		//nextLine() : ����Ű(���๮��)�� �Է��� ����
		//next() : �����̽���, ����Ű�� �Է��� ����
		
		System.out.print("�Ǽ� �Է� : ");
		double d1 = sc.nextDouble();
		// \n ���ڸ� ������ ���� �ʾ� ���ۿ� ����
		
		sc.nextLine();
		//\n ���ڸ� �޾���
		
		System.out.print("���� �Է� : ");
		String s2 = sc.nextLine();
		int i2 = Integer.parseInt(s2);
		
		System.out.println((int)(d1 * i2));
		System.out.println(d1 / i2);
	}
}
