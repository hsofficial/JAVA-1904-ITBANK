package if_statement;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/* 1 ~ 100사이의 숫자를 하나 입력 받고,
		 * 입력 받은 값이 3의 배수이면 여러분의 성을
		 * 5의 배수이면 이름
		 * 3의 배수이면서 5의 배수이면 성과 이름을 모두 출력
		 * 잘못된 범위의 수를 입력받으면 에러메시지를 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		
		if(num < 0 || num > 100)
			System.out.println("잘못된 입력입니다.");
		else if(num % 3 == 0 && num % 5 == 0)
			System.out.println("나현수");
		else if(num % 3 == 0 && num % 5 != 0)
			System.out.println("나");
		else if(num % 3 != 0 && num % 5 == 0)
			System.out.println("현수");
		else
			System.out.println("***");
		
		sc.close();
	}
}
