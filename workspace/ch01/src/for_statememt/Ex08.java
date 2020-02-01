package for_statememt;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		/* 회문수를 구하는 프로그램 제작
		 * 회문수 : 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수
		 * 
		 * 정수 입력 : 12321
		 * 회문수 입니다.
		 * 
		 * 정수입력 : 12345
		 * 회문수가 아닙니다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int tmp = num;
		int result = 0;
		//12321 => 0 + 1
		//1232 => 10 + 2
		//123 => 120 + 3
		//12 => 1230 + 2
		//1 => 12320 + 1
		for(;tmp > 0;) {
			result = result * 10 + tmp % 10;
			tmp /= 10;
		}
		if(num == result)
			System.out.println("회문수 맞음");
		else
			System.out.println("회문수 아님");
		
	}
}
