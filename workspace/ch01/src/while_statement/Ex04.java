package while_statement;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;//잔액
		boolean run = true;
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.입금 | 2.출금 | 3.잔액 | 4.종료 ");
			System.out.println("------------------------------");
			System.out.print(">> ");
			int choice = sc.nextInt();
			switch (choice) {
			
			case 1:
				System.out.print("입금액 : ");
				int deposit = sc.nextInt();
				if(deposit <= 0)
					System.out.println("잘못된 입력입니다.");
				else {
					System.out.println(deposit + "원 입금되었습니다.");
					balance += deposit;
				}
				break;
				
			case 2:
				System.out.print("출금액 : ");
				int withdraw = sc.nextInt();
				if(withdraw <= balance) {//출금액이 잔고 이하이면 출금
					balance -= withdraw;
					System.out.println(withdraw + "원 출금되었습니다.");
				}
				else
					System.out.println("출금할 수 없습니다.");
				
			case 3:
				DecimalFormat df = new DecimalFormat("#,###");
				System.out.println("잔액 : " + df.format(balance));
				break;
				
			case 4:
				System.out.println("입출금 프로그램을 종료합니다.");
				run = false;
				break;
			
		default:
			System.out.println("잘못된 입력입니다.");
			break;
			}
		}
	}

}
