package input;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		/* 실수 1개와 정수 1개를 입력받고, 두 수의 곱을 소수점 1자리까지 표시
		 * Decimalformat 사용
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 입력 : ");
		double num2 = sc.nextDouble();
		
		double multi = num1 * num2;
		
		DecimalFormat df = new DecimalFormat("#.0");
		String a = df.format(multi);
		System.out.println("실수와 정수의 곱 : " + a);
		
		sc.close();
		
	}
}
