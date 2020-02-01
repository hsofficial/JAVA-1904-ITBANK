package while_statement;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("[메뉴]");
			System.out.println("1.아메리카노 | 2.카페라떼 | 3.모카 | 4.종료");
			System.out.println(">>>");
			int select = sc.nextInt();
			if(select == 1)
				System.out.println("5,500원");
			else if(select == 2)
				System.out.println("6,000원");
			else if(select == 3)
				System.out.println("6,500원");
			else if(select == 4) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}
	}
}
