package while_statement;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		/* ���ڸ� �Է¹ް�
		 * �ڸ��� ������� ��� ���ڸ� ���Ѱ��� ������ּ���
		 * (/, %������, while���� �̿����ּ���)
		 * �Է� : 12345
		 * ��� : 1 + 2 + 3 + 4 + 5 => 15
		 * 
		 * �Է� : 333
		 * ��� : 3 + 3 + 3 => 9
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int result = 0;
		
		while(num != 0){
			result += (num % 10);
			num /= 10;
		}
		
		System.out.println(result);
		sc.close();
	}
}
