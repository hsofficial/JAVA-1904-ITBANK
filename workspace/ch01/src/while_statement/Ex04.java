package while_statement;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;//�ܾ�
		boolean run = true;
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.�Ա� | 2.��� | 3.�ܾ� | 4.���� ");
			System.out.println("------------------------------");
			System.out.print(">> ");
			int choice = sc.nextInt();
			switch (choice) {
			
			case 1:
				System.out.print("�Աݾ� : ");
				int deposit = sc.nextInt();
				if(deposit <= 0)
					System.out.println("�߸��� �Է��Դϴ�.");
				else {
					System.out.println(deposit + "�� �ԱݵǾ����ϴ�.");
					balance += deposit;
				}
				break;
				
			case 2:
				System.out.print("��ݾ� : ");
				int withdraw = sc.nextInt();
				if(withdraw <= balance) {//��ݾ��� �ܰ� �����̸� ���
					balance -= withdraw;
					System.out.println(withdraw + "�� ��ݵǾ����ϴ�.");
				}
				else
					System.out.println("����� �� �����ϴ�.");
				
			case 3:
				DecimalFormat df = new DecimalFormat("#,###");
				System.out.println("�ܾ� : " + df.format(balance));
				break;
				
			case 4:
				System.out.println("����� ���α׷��� �����մϴ�.");
				run = false;
				break;
			
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
			}
		}
	}

}
