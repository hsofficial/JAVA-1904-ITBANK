package function;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		String[] db = new String[] {"kgitbank","pagodaitbank","busan",null};
		System.out.print("���̵� �Է� : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		boolean is = search(db, input); //search�Լ� ȣ��(db�� �ּ�, input)����
		if(is)
			System.out.println(input + "���� �α��� �߽��ϴ�.");
		else
			System.out.println(input + "�� ��ϵ��� ���� ���̵��Դϴ�."); 
	}

	private static boolean search(String[] db, String input) {
		//�Լ��� ����Ǵ� ���� : 1. �Լ��� ��� �ڵ尡 ������ ������
		//2. return�� ������ ����
		for(int i = 0; i < db.length; i ++) {
			if(db[i].equals(input))
				return true; //��ġ�ϸ� true�� ��ȯ�ϰ� �Լ� ����
		}
		return false; //�ݺ����� �������� return true�� �������� false
	}
}
