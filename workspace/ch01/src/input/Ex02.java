package input;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//자바가 안전하게 정수를 입력 => 문자열로 입력 => 숫자로 변환
		//sc.nextInt() : 정수로 바로 저장하는 메소드
		
		System.out.print("숫자 입력 : ");
		int num1 = sc.nextInt();
//		String str1 = sc.nextLine();
		
		System.out.print("숫자 입력 : ");
		int num2 = sc.nextInt();
//		String str2 = sc.nextLine();
		
		//Integer class >>> parseInt 메서드 : 문자열 정수로 변환
//		int num1 = Integer.parseInt(str1);
//		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1 + num2);
		
		sc.close();
	}

}
