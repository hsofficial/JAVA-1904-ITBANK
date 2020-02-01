package function;

import java.util.Scanner;

public class Ex04 {
	//�������� : C������ main�Լ� ���� ���� => ��� �Լ����� ���
	//���̽� : global��ɾ�
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String[] books = new String[50]; //å�� ������ �迭 50ĭ
		boolean run = true;
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1. å ���");
			System.out.println("2. å ���");
			System.out.println("3. å �˻�");
			System.out.println("4. ���α׷� ����");
			System.out.print(">> ");
			int select = Integer.parseInt(sc.nextLine());
			System.out.println("-------------------------");
			switch (select) {
			case 1:
				registration(books);
				break;
			case 2:
				list(books);
				break;
			case 3:
				search(books);
				break;
			case 4:
				System.out.println("���� ���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
	}
	private static void registration(String[] books) {
		//C���� �迭�� ���� => �迭�� �����Ⱚ�� �尡��?
		//String, ����Ÿ������ �迭�� ������� => null�� ���� �־��
		//[0] ���뺸��ó�� ��ٴ� �����̾�
		//[1] ���ǽ�
		//[49] null
		System.out.println("[ ���� ��� ]");
		for(int i = 0; i < books.length; i ++) {
			if(books[i] == null) {
				System.out.print("å �̸� : ");
				books[i] = sc.nextLine();
				return;
			}
		}
	}
	private static void list(String[] books) {
		System.out.println("[ ���� ��� ]");
		//�迭�� ��������� ���� �׸��� i��° ��Ұ� ������� ������
		for(int i = 0; i < books.length && books[i] != null ; i++) {
			System.out.println(books[i]);
		}
	}
	private static void search(String[] books) {
		System.out.println("[ ���� �˻� ]");
		System.out.print("�˻��� ���� �̸��� �Է� : ");
		String title = sc.nextLine();
		for(int i = 0; i < books.length && books[i] != null; i ++) {
			if(books[i].equals(title)) {
				System.out.println(title + "�� ��ϵǾ� �ֽ��ϴ�!");
				return;
			}
		}
		System.out.println(title + "�� ��ϵǾ� ���� �ʽ��ϴ�!");
	}
}






