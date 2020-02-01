package function;

import java.util.Scanner;

public class Ex04 {
	//전역변수 : C언어에서는 main함수 위에 선언 => 모든 함수에서 사용
	//파이썬 : global명령어
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String[] books = new String[50]; //책을 저장할 배열 50칸
		boolean run = true;
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1. 책 등록");
			System.out.println("2. 책 목록");
			System.out.println("3. 책 검색");
			System.out.println("4. 프로그램 종료");
			System.out.print(">> ");
			int select = Integer.parseInt(sc.nextLine());
			System.out.println("-------------------------");
			switch (select) {
			case 1:
				registration(books);
				break;
			case 2:
				list(books);
				break;
			case 3:
				search(books);
				break;
			case 4:
				System.out.println("도서 프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
	private static void registration(String[] books) {
		//C언어때는 배열을 선언 => 배열에 쓰레기값이 드가죠?
		//String, 참조타입으로 배열을 만들었어 => null이 들어가져 있어요
		//[0] 보노보노처럼 살다니 다행이야
		//[1] 원피스
		//[49] null
		System.out.println("[ 도서 등록 ]");
		for(int i = 0; i < books.length; i ++) {
			if(books[i] == null) {
				System.out.print("책 이름 : ");
				books[i] = sc.nextLine();
				return;
			}
		}
	}
	private static void list(String[] books) {
		System.out.println("[ 도서 목록 ]");
		//배열의 마지막요속 까지 그리고 i번째 요소가 비어있지 않으면
		for(int i = 0; i < books.length && books[i] != null ; i++) {
			System.out.println(books[i]);
		}
	}
	private static void search(String[] books) {
		System.out.println("[ 도서 검색 ]");
		System.out.print("검색할 도서 이름을 입력 : ");
		String title = sc.nextLine();
		for(int i = 0; i < books.length && books[i] != null; i ++) {
			if(books[i].equals(title)) {
				System.out.println(title + "은 등록되어 있습니다!");
				return;
			}
		}
		System.out.println(title + "은 등록되어 있지 않습니다!");
	}
}






