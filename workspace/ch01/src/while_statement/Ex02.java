package while_statement;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//while에 label을 붙여줌
		outside:while(true) { //무한반복문 : break를 써줘야되요
			System.out.println("[메뉴]");
			System.out.println("1.아메리카노 | 2.카페라떼 | 3.모카 | 4.종료");
			System.out.println(">>>");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("5,500원");
				break;
			case 2:
				System.out.println("6,000원");
				break;
			case 3:
				System.out.println("6,500원");
				break;
			case 4:
				System.out.println("종료합니다.");
				break outside; //outside가 깨짐
			}
		}
	}
}
