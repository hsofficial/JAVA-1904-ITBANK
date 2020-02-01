package array2;

import java.util.Scanner;

//구현 클래스 : 배열을 만들고 메소드를 정의하는 클래스
public class MemberManager {
	//이 클래스의 메서드들을 전부 static로 사용
	//MemberExample에서 굳이 MemberManager객체를 안만들어도 기능을 사용
	private static Member[] members = new Member[] {
			new Member("이지금", "dlwlrma", "1111", 27),
			new Member("이지은", "dlwldms", "2222", 26),
			new Member("이지동", "dlwlehd", "3333", 25)
	};
	//아래의 메서드에 스캐너 객체를 다같이 공유
	private static Scanner sc= new Scanner(System.in);
	
	public static void searchId() {
		System.out.println("[아이디 찾기]");
		System.out.print("아이디 입력 : ");
		String input = sc.next();
		for(int i = 0; i < members.length; i ++) {
			if(members[i].getId().equals(input)) {
				System.out.println("회원입니다.");
				System.out.println("--------------------------");
				return;//메소드 종료
			}
		}
		System.out.println("회원이 아닙니다.");
		System.out.println("--------------------------");
	}

	public static void changeId() {
		System.out.println("[아이디 변경]");
		System.out.print("기존 아이디를 입력 : ");
		String input = sc.next();
		for(int i = 0; i < members.length; i ++) {
			if(input.equals(members[i].getId())) {
				System.out.print("변경할 아이디 입력 : ");
				String change = sc.next();
				members[i].setId(change);
				System.out.println("--------------------------");
				return;
			}
		}
		System.out.println("가입자가 아닙니다");
		System.out.println("--------------------------");
	}

	public static void login() {
		// id pw 입력 >>> 둘 다 같으면 로그인
		// 다르면 오류 메시지 출력
		System.out.println("[로그인]");
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		for(int i = 0; i < members.length; i ++) {
			if(id.equals(members[i].getId())&&password.equals(members[i].getPassword())) {
				System.out.println("로그인 성공");
				System.out.println("--------------------------");
				return;
			}
		}
		System.out.println("아이디 / 비밀번호를 확인해주세요");
		System.out.println("--------------------------");
	}
}
