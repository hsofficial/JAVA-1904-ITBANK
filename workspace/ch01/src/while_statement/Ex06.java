package while_statement;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		/* 숫자를 입력받고
		 * 자릿수 상관없이 모든 숫자를 더한값을 출력해주세요
		 * (/, %연산자, while문을 이용해주세요)
		 * 입력 : 12345
		 * 결과 : 1 + 2 + 3 + 4 + 5 => 15
		 * 
		 * 입력 : 333
		 * 결과 : 3 + 3 + 3 => 9
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int result = 0;
		
		while(num != 0){
			result += (num % 10);
			num /= 10;
		}
		
		System.out.println(result);
		sc.close();
	}
}
