package array2;

import java.util.Scanner;

//실행 클래스
public class MemberExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("--------------------------");
			System.out.println("1. 아이디 찾기");
			System.out.println("2. 아이디 변경");
			System.out.println("3. 로그인");
			System.out.println("4. 종료");
			System.out.println("--------------------------");
			System.out.print(">> ");
			int select = sc.nextInt();
			if(select == 1)
				MemberManager.searchId();
			else if(select == 2)
				MemberManager.changeId();
			else if(select == 3)
				MemberManager.login();
			else if(select == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
