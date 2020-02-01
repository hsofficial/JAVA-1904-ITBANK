package array3;

import java.util.Scanner;

public class CarExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean button = true;
		while (button) {
			System.out.println("---------------------");
			System.out.println("[중고차 프로그램]");
			System.out.println("1. 중고차 등록");
			System.out.println("2. 중고차 삭제");
			System.out.println("3. 중고차 가격 변경");
			System.out.println("4. 중고차 목록");
			System.out.println("5. 종료");
			System.out.println("---------------------");
			System.out.print("메뉴 선택 > > > > ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				CarManager.registration();
				break;
			case 2:
				CarManager.remove();
				break;
			case 3:
				CarManager.changeprice();
				break;
				
			case 4:
				CarManager.list();
				break;
				
			case 5:
				System.out.println("---------------------");
				System.out.println("프로그램을 종료합니다.");
				System.out.println("---------------------");
				button = false;
				sc.close();
				break;

			default:
				break;
			}
		}
	}

}
