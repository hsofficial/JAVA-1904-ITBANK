package input;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�ڹٰ� �����ϰ� ������ �Է� => ���ڿ��� �Է� => ���ڷ� ��ȯ
		//sc.nextInt() : ������ �ٷ� �����ϴ� �޼ҵ�
		
		System.out.print("���� �Է� : ");
		int num1 = sc.nextInt();
//		String str1 = sc.nextLine();
		
		System.out.print("���� �Է� : ");
		int num2 = sc.nextInt();
//		String str2 = sc.nextLine();
		
		//Integer class >>> parseInt �޼��� : ���ڿ� ������ ��ȯ
//		int num1 = Integer.parseInt(str1);
//		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1 + num2);
		
		sc.close();
	}

}
