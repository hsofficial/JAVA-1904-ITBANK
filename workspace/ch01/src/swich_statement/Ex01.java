package swich_statement;

public class Ex01 {
	public static void main(String[] args) {
		int choice = 2;
		
		switch(choice) {
		case 1:
			System.out.println("�׶�");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("�����佺");
			break;
		default: //else���� ����
			System.out.println("�� �ۿ�..");
		}
	}
}
