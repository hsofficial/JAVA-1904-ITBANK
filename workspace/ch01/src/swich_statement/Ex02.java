package swich_statement;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		String position = sc.nextLine();
		
		//java ver7 ���� string ��밡��
		switch (position) {
		case "����":
			System.out.println("1��");
			break;
		case "����":
			System.out.println("5000����");
			break;
		case "����":
			System.out.println("4000����");
			break;
		case "���":
			System.out.println("3000����");
			break;
		default: //��
			System.out.println("0��");
			break;
		}
		sc.close();
	}
}
