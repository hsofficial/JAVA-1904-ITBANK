package while_statement;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է�(,�� ������ �Է�) : ");
		String money = sc.nextLine();
		//"500,5000,50000"
		//["500","5000","50000"] => �迭�� ����
		String[] a = money.split(","); //","�� �������� ���ڿ��� ������ ���� �� ����
		money = "";
		int m = 0;
		int i = 0;
		while(i < a.length) {	//�迭.length : �迭�� ���� ��ȯ
			m += Integer.parseInt(a[i]);	//���������� �ٲ㼭 m�� �����ݴϴ�.
			i++;
		}
		System.out.println("�� �հ� : "+ m);
		sc.close();
	}

}
