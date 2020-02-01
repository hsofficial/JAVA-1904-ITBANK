package function;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		String[] db = new String[] {"kgitbank","pagodaitbank","busan",null};
		System.out.print("아이디 입력 : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		boolean is = search(db, input); //search함수 호출(db의 주소, input)전달
		if(is)
			System.out.println(input + "으로 로그인 했습니다.");
		else
			System.out.println(input + "은 등록되지 않은 아이디입니다."); 
	}

	private static boolean search(String[] db, String input) {
		//함수가 종료되는 조건 : 1. 함수의 모든 코드가 실행이 됐을때
		//2. return을 만나면 종료
		for(int i = 0; i < db.length; i ++) {
			if(db[i].equals(input))
				return true; //일치하면 true를 반환하고 함수 종료
		}
		return false; //반복문이 끝나도록 return true를 못만나면 false
	}
}
