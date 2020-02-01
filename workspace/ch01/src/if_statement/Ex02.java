package if_statement;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/* 점수를 하나 입력받고 점수에 따른 학점을 출력
		 * 90 ~ 100 : "A학점"
		 * 80 ~ 89 : "B학점"
		 * 70 ~ 79 : "C학점"
		 * 60 ~ 69 : "D학점"
		 * 0 ~ 59 : "F학점"
		 * 
		 * 입력받은 점수가 음수이거나 100을 초과하면 에러메시지 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int num = sc.nextInt();
		
		if (num >= 90 && num<=100)
			System.out.println("A");
		else if(num>=80 && num<=89)
			System.out.println("B");
		else if(num>=70 && num<=79)
			System.out.println("C");
		else if(num>=60 && num<=69)
			System.out.println("D");
		else if(num>=0 && num<=59)
			System.out.println("F");
		else
			System.out.println("입력값은 1에서 100 사이여야 합니다");
		
	}
}
