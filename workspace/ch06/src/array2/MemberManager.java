package array2;

import java.util.Scanner;

//���� Ŭ���� : �迭�� ����� �޼ҵ带 �����ϴ� Ŭ����
public class MemberManager {
	//�� Ŭ������ �޼������ ���� static�� ���
	//MemberExample���� ���� MemberManager��ü�� �ȸ��� ����� ���
	private static Member[] members = new Member[] {
			new Member("������", "dlwlrma", "1111", 27),
			new Member("������", "dlwldms", "2222", 26),
			new Member("������", "dlwlehd", "3333", 25)
	};
	//�Ʒ��� �޼��忡 ��ĳ�� ��ü�� �ٰ��� ����
	private static Scanner sc= new Scanner(System.in);
	
	public static void searchId() {
		System.out.println("[���̵� ã��]");
		System.out.print("���̵� �Է� : ");
		String input = sc.next();
		for(int i = 0; i < members.length; i ++) {
			if(members[i].getId().equals(input)) {
				System.out.println("ȸ���Դϴ�.");
				System.out.println("--------------------------");
				return;//�޼ҵ� ����
			}
		}
		System.out.println("ȸ���� �ƴմϴ�.");
		System.out.println("--------------------------");
	}

	public static void changeId() {
		System.out.println("[���̵� ����]");
		System.out.print("���� ���̵� �Է� : ");
		String input = sc.next();
		for(int i = 0; i < members.length; i ++) {
			if(input.equals(members[i].getId())) {
				System.out.print("������ ���̵� �Է� : ");
				String change = sc.next();
				members[i].setId(change);
				System.out.println("--------------------------");
				return;
			}
		}
		System.out.println("�����ڰ� �ƴմϴ�");
		System.out.println("--------------------------");
	}

	public static void login() {
		// id pw �Է� >>> �� �� ������ �α���
		// �ٸ��� ���� �޽��� ���
		System.out.println("[�α���]");
		System.out.print("���̵� : ");
		String id = sc.next();
		System.out.print("��й�ȣ : ");
		String password = sc.next();
		for(int i = 0; i < members.length; i ++) {
			if(id.equals(members[i].getId())&&password.equals(members[i].getPassword())) {
				System.out.println("�α��� ����");
				System.out.println("--------------------------");
				return;
			}
		}
		System.out.println("���̵� / ��й�ȣ�� Ȯ�����ּ���");
		System.out.println("--------------------------");
	}
}
