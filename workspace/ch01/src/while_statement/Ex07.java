package while_statement;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		/* 10진수 정수를 입력받아서 2진수로
		 * 정수 입력 : 48 => 110000
		 * 48 % 2 => 0 * 1
		 * 24 % 2 => 0 * 10
		 * 12 % 2 => 0 * 100
		 * 6 % 2 => 0 * 1000
		 * 3 % 2 => 1 * 10000
		 * 1 % 2 => 1 * 100000
		 * 110000
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("십진수 입력 : ");
		int decimal = sc.nextInt();
		int binary = 0, digit = 0; //binary에 변환된 이진수 저장, digit은 자릿수
		while(decimal != 0) {
			binary += (decimal % 2) * Math.pow(10, digit);
			digit += 1;
			decimal /= 2;
		}
		System.out.println(binary);
		sc.close();
	}
}
